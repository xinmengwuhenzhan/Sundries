package pers.zhangshaoqun.sundries.service.impl.message.response;

import org.springframework.stereotype.Service;
import pers.zhangshaoqun.sundries.api.SundriesServiceException;
import pers.zhangshaoqun.sundries.api.message.request.video.VideoMessage;
import pers.zhangshaoqun.sundries.api.message.request.video.VideoMessageService;
import pers.zhangshaoqun.sundries.api.message.response.BaseMessage;
import pers.zhangshaoqun.sundries.api.message.response.text.TextMessage;
import pers.zhangshaoqun.sundries.service.util.MessageUtil;

/**
 * 视频
 */
@Service(value = VideoMessageService.DEFAULT_CONTEXT_ID)
public class VideoMessageServiceImpl implements VideoMessageService {
  public BaseMessage processMessage(VideoMessage videoMessage) throws SundriesServiceException {
    TextMessage textMessage = new TextMessage();
    textMessage.setContent("您发送的是视频");
    textMessage.setMsgType(MessageUtil.RESPONSE_MESSAGE_TYPE_TEXT);
    return textMessage;
  }
}
