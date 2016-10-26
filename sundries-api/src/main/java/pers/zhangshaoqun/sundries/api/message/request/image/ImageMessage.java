package pers.zhangshaoqun.sundries.api.message.request.image;

import pers.zhangshaoqun.sundries.api.message.request.BaseMessage;

/**
 * 图片消息
 */
public class ImageMessage extends BaseMessage{
  private String PicUrl;
  private String MediaId;

  /** 图片链接 */
  public String getPicUrl() {
    return PicUrl;
  }

  public void setPicUrl(String picUrl) {
    PicUrl = picUrl;
  }

  /** 图片消息媒体id，可以调用多媒体文件下载接口拉取数据 */
  public String getMediaId() {
    return MediaId;
  }

  public void setMediaId(String mediaId) {
    MediaId = mediaId;
  }
}
