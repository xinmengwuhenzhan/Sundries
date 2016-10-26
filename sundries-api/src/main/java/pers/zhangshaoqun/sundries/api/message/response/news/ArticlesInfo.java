package pers.zhangshaoqun.sundries.api.message.response.news;

/**
 * 图文信息
 */
public class ArticlesInfo {
  private String Title;
  private String Description;
  private String PicUrl;
  private String Url;

  /** 图文消息标题 */
  public String getTitle() {
    return Title;
  }

  public void setTitle(String title) {
    Title = title;
  }

  /** 图文消息描述 */
  public String getDescription() {
    return Description;
  }

  public void setDescription(String description) {
    Description = description;
  }

  /** 图片链接 */
  public String getPicUrl() {
    return PicUrl;
  }

  public void setPicUrl(String picUrl) {
    PicUrl = picUrl;
  }

  /** 点击图文消息跳转链接 */
  public String getUrl() {
    return Url;
  }

  public void setUrl(String url) {
    Url = url;
  }
}
