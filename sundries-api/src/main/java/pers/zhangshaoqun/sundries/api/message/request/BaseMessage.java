package pers.zhangshaoqun.sundries.api.message.request;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * 请求消息的基类
 */
@XmlRootElement(name = "xml")
public class BaseMessage implements Serializable{

  private static final long serialVersionUID = 4260767620886631443L;
  //变量命名之所以用大写，为了方便序列化
  private String ToUserName;
  private String FromUserName;
  private long CreateTime;
  private String MsgType;
  private long MsgId;

  /** 开发者微信号 */
  public String getToUserName() {
    return ToUserName;
  }

  public void setToUserName(String toUserName) {
    ToUserName = toUserName;
  }

  /** 发送方帐号（一个OpenID） */
  public String getFromUserName() {
    return FromUserName;
  }

  public void setFromUserName(String fromUserName) {
    FromUserName = fromUserName;
  }

  /** 消息创建时间 */
  public long getCreateTime() {
    return CreateTime;
  }

  public void setCreateTime(long createTime) {
    CreateTime = createTime;
  }

  /** 消息类型 */
  public String getMsgType() {
    return MsgType;
  }

  public void setMsgType(String msgType) {
    MsgType = msgType;
  }

  /** 消息id */
  public long getMsgId() {
    return MsgId;
  }

  public void setMsgId(long msgId) {
    MsgId = msgId;
  }
}
