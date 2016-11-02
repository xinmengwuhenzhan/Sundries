/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，1995-2016，所有权利保留。
 * 项目名：sundries
 * 文件名：MessageConfig
 * 模块说明：
 * 修改历史：
 * 2016-11-01- zhangshaoqun - 创建
 */

package pers.zhangshaoqun.sundries.service.impl.message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author zhangshaoqun
 */
public class MessageConfig {
  public static final MessageConfig instance = new MessageConfig();

  private Map<String, RequestMessage> map = new HashMap<String, RequestMessage>();
  private List<RequestMessage> messages = new ArrayList<RequestMessage>();

  private MessageConfig(){

  }


  public static MessageConfig getInstance(){
    return instance;
  }


  public List<RequestMessage> getMessages() {
    return messages;
  }

  public void setMessages(List<RequestMessage> messages) {
    map.clear();
    this.messages = messages;
    if (messages != null){
      for (RequestMessage requestMessage: messages){
        map.put(requestMessage.getMsgType(), requestMessage);
      }
    }
  }

  public RequestMessage getMessage(String msgType){
    return map.get(msgType);
  }
}
