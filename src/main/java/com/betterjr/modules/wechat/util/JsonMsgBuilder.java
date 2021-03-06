package com.betterjr.modules.wechat.util;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.betterjr.modules.wechat.data.api.WechatPushTempField;
import com.betterjr.modules.wechat.data.message.Article;
import com.betterjr.modules.wechat.data.message.BasicMsg;
import com.betterjr.modules.wechat.data.message.ImageMsg;
import com.betterjr.modules.wechat.data.message.MusicMsg;
import com.betterjr.modules.wechat.data.message.NewsMsg;
import com.betterjr.modules.wechat.data.message.TextMsg;
import com.betterjr.modules.wechat.data.message.VideoMsg;
import com.betterjr.modules.wechat.data.message.VoiceMsg;

/**
 * 创建微信公众平台高级接口消息
 *
 * @author zhoucy
 */
public class JsonMsgBuilder {

    private static final Logger log = LoggerFactory.getLogger(JsonMsgBuilder.class);

    private final StringBuffer msgBuf = new StringBuffer("{");

    /**
     * 创建
     */
    public static JsonMsgBuilder create() {
        return new JsonMsgBuilder();
    }

    /**
     * 创建消息体前缀
     *
     * @param msg
     *            客服消息
     */
    void msgPrefix(final BasicMsg msg) {
        msgBuf.append("\"touser\":\"").append(msg.getToUserName()).append("\",");
        msgBuf.append("\"msgtype\":\"").append(msg.getMsgType()).append("\",");
    }

    /**
     * 文本客服消息
     *
     * @param msg
     *            文消息
     */
    public JsonMsgBuilder text(final TextMsg msg) {
        msgPrefix(msg);
        msgBuf.append("\"text\": {");
        msgBuf.append(" \"content\":\"").append(msg.getContent()).append("\"");
        msgBuf.append("}");
        return this;
    }

    /**
     * 图像客服消息
     *
     * @param msg
     *            图像消息
     */
    public JsonMsgBuilder image(final ImageMsg msg) {
        msgPrefix(msg);
        msgBuf.append("\"image\": {");
        msgBuf.append(" \"media_id\":\"").append(msg.getMediaId()).append("\"");
        msgBuf.append("}");
        return this;
    }

    /**
     * 语音客服消息
     *
     * @param msg
     *            语音
     */
    public JsonMsgBuilder voice(final VoiceMsg msg) {
        msgPrefix(msg);
        msgBuf.append("\"voice\": {");
        msgBuf.append(" \"media_id\":\"").append(msg.getMediaId()).append("\"");
        msgBuf.append("}");
        return this;
    }

    /**
     * 视频客服消息
     *
     * @param msg
     *            视频消息
     */
    public JsonMsgBuilder video(final VideoMsg msg) {
        msgPrefix(msg);
        msgBuf.append("\"video\": {");
        msgBuf.append(" \"media_id\":\"").append(msg.getMediaId()).append("\",");
        msgBuf.append(" \"thumb_media_id\":\"").append(msg.getThumbMediaId()).append("\",");
        msgBuf.append(" \"title\":\"").append(msg.getTitle()).append("\",");
        msgBuf.append(" \"description\":\"").append(msg.getDescription()).append("\"");
        msgBuf.append("}");
        return this;
    }

    /**
     * 音乐客服消息
     *
     * @param msg   音乐消息
     */
    public JsonMsgBuilder music(final MusicMsg msg) {
        msgPrefix(msg);
        msgBuf.append("\"music\": {");
        msgBuf.append(" \"title\":\"").append(msg.getTitle()).append("\",");
        msgBuf.append(" \"description\":\"").append(msg.getDescription()).append("\",");
        msgBuf.append(" \"musicurl\":\"").append(msg.getMusicUrl()).append("\",");
        msgBuf.append(" \"hqmusicurl\":\"").append(msg.getHQMusicUrl()).append("\",");
        msgBuf.append(" \"thumb_media_id\":\"").append(msg.getThumbMediaId()).append("\"");
        msgBuf.append("}");
        return this;
    }

    /**
     * 多图文客服消息
     *
     * @param msg   图文消息
     */
    public JsonMsgBuilder news(final NewsMsg msg) {
        msgPrefix(msg);
        final StringBuffer arts_buf = new StringBuffer("\"articles\": [");
        final StringBuffer art_buf = new StringBuffer();
        for (final Article art : msg.getArticles()) {
            art_buf.setLength(0);
            art_buf.append("{");
            art_buf.append(" \"title\":\"").append(art.getTitle()).append("\",");
            art_buf.append(" \"description\":\"").append(art.getDescription()).append("\",");
            art_buf.append(" \"picurl\":\"").append(art.getPicUrl()).append("\",");
            art_buf.append(" \"url\":\"").append(art.getUrl());
            art_buf.append("\"},");
        }
        art_buf.deleteCharAt(art_buf.lastIndexOf(","));
        arts_buf.append(art_buf);
        arts_buf.append("]");
        msgBuf.append("\"news\": {");
        msgBuf.append(arts_buf);
        msgBuf.append("}");
        return this;
    }

    /**
     * 模板消息
     *
     * @param openId
     *            接收者
     * @param tmlId
     *            模板Id
     * @param topColor
     *            顶部颜色
     * @param url
     *            链接地址
     * @param tmls
     *            模板数据
     */
    public JsonMsgBuilder template(final String openId, final String tmlId, final String topColor, final String url,
            final Collection<WechatPushTempField> anTmls) {
        msgBuf.append("\"touser\":\"").append(openId).append("\",");
        msgBuf.append("\"template_id\":\"").append(tmlId).append("\",");
        msgBuf.append("\"url\":\"").append(url).append("\",");
        msgBuf.append("\"topcolor\":\"").append(topColor).append("\",");
        msgBuf.append("\"data\":{");

        final StringBuffer data = new StringBuffer("");
        for (final WechatPushTempField t : anTmls) {
            data.append(t.templateData()).append(",");
        }
        data.deleteCharAt(data.lastIndexOf(","));
        msgBuf.append(data);
        msgBuf.append("}");
        return this;
    }

    /**
     * 输出消息
     *
     * @return json格式消息
     */
    public String build() {
        msgBuf.append("}");
        if (log.isDebugEnabled()) {
            log.debug("Json message content: %s", msgBuf);
        }
        return new String(msgBuf);
    }
}
