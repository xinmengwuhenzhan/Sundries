package pers.zhangshaoqun.sundries.api.message.request.voice;

import pers.zhangshaoqun.sundries.api.SundriesServiceException;
import pers.zhangshaoqun.sundries.api.message.response.BaseMessage;

/**
 * 语音消息
 */
public interface VoiceMessageService {
  String DEFAULT_CONTEXT_ID = "sundries-api.voiceMessageService";

  BaseMessage processMessage(VoiceMessage voiceMessage) throws SundriesServiceException;
}
