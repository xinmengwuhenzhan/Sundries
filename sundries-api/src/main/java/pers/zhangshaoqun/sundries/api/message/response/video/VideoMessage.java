package pers.zhangshaoqun.sundries.api.message.response.video;

import pers.zhangshaoqun.sundries.api.message.request.BaseMessage;

/**
 * 视频消息
 */
public class VideoMessage extends BaseMessage{
  private VideoInfo Video;

  /** 视频信息 */
  public VideoInfo getVideo() {
    return Video;
  }

  public void setVideo(VideoInfo video) {
    Video = video;
  }
}
