package pers.zhangshaoqun.sundries.api.message.response;

import java.io.Serializable;

/**
 * 回复消息的基类
 */
public class BaseMessage implements Serializable{
  private static final long serialVersionUID = 5201691518415383193L;

  private String ToUserName;
  private String FromUserName;
  private long CreateTime;
  private String MsgType;

  /** 接收方帐号（收到的OpenID） */
  public String getToUserName() {
    return ToUserName;
  }

  public void setToUserName(String toUserName) {
    ToUserName = toUserName;
  }

  /** 开发者微信号 */
  public String getFromUserName() {
    return FromUserName;
  }

  public void setFromUserName(String fromUserName) {
    FromUserName = fromUserName;
  }

  /** 消息创建时间  */
  public long getCreateTime() {
    return CreateTime;
  }

  public void setCreateTime(long createTime) {
    CreateTime = createTime;
  }

  /** 消息类型  */
  public String getMsgType() {
    return MsgType;
  }

  public void setMsgType(String msgType) {
    MsgType = msgType;
  }
}
