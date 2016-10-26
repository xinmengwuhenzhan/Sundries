package pers.zhangshaoqun.sundries.api.message.response.video;

import pers.zhangshaoqun.sundries.api.message.response.MediaMessage;

/**
 * 视频信息
 */
public class VideoInfo extends MediaMessage {
  private String Title;
  private String Description;

  /** 视频消息的标题 */
  public String getTitle() {
    return Title;
  }

  public void setTitle(String title) {
    Title = title;
  }

  /** 视频消息的描述 */
  public String getDescription() {
    return Description;
  }

  public void setDescription(String description) {
    Description = description;
  }
}
