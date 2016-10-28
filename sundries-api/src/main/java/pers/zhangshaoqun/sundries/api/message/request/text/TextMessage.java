package pers.zhangshaoqun.sundries.api.message.request.text;

import pers.zhangshaoqun.sundries.api.message.request.BaseMessage;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 文本消息
 */
@XmlRootElement(name = "xml")
public class TextMessage extends BaseMessage {
  private String Content;

  /** 文本内容 */
  @XmlElement(name = "Content")
  public String getContent() {
    return Content;
  }

  public void setContent(String content) {
    Content = content;
  }
}
