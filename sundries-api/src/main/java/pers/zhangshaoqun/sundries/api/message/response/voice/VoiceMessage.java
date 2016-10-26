package pers.zhangshaoqun.sundries.api.message.response.voice;

import pers.zhangshaoqun.sundries.api.message.response.BaseMessage;
import pers.zhangshaoqun.sundries.api.message.response.MediaMessage;

/**
 * 语音信息
 */
public class VoiceMessage extends BaseMessage{
  private MediaMessage Voice;

  /** 语音信息 */
  public MediaMessage getVoice() {
    return Voice;
  }

  public void setVoice(MediaMessage voice) {
    Voice = voice;
  }
}
