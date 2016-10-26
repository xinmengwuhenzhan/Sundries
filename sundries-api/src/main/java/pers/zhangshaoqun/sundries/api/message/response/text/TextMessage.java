package pers.zhangshaoqun.sundries.api.message.response.text;

import pers.zhangshaoqun.sundries.api.message.response.BaseMessage;

/**
 * 文本消息
 */
public class TextMessage extends BaseMessage {
  private String Content;

  /** 文本内容 */
  public String getContent() {
    return Content;
  }

  public void setContent(String content) {
    Content = content;
  }
}
