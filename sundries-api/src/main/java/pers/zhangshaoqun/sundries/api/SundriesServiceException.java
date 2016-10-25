package pers.zhangshaoqun.sundries.api;

import java.text.MessageFormat;

/**
 * @Author zhangshaoqun
 *
 * 杂事服务异常类
 */
public class SundriesServiceException extends Exception {
  private static final long serialVersionUID = 3046781182386009242L;

  public SundriesServiceException(){
    super();
  }

  public SundriesServiceException(String pattern, Object... arguments) {
    super(MessageFormat.format(pattern, arguments));
  }

  public SundriesServiceException(Throwable cause) {
    super(cause);
  }

  public SundriesServiceException(Throwable cause, String pattern, Object... arguments) {
    super(MessageFormat.format(pattern, arguments), cause);
  }
}
