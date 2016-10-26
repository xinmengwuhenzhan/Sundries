package pers.zhangshaoqun.sundries.api.message.response.music;

/**
 * 音乐信息
 */
public class MusicInfo {
  private String Title;
  private String Description;
  private String MusicURL;
  private String HQMusicUrl;
  private String ThumbMediaId;

  /** 音乐标题 */
  public String getTitle() {
    return Title;
  }

  public void setTitle(String title) {
    Title = title;
  }

  /** 音乐描述 */
  public String getDescription() {
    return Description;
  }

  public void setDescription(String description) {
    Description = description;
  }

  /** 音乐链接 */
  public String getMusicURL() {
    return MusicURL;
  }

  public void setMusicURL(String musicURL) {
    MusicURL = musicURL;
  }

  /** 高质量音乐链接，WIFI环境优先使用该链接播放音乐 */
  public String getHQMusicUrl() {
    return HQMusicUrl;
  }

  public void setHQMusicUrl(String HQMusicUrl) {
    this.HQMusicUrl = HQMusicUrl;
  }

  /** 缩略图的媒体id，通过素材管理中的接口上传多媒体文件，得到的id */
  public String getThumbMediaId() {
    return ThumbMediaId;
  }

  public void setThumbMediaId(String thumbMediaId) {
    ThumbMediaId = thumbMediaId;
  }
}
