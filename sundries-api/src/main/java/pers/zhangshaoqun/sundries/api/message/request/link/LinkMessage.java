package pers.zhangshaoqun.sundries.api.message.request.link;

import pers.zhangshaoqun.sundries.api.message.request.BaseMessage;

/**
 * 链接消息
 */
public class LinkMessage extends BaseMessage {
  private String Title;
  private String Description;
  private String Url;

  /** 消息标题 */
  public String getTitle() {
    return Title;
  }

  public void setTitle(String title) {
    Title = title;
  }

  /** 消息描述 */
  public String getDescription() {
    return Description;
  }

  public void setDescription(String description) {
    Description = description;
  }

  /** 消息链接 */
  public String getUrl() {
    return Url;
  }

  public void setUrl(String url) {
    Url = url;
  }
}
