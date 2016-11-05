package pers.zhangshaoqun.sundries.service.impl.message.response;

import org.springframework.stereotype.Service;
import pers.zhangshaoqun.sundries.api.SundriesServiceException;
import pers.zhangshaoqun.sundries.api.message.request.voice.VoiceMessage;
import pers.zhangshaoqun.sundries.api.message.request.voice.VoiceMessageService;
import pers.zhangshaoqun.sundries.api.message.response.BaseMessage;
import pers.zhangshaoqun.sundries.api.message.response.text.TextMessage;
import pers.zhangshaoqun.sundries.service.util.MessageUtil;

/**
 * 语音消息
 */
@Service(value = VoiceMessageService.DEFAULT_CONTEXT_ID)
public class VoiceMessageServiceImpl implements VoiceMessageService {
  public BaseMessage processMessage(VoiceMessage voiceMessage) throws SundriesServiceException {
    TextMessage textMessage = new TextMessage();
    textMessage.setContent("您发送的是语音消息");
    textMessage.setMsgType(MessageUtil.RESPONSE_MESSAGE_TYPE_TEXT);
    return textMessage;
  }
}
