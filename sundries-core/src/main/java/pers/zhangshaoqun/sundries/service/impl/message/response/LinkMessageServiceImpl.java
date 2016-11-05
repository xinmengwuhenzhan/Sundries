package pers.zhangshaoqun.sundries.service.impl.message.response;

import org.springframework.stereotype.Service;
import pers.zhangshaoqun.sundries.api.SundriesServiceException;
import pers.zhangshaoqun.sundries.api.message.request.link.LinkMessage;
import pers.zhangshaoqun.sundries.api.message.request.link.LinkMessageService;
import pers.zhangshaoqun.sundries.api.message.response.BaseMessage;
import pers.zhangshaoqun.sundries.api.message.response.text.TextMessage;
import pers.zhangshaoqun.sundries.service.util.MessageUtil;

/**
 * 链接消息
 */
@Service(value = LinkMessageService.DEFAULT_CONTEXT_ID)
public class LinkMessageServiceImpl implements LinkMessageService {
  public BaseMessage processMessage(LinkMessage linkMessage) throws SundriesServiceException {
    TextMessage textMessage = new TextMessage();
    textMessage.setContent("您发送的是链接");
    textMessage.setMsgType(MessageUtil.RESPONSE_MESSAGE_TYPE_TEXT);
    return textMessage;
  }
}
