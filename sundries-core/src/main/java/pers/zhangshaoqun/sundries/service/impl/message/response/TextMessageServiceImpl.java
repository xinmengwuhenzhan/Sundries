
package pers.zhangshaoqun.sundries.service.impl.message.response;

import org.springframework.stereotype.Service;
import pers.zhangshaoqun.sundries.api.SundriesServiceException;
import pers.zhangshaoqun.sundries.api.message.request.text.TextMessage;
import pers.zhangshaoqun.sundries.api.message.request.text.TextMessageService;
import pers.zhangshaoqun.sundries.api.message.response.BaseMessage;
import pers.zhangshaoqun.sundries.api.message.response.news.ArticlesInfo;
import pers.zhangshaoqun.sundries.api.message.response.news.NewsMessage;
import pers.zhangshaoqun.sundries.service.util.MessageUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 文本消息实现
 */
@Service(value = TextMessageService.DEFAULT_CONTEXT_ID)
public class TextMessageServiceImpl implements TextMessageService {

  public BaseMessage processMessage(TextMessage textMessage) throws SundriesServiceException {
    if (textMessage.getContent() == null){
      pers.zhangshaoqun.sundries.api.message.response.text.TextMessage responseMsg = new pers.zhangshaoqun.sundries.api.message.response.text.TextMessage();
      responseMsg.setContent("发送的消息为空");
      responseMsg.setMsgType(MessageUtil.RESPONSE_MESSAGE_TYPE_TEXT);
      return responseMsg;
    }
    else if (textMessage.getContent().equals("1")){
      NewsMessage newsMessage = new NewsMessage();
      newsMessage.setArticleCount(1);
      ArticlesInfo articlesInfo = new ArticlesInfo();
      articlesInfo.setTitle("测试");
      articlesInfo.setDescription("这是一个测试链接");
      articlesInfo.setUrl("http://vux.li");
      List<ArticlesInfo> list = new ArrayList<ArticlesInfo>();
      list.add(articlesInfo);
      newsMessage.setArticles(list);
      newsMessage.setMsgType(MessageUtil.RESPONSE_MESSAGE_TYPE_NEWS);
      return newsMessage;
    }
    else {
      pers.zhangshaoqun.sundries.api.message.response.text.TextMessage responseMsg = new pers.zhangshaoqun.sundries.api.message.response.text.TextMessage();
      responseMsg.setContent("这是测试消息");
      responseMsg.setMsgType(MessageUtil.RESPONSE_MESSAGE_TYPE_TEXT);
      return responseMsg;
    }
  }
}
