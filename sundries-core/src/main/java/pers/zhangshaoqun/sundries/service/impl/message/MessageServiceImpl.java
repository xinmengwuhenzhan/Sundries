package pers.zhangshaoqun.sundries.service.impl.message;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.stereotype.Service;
import pers.zhangshaoqun.sundries.api.SundriesServiceException;
import pers.zhangshaoqun.sundries.api.message.MessageService;
import pers.zhangshaoqun.sundries.api.message.response.BaseMessage;
import pers.zhangshaoqun.sundries.api.message.request.image.ImageMessage;
import pers.zhangshaoqun.sundries.api.message.request.text.TextMessage;
import pers.zhangshaoqun.sundries.service.util.MessageUtil;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 消息处理实现
 */
@Service(value = MessageService.DEFAULT_CONTEXT_ID)
public class MessageServiceImpl implements MessageService {
  public String processRequest(HttpServletRequest request) throws SundriesServiceException {

    try {
      Map<String, String> map = getRequestMessage(request);
      String fromUserName = map.get("FromUserName");
      // 公众帐号
      String toUserName = map.get("ToUserName");
      // 消息类型
      String msgType = map.get("MsgType");
      RequestMessage responseMessage = MessageConfig.getInstance().getMessage(msgType);
      if (responseMessage == null){
        throw new RuntimeException(msgType + " 没有指定的服务实现.");
      }
      else {
        BaseMessage respBaseMessage = new BaseMessage();
        if (MessageUtil.REQUEST_MESSAGE_TYPE_TEXT.equals(msgType)){
          TextMessage textMessage = new TextMessage();
          // 消息内容
          String content = map.get("Content");
          textMessage.setContent(content);
          respBaseMessage = responseMessage.getResponseMessageService().processMessage(textMessage);
        }
        else if (MessageUtil.REQUEST_MESSAGE_TYPE_IMAGE.equals(msgType)){
          ImageMessage imageMessage = new ImageMessage();
          String picUrl = map.get("PicUrl");
          String mediaId = map.get("MediaId");
          imageMessage.setPicUrl(picUrl);
          imageMessage.setMediaId(mediaId);
          respBaseMessage = responseMessage.getResponseMessageService().processMessage(imageMessage);
        }
        respBaseMessage.setToUserName(fromUserName);
        respBaseMessage.setFromUserName(toUserName);
        respBaseMessage.setCreateTime(new Date().getTime());
        return MessageUtil.objToXml(respBaseMessage);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } catch (DocumentException e) {
      e.printStackTrace();
    }

    return null;
  }

  private Map<String, String> getRequestMessage(HttpServletRequest request) throws IOException, DocumentException {
    InputStream inputStream = request.getInputStream();
    SAXReader reader = new SAXReader();
    Document document = reader.read(inputStream);
    Element root = document.getRootElement();
    List<Element> list = root.elements();
    Map<String, String> map = new HashMap<String, String>();
    for (Element e: list){
      map.put(e.getName(), e.getText());
    }
    inputStream.close();
    return map;
  }

}
