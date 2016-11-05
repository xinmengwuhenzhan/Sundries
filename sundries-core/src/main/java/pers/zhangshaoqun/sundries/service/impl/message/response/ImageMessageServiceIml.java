package pers.zhangshaoqun.sundries.service.impl.message.response;

import org.springframework.stereotype.Service;
import pers.zhangshaoqun.sundries.api.SundriesServiceException;
import pers.zhangshaoqun.sundries.api.message.request.image.ImageMessage;
import pers.zhangshaoqun.sundries.api.message.request.image.ImageMessageService;
import pers.zhangshaoqun.sundries.api.message.response.BaseMessage;
import pers.zhangshaoqun.sundries.api.message.response.text.TextMessage;
import pers.zhangshaoqun.sundries.service.util.MessageUtil;

/**
 * 图片信息实现
 */
@Service(value = ImageMessageService.DEFAULT_CONTEXT_ID)
public class ImageMessageServiceIml implements ImageMessageService {

  public BaseMessage processMessage(ImageMessage imageMessage) throws SundriesServiceException {
    TextMessage textMessage = new TextMessage();
    textMessage.setContent("您发送的是图片");
    textMessage.setMsgType(MessageUtil.RESPONSE_MESSAGE_TYPE_TEXT);
    return textMessage;
  }
}
