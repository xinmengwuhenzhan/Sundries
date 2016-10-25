package pers.zhangshaoqun.sundries.api;

/**
 * 错误信息类
 */
public class ErrorInfo {
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
