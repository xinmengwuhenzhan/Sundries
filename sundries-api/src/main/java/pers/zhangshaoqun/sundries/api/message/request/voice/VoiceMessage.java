package pers.zhangshaoqun.sundries.api.message.request.voice;

import pers.zhangshaoqun.sundries.api.message.request.BaseMessage;

/**
 * 语音消息
 */
public class VoiceMessage extends BaseMessage {
  private String MediaId;
  private String Format;
  private String Recognition;

  /** 语音消息媒体id，可以调用多媒体文件下载接口拉取数据 */
  public String getMediaId() {
    return MediaId;
  }

  public void setMediaId(String mediaId) {
    MediaId = mediaId;
  }

  /** 语音格式 */
  public String getFormat() {
    return Format;
  }

  public void setFormat(String format) {
    Format = format;
  }

  /** 语音识别结果，UTF8编码 */
  public String getRecognition() {
    return Recognition;
  }

  public void setRecognition(String recognition) {
    Recognition = recognition;
  }
}
