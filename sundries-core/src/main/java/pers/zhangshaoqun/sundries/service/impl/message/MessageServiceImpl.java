package pers.zhangshaoqun.sundries.service.impl.message;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.zhangshaoqun.sundries.api.SundriesServiceException;
import pers.zhangshaoqun.sundries.api.message.MessageService;
import pers.zhangshaoqun.sundries.api.message.request.image.ImageMessage;
import pers.zhangshaoqun.sundries.api.message.request.image.ImageMessageService;
import pers.zhangshaoqun.sundries.api.message.request.link.LinkMessage;
import pers.zhangshaoqun.sundries.api.message.request.link.LinkMessageService;
import pers.zhangshaoqun.sundries.api.message.request.location.LocationMessage;
import pers.zhangshaoqun.sundries.api.message.request.location.LocationMessageService;
import pers.zhangshaoqun.sundries.api.message.request.text.TextMessageService;
import pers.zhangshaoqun.sundries.api.message.request.video.VideoMessage;
import pers.zhangshaoqun.sundries.api.message.request.video.VideoMessageService;
import pers.zhangshaoqun.sundries.api.message.request.voice.VoiceMessage;
import pers.zhangshaoqun.sundries.api.message.request.voice.VoiceMessageService;
import pers.zhangshaoqun.sundries.api.message.response.BaseMessage;
import pers.zhangshaoqun.sundries.api.message.response.news.ArticlesInfo;
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

  @Autowired
  private TextMessageService textMessageService;
  @Autowired
  private ImageMessageService imageMessageService;
  @Autowired
  private LocationMessageService locationMessageService;
  @Autowired
  private LinkMessageService linkMessageService;
  @Autowired
  private VoiceMessageService voiceMessageService;
  @Autowired
  private VideoMessageService videoMessageService;

  public String processRequest(HttpServletRequest request) throws SundriesServiceException {

    try {
      Map<String, String> map = getRequestMessage(request);
      //微信账号
      String fromUserName = map.get("FromUserName");
      // 公众帐号
      String toUserName = map.get("ToUserName");
      // 消息类型
      String msgType = map.get("MsgType");
      BaseMessage baseMessage = new BaseMessage();
      //文本消息
      if (MessageUtil.REQUEST_MESSAGE_TYPE_TEXT.equals(msgType)){
        String content = map.get("Content");
        TextMessage textMessage = new TextMessage();
        textMessage.setContent(content);
        baseMessage = textMessageService.processMessage(textMessage);
      }
      //图片消息
      else if (MessageUtil.REQUEST_MESSAGE_TYPE_IMAGE.equals(msgType)){
        ImageMessage imageMessage = new ImageMessage();
        baseMessage = imageMessageService.processMessage(imageMessage);
      }
      //地理位置信息
      else if (MessageUtil.REQUEST_MESSAGE_TYPE_LOCATION.equals(msgType)){
        LocationMessage locationMessage = new LocationMessage();
        locationMessage.setLabel(map.get("Label"));
        locationMessage.setLocation_X(map.get("Location_X"));
        locationMessage.setLocation_Y(map.get("Location_Y"));
        baseMessage = locationMessageService.processMessage(locationMessage);
      }
      //链接消息
      else if (MessageUtil.REQUEST_MESSAGE_TYPE_LINK.equals(msgType)) {
        LinkMessage linkMessage = new LinkMessage();
        linkMessage.setTitle(map.get("Title"));
        linkMessage.setDescription(map.get("Description"));
        linkMessage.setUrl(map.get("Url"));
        baseMessage = linkMessageService.processMessage(linkMessage);
      }
      //语音消息
      else if (MessageUtil.REQUEST_MESSAGE_TYPE_VOICE.equals(msgType)) {
        VoiceMessage voiceMessage = new VoiceMessage();
        voiceMessage.setRecognition(map.get("Recognition"));
        voiceMessage.setFormat(map.get("Format"));
        voiceMessage.setMediaId(map.get("MediaId"));
        baseMessage = voiceMessageService.processMessage(voiceMessage);
      }
      //视频和小视频消息
      else if ((MessageUtil.REQUEST_MESSAGE_TYPE_VIDEO.equals(msgType))
              || (MessageUtil.REQUEST_MESSAGE_TYPE_SHORTVIDEO.equals(msgType))){
        VideoMessage videoMessage = new VideoMessage();
        videoMessage.setMsgType(msgType);
        videoMessage.setMediaId(map.get("MediaId"));
        baseMessage = videoMessageService.processMessage(videoMessage);
      }
      baseMessage.setFromUserName(toUserName);
      baseMessage.setToUserName(fromUserName);
      baseMessage.setCreateTime(new Date().getTime());
      if (baseMessage.getMsgType().equals(MessageUtil.RESPONSE_MESSAGE_TYPE_NEWS)) {
        return MessageUtil.objToXml(baseMessage, new ArticlesInfo());
      }
      return MessageUtil.objToXml(baseMessage);
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
