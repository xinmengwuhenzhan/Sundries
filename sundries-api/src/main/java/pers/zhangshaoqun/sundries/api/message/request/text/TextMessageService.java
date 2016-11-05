package pers.zhangshaoqun.sundries.api.message.request.text;

import pers.zhangshaoqun.sundries.api.SundriesServiceException;
import pers.zhangshaoqun.sundries.api.message.response.BaseMessage;

/**
 * 文本消息
 */
public interface TextMessageService {
  String DEFAULT_CONTEXT_ID = "sundries-api.textMessageService";

  BaseMessage processMessage(TextMessage textMessage) throws SundriesServiceException;
}
