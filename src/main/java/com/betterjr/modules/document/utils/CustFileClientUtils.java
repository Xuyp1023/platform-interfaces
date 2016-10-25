package com.betterjr.modules.document.utils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import com.betterjr.common.config.ParamNames;
import com.betterjr.common.data.KeyAndValueObject;
import com.betterjr.common.exception.BettjerIOException;
import com.betterjr.common.exception.BytterTradeException;
import com.betterjr.common.selectkey.SerialGenerator;
import com.betterjr.common.service.FreemarkerService;
import com.betterjr.common.service.SpringContextHolder;
import com.betterjr.common.utils.BetterStringUtils;
import com.betterjr.common.utils.FileUtils;
import com.betterjr.common.utils.MimeTypesHelper;
import com.betterjr.modules.document.entity.CustFileItem;
//import com.betterjr.modules.sys.service.SysConfigService;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.Pipeline;
import com.itextpdf.tool.xml.XMLWorker;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.itextpdf.tool.xml.html.Tags;
import com.itextpdf.tool.xml.parser.XMLParser;
import com.itextpdf.tool.xml.pipeline.css.CSSResolver;
import com.itextpdf.tool.xml.pipeline.css.CssResolverPipeline;
import com.itextpdf.tool.xml.pipeline.end.PdfWriterPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;

public abstract class CustFileClientUtils {
    private static final Logger logger = LoggerFactory.getLogger(CustFileClientUtils.class);

    /**
     * 将上传的文件持续化。
     *
     * @param anFileInfo
     * @param anInput
     * @return
     */
    public static boolean saveFileStream(final KeyAndValueObject anFileInfo, final InputStream anInput) {
        final File tmpFile = (File) anFileInfo.getValue();
        FileOutputStream outStream = null;
        try {
            outStream = new FileOutputStream(tmpFile);
            IOUtils.copy(anInput, outStream);
            return true;
        }
        catch (final IOException ex) {
            tmpFile.delete();
            return false;
        }
        finally {
            IOUtils.closeQuietly(outStream);
        }
    }

    /**
     * 下载文件
     *
     * @param response
     * @param anFileItem
     */
    public static void fileDownload(final HttpServletResponse response, final CustFileItem anFileItem,final String basePath) {

        fileDownloadWithOpenType(response, anFileItem, null,basePath);
    }

    public static void fileDownloadWithOpenType(final HttpServletResponse response, final CustFileItem anFileItem, final String anOpenType,final String basePath) {
        OutputStream os = null;
        String msg = null;
        try {
            if (anFileItem != null) {
                final File file = FileUtils.getRealFile(basePath + anFileItem.getFilePath());
                if (file != null) {
                    String openType = anOpenType;
                    if (BetterStringUtils.isBlank(openType)) {
                        if (anFileItem.isInner(MimeTypesHelper.getMimeType(anFileItem.getFileType()))) {
                            openType = "inline";
                        }
                        else {
                            openType = "attachment";
                        }
                    }
                    final String fileName = anFileItem.getFileName();
                    final StringBuilder sb = new StringBuilder(100);
                    sb.append(openType).append("; ").append("filename=").append(java.net.URLEncoder.encode(fileName, "UTF-8"));
                    os = response.getOutputStream();
                    response.setHeader("Content-Disposition", sb.toString());
                    response.setContentType(anFileItem.getFileType());
                    FileUtils.copyFile(file, os);
                    return;
                }
                else {
                    msg = "file does not exist";
                }
            }
            else {
                msg = "No information was obtained for the download file";
            }
        }
        catch (final IOException e) {
            logger.error("下载文件失败，请检查；" + anFileItem, e);
            msg = "出现IO异常，请稍后再试!";
        }
        finally {
            if (msg != null) {
                response.reset();
                response.setContentType("text/html;UTF-8");
                try {
                    response.getWriter().append(msg);
                }
                catch (final IOException e) {
                    e.printStackTrace();
                }
            }
            IOUtils.closeQuietly(os);
        }
    }


    public static void fileDownloadWithFileName(final HttpServletResponse anResponse, final  byte[] anData, final String anFileName) {
        String msg = null;
        OutputStream os = null;
        try (InputStream is = new ByteArrayInputStream(anData)){
            final StringBuilder sb = new StringBuilder(100);
            sb.append("attachment").append("; ").append("filename=").append(java.net.URLEncoder.encode(anFileName, "UTF-8"));
            os = anResponse.getOutputStream();
            anResponse.setHeader("Content-Disposition", sb.toString());
            anResponse.setContentType("cer");
            IOUtils.copy(is, os);
            return;
        }
        catch (final IOException e) {
            logger.error("下载文件失败，请检查；" + anFileName, e);
            msg = "出现IO异常，请稍后再试!";
        }
        finally {
            if (msg != null) {
                anResponse.reset();
                anResponse.setContentType("text/html;UTF-8");
                try {
                    anResponse.getWriter().append(msg);
                }
                catch (final IOException e) {
                    logger.error("关闭文件流失败；" + anFileName, e);
                }
            }
            IOUtils.closeQuietly(os);
        }
    }

    public static void directExportPDF(final String anOutFileName, final Map<String, Object> anParam, final HttpServletResponse response, final String anModeFile,
            final String anModeName) {
        final FreemarkerService markerService = SpringContextHolder.getBean(FreemarkerService.class);
        final StringBuffer data = markerService.processTemplateByFileNameUnderModule(anModeFile, anParam, anModeName);
        String msg = null;
        try {
            response.reset();
            response.setContentType("application/pdf");
            response.setHeader("Content-Disposition", "attachment; filename=" + java.net.URLEncoder.encode(anOutFileName, "UTF-8"));
            exportPDF(data, response.getOutputStream());
        }
        catch (final IOException e) {
            msg = "出现文件异常，请稍后再试!";
        }
        catch (final BettjerIOException e) {
            msg = e.getMessage();
        }
        finally {
            if (msg != null) {
                try {
                    response.reset();
                    response.setContentType("text/html;UTF-8");
                    response.getWriter().append(msg);
                }
                catch (final IOException e) {
                    logger.error("directExportPDF can't output exception message", e);
                }
            }
        }
    }

    /**
     * 根据保存的文件信息，产生PDF文件。
     *
     * @param anSb
     * @param anFileInfo
     * @return
     */
    public static boolean exportPDF(final StringBuffer anSb, final KeyAndValueObject anFileInfo) {
        final File tmpFile = (File) anFileInfo.getValue();
        OutputStream out = null;
        try {
            out = new FileOutputStream(tmpFile);
            exportPDF(anSb, out);
            return true;
        }
        catch (final BytterTradeException ex) {

            throw ex;
        }
        catch (final Exception ex) {
            logger.error("exportPDF has error", ex);
            return false;
        }
        finally {
            IOUtils.closeQuietly(out);
        }
    }

    /**
     * 输出PDF文件
     * @param anSb
     * @param anOut
     */
    public static void exportPDF(final StringBuffer anSb, final OutputStream anOut) {
        final Document document = new Document(PageSize.A4, 0, 0, 0, 0);
        document.setMargins(0, 0, 0, 0);
        System.out.println(anSb.toString());
        PdfWriter pdfwriter = null;
        try {
            pdfwriter = PdfWriter.getInstance(document, anOut);
            pdfwriter.setViewerPreferences(PdfWriter.HideToolbar);
            document.open();
            document.newPage();
            final HtmlPipelineContext htmlContext = new HtmlPipelineContext(null);

            htmlContext.setTagFactory(Tags.getHtmlTagProcessorFactory());
            final CSSResolver cssResolver = XMLWorkerHelper.getInstance().getDefaultCssResolver(true);
            final Pipeline pipeline = new CssResolverPipeline(cssResolver, new HtmlPipeline(htmlContext, new PdfWriterPipeline(document, pdfwriter)));

            final XMLWorker worker = new XMLWorker(pipeline, true);
            final XMLParser p = new XMLParser(worker);
            System.out.println(anSb.toString());
            final StringReader reader = new StringReader(anSb.toString());
            p.parse(reader);
            p.flush();
        }
        catch (IOException | DocumentException ex) {
            throw new BytterTradeException(30002, "产生PDF报告文件出现异常，请稍后再试", ex);
        }
        finally {
            document.close();
            pdfwriter.close();
        }
    }

    private static CustFileItem createDefFileItem(final KeyAndValueObject anFileInfo, final String anWorkType, final String anFileName) {
        final CustFileItem fileItem = new CustFileItem();
        fileItem.setId(SerialGenerator.getLongValue("CustFileItem.id"));
        final File tmpFile = (File) anFileInfo.getValue();
        fileItem.setAbsoFile(tmpFile);
        fileItem.setFileLength(tmpFile.length());
        fileItem.setFilePath(anFileInfo.getStrKey());
        fileItem.setFileInfoType(anWorkType);
        fileItem.setFileName(anFileName);
        fileItem.setBatchNo(0L);
        fileItem.setFileType(FileUtils.extractFileExt(anFileName));

        return fileItem;
    }

    /**
     * 创建上传文件的信息
     *
     * @param anFileInfo
     *            文件路径信息
     * @param anWorkType
     *            文档业务类型
     * @param anFileName
     *            文件名称
     * @param anFileType
     *            文件类型
     * @return
     */
    public static CustFileItem createUploadFileItem(final KeyAndValueObject anFileInfo, final String anWorkType, final String anFileName) {
        final CustFileItem fileItem = createDefFileItem(anFileInfo, anWorkType, anFileName);

        return fileItem;
    }
}