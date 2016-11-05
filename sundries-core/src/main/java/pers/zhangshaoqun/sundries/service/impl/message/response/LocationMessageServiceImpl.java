package pers.zhangshaoqun.sundries.service.impl.message.response;

import org.springframework.stereotype.Service;
import pers.zhangshaoqun.sundries.api.SundriesServiceException;
import pers.zhangshaoqun.sundries.api.message.request.location.LocationMessage;
import pers.zhangshaoqun.sundries.api.message.request.location.LocationMessageService;
import pers.zhangshaoqun.sundries.api.message.response.BaseMessage;
import pers.zhangshaoqun.sundries.api.message.response.text.TextMessage;
import pers.zhangshaoqun.sundries.service.util.MessageUtil;

/**
 * 地理位置服务实现
 */
@Service(value = LocationMessageService.DEFAULT_CONTEXT_ID)
public class LocationMessageServiceImpl implements LocationMessageService{
  public BaseMessage processMessage(LocationMessage locationMessage) throws SundriesServiceException {
    String location_X = locationMessage.getLocation_X();
    String location_Y = locationMessage.getLocation_Y();
    TextMessage textMessage = new TextMessage();
    StringBuffer buffer = new StringBuffer();
    buffer.append("您所在位置:  " + locationMessage.getLabel()).append("\n");
    buffer.append("纬度:  " + location_X).append("\n");
    buffer.append("经度:  " + location_Y);
    textMessage.setContent(buffer.toString());
    textMessage.setMsgType(MessageUtil.RESPONSE_MESSAGE_TYPE_TEXT);
    return textMessage;
  }
}
