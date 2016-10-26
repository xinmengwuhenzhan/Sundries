package pers.zhangshaoqun.sundries.api.message.response.music;

import pers.zhangshaoqun.sundries.api.message.response.BaseMessage;

/**
 * 音乐消息
 */
public class MusicMessage extends BaseMessage {
  private MusicInfo Music;

  /** 音乐信息 */
  public MusicInfo getMusic() {
    return Music;
  }

  public void setMusic(MusicInfo music) {
    Music = music;
  }
}
