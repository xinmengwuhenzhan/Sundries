package pers.zhangshaoqun.sundries.api.message.request.video;

import pers.zhangshaoqun.sundries.api.message.request.BaseMessage;

/**
 * 视频消息和小视频消息
 */
public class VideoMessage extends BaseMessage{

  private String MediaId;
  private String ThumbMediaId;

  /** 视频消息媒体id */
  public String getMediaId() {
    return MediaId;
  }

  public void setMediaId(String mediaId) {
    MediaId = mediaId;
  }

  /** 视频消息缩略图的媒体id */
  public String getThumbMediaId() {
    return ThumbMediaId;
  }

  public void setThumbMediaId(String thumbMediaId) {
    ThumbMediaId = thumbMediaId;
  }
}
