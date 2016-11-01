package pers.zhangshaoqun.sundries.service.impl.message;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import pers.zhangshaoqun.sundries.api.SundriesServiceException;
import pers.zhangshaoqun.sundries.api.message.MessageService;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 消息处理实现
 */
public class MessageServiceImpl implements MessageService {
  public String processRequest(HttpServletRequest request) throws SundriesServiceException {

    try {
      Map<String, String> map = getRequestMessage(request);
      String fromUserName = map.get("FromUserName");
      // 公众帐号
      String toUserName = map.get("ToUserName");
      // 消息类型
      String msgType = map.get("MsgType");
      // 消息内容
      String content = map.get("Content");
      ResponseMessage responseMessage = MessageConfig.getInstance().getMessage(msgType);
      if (responseMessage == null){
        throw new RuntimeException(msgType + " 没有指定的服务实现.");
      }
      else {
        responseMessage.getResponseMessageService().processMessage(msgType);
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
