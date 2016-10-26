package pers.zhangshaoqun.sundries.api;

import java.io.Serializable;

/**
 * 错误信息类
 */
public class ErrorInfo implements Serializable {

  private static final long serialVersionUID = -6551631853741127977L;
  //错误代码
  private String errorCode;
  //错误信息
  private String errorMessage;

  /** 错误代码 */
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /** 错误信息 */
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
}
