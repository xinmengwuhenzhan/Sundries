package pers.zhangshaoqun.sundries.api.message.request.link;

import pers.zhangshaoqun.sundries.api.SundriesServiceException;
import pers.zhangshaoqun.sundries.api.message.response.BaseMessage;

/**
 * 链接消息
 */
public interface LinkMessageService {
  String DEFAULT_CONTEXT_ID = "sundries-api.linkMessageService";

  BaseMessage processMessage(LinkMessage linkMessage) throws SundriesServiceException;
}
