package com.betterjr.modules.document.entity;

import java.io.File;

import com.betterjr.common.annotation.*;
import com.betterjr.common.entity.BetterjrEntity;
import com.betterjr.common.selectkey.SerialGenerator;
import com.betterjr.common.utils.BetterStringUtils;
import com.betterjr.common.utils.FileUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Access(AccessType.FIELD)
@Entity
@Table(name = "T_CUST_FILEITEM")
public class CustFileItem implements BetterjrEntity {
    /**
     * 编号
     */
    @Id
    @Column(name = "ID", columnDefinition = "INTEGER")
    @MetaData(value = "编号", comments = "编号")
    private Long id;

    /**
     * 上传的批次号，对应fileinfo中的ID
     */
    @Column(name = "N_BATCHNO", columnDefinition = "INTEGER")
    @MetaData(value = "上传的批次号", comments = "上传的批次号，对应fileinfo中的ID")
    private Long batchNo;

    /**
     * 文件名称
     */
    @Column(name = "C_FILENAME", columnDefinition = "VARCHAR")
    @MetaData(value = "文件名称", comments = "文件名称")
    private String fileName;

    /**
     * 文件类型
     */
    @Column(name = "C_FILETYPE", columnDefinition = "VARCHAR")
    @MetaData(value = "文件类型", comments = "文件类型")
    private String fileType;

    /**
     * 保存的文件编码
     */
    @Column(name = "C_FILENO", columnDefinition = "VARCHAR")
    @MetaData(value = "保存的文件编码", comments = "保存的文件编码")
    private String fileNo;

    /**
     * 保存文件路径，相对路径
     */
    
    @JsonIgnore
    @Column(name = "C_FILEPATH", columnDefinition = "VARCHAR")
    @MetaData(value = "保存文件路径", comments = "保存文件路径，相对路径")
    private String filePath;

    /**
     * 文件大小
     */
    @Column(name = "N_LENGTH", columnDefinition = "INTEGER")
    @MetaData(value = "文件大小", comments = "文件大小")
    private Long fileLength;

    /**
     * 注册日期
     */
    @Column(name = "D_REGDATE", columnDefinition = "VARCHAR")
    @MetaData(value = "注册日期", comments = "注册日期")
    private String regDate;

    /**
     * 注册时间
     */
    @Column(name = "D_REGTIME", columnDefinition = "VARCHAR")
    @MetaData(value = "注册时间", comments = "注册时间")
    private String regTime;

    /**
     * 
     */
    @Column(name = "C_FILEINFOTYPE", columnDefinition = "VARCHAR")
    @MetaData(value = "文件信息类型", comments = "文件信息类")
    private String fileInfoType;

    @Transient
    private CustFileInfo fileInfo;

    @Transient 
    @JsonIgnore
    private File absoFile;
    
    private static final long serialVersionUID = 1440667936398L;

    public CustFileInfo getFileInfo() {
        return this.fileInfo;
    }

    public void setFileInfo(CustFileInfo anFileInfo) {
        this.fileInfo = anFileInfo;
    }

    public String getFileInfoType() {
        return this.fileInfoType;
    }

    public void setFileInfoType(String anFileInfoType) {
        this.fileInfoType = anFileInfoType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(Long batchNo) {
        this.batchNo = batchNo;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public String getFileNo() {
        return fileNo;
    }

    public void setFileNo(String fileNo) {
        this.fileNo = fileNo == null ? null : fileNo.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public Long getFileLength() {
        return fileLength;
    }

    public void setFileLength(Long fileLength) {
        this.fileLength = fileLength;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate == null ? null : regDate.trim();
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime == null ? null : regTime.trim();
    }

    public File getAbsoFile() {
        return this.absoFile;
    }

    public void setAbsoFile(File anAbsoFile) {
        this.absoFile = anAbsoFile;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", batchNo=").append(batchNo);
        sb.append(", fileName=").append(fileName);
        sb.append(", fileType=").append(fileType);
        sb.append(", fileNo=").append(fileNo);
        sb.append(", filePath=").append(filePath);
        sb.append(", fileLength=").append(fileLength);
        sb.append(", regDate=").append(regDate);
        sb.append(", regTime=").append(regTime);
        sb.append(", fileInfoType=").append(fileInfoType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CustFileItem other = (CustFileItem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getBatchNo() == null ? other.getBatchNo() == null : this.getBatchNo().equals(other.getBatchNo()))
                && (this.getFileName() == null ? other.getFileName() == null : this.getFileName().equals(other.getFileName()))
                && (this.getFileType() == null ? other.getFileType() == null : this.getFileType().equals(other.getFileType()))
                && (this.getFileNo() == null ? other.getFileNo() == null : this.getFileNo().equals(other.getFileNo()))
                && (this.getFilePath() == null ? other.getFilePath() == null : this.getFilePath().equals(other.getFilePath()))
                && (this.getFileLength() == null ? other.getFileLength() == null : this.getFileLength().equals(other.getFileLength()))
                && (this.getRegDate() == null ? other.getRegDate() == null : this.getRegDate().equals(other.getRegDate()))
                && (this.getRegTime() == null ? other.getRegTime() == null : this.getRegTime().equals(other.getRegTime()))
                && (this.getFileInfoType() == null ? other.getFileInfoType() == null : this.getFileInfoType().equals(other.getFileInfoType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBatchNo() == null) ? 0 : getBatchNo().hashCode());
        result = prime * result + ((getFileName() == null) ? 0 : getFileName().hashCode());
        result = prime * result + ((getFileType() == null) ? 0 : getFileType().hashCode());
        result = prime * result + ((getFileNo() == null) ? 0 : getFileNo().hashCode());
        result = prime * result + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        result = prime * result + ((getFileLength() == null) ? 0 : getFileLength().hashCode());
        result = prime * result + ((getRegDate() == null) ? 0 : getRegDate().hashCode());
        result = prime * result + ((getRegTime() == null) ? 0 : getRegTime().hashCode());
        result = prime * result + ((getFileInfoType() == null) ? 0 : getFileInfoType().hashCode());
        return result;
    }

    public boolean isInner() {

        return isInner(null);
    }

    public boolean isInner(String anType) {
        if (BetterStringUtils.isBlank(anType)) {
            anType = this.fileType;
        }
        if (BetterStringUtils.isNotBlank(anType)) {
            String[] arrStr = new String[] { "image", "text", "html", "plain" };
            for (String tmpStr : arrStr) {
                if (anType.indexOf(tmpStr) > -1) {
                    return true;
                }
            }
        }

        return false;
    }
    
    public void initDuplicateConflictValue(CustFileItem anFileItem) {
        this.id = (SerialGenerator.getLongValue("CustFileItem.id"));
        this.fileLength = anFileItem.getFileLength();
        this.fileInfoType = anFileItem.getFileInfoType();
        this.filePath = anFileItem.getFilePath();
        this.fileName = anFileItem.getFileName();
        this.fileType = anFileItem.getFileType();
    }



}