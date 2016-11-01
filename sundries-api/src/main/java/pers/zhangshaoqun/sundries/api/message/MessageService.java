
package pers.zhangshaoqun.sundries.api.message;

import pers.zhangshaoqun.sundries.api.SundriesServiceException;

import javax.servlet.http.HttpServletRequest;

/**
 * 消息处理接口
 */
public interface MessageService {
  String DEFAULT_CONTEXT_ID = "sundries-api.messageService";

  String processRequest(HttpServletRequest request) throws SundriesServiceException;
}
