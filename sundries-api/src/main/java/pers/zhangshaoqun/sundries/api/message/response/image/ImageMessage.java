package pers.zhangshaoqun.sundries.api.message.response.image;

import pers.zhangshaoqun.sundries.api.message.response.BaseMessage;
import pers.zhangshaoqun.sundries.api.message.response.MediaMessage;

/**
 * 图片消息
 */
public class ImageMessage extends BaseMessage {
  private MediaMessage Image;

  /** 图片信息 */
  public MediaMessage getImage() {
    return Image;
  }

  public void setImage(MediaMessage image) {
    Image = image;
  }
}
