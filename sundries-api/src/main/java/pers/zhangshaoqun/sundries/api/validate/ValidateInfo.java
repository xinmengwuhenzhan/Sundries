package pers.zhangshaoqun.sundries.api.validate;

import pers.zhangshaoqun.sundries.api.ErrorInfo;

/**
 * Created by admin on 2016-10-24.
 */
public class ValidateInfo extends ErrorInfo {

  private String signature;
  private Long timestamp;
  private Long nonce;
  private String echostr;

  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public Long getNonce() {
    return nonce;
  }

  public void setNonce(Long nonce) {
    this.nonce = nonce;
  }

  public String getEchostr() {
    return echostr;
  }

  public void setEchostr(String echostr) {
    this.echostr = echostr;
  }
}