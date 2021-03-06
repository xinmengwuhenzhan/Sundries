package pers.zhangshaoqun.sundries.api.validate;

import pers.zhangshaoqun.sundries.api.ErrorInfo;

/**
 * 验证信息类
 */
public class ValidateInfo extends ErrorInfo {

  private String signature;
  private String timestamp;
  private String nonce;
  private String echostr;

  /** 微信加密签名 */
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  /** 时间戳 */
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  /** 随机数 */
  public String getNonce() {
    return nonce;
  }

  public void setNonce(String nonce) {
    this.nonce = nonce;
  }

  /** 随机字符串 */
  public String getEchostr() {
    return echostr;
  }

  public void setEchostr(String echostr) {
    this.echostr = echostr;
  }
}
