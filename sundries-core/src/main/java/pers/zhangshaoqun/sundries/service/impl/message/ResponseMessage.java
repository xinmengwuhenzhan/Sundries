/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，1995-2016，所有权利保留。
 * 项目名：sundries
 * 文件名：ResponseMessage
 * 模块说明：
 * 修改历史：
 * 2016-11-01- zhangshaoqun - 创建
 */

package pers.zhangshaoqun.sundries.service.impl.message;

import pers.zhangshaoqun.sundries.api.message.response.BaseMessage;
import pers.zhangshaoqun.sundries.api.message.response.ResponseMessageService;

/**
 * @Author zhangshaoqun
 */
public class ResponseMessage extends BaseMessage {

  private static final long serialVersionUID = 7520927505114898050L;

  private ResponseMessageService responseMessageService;

  public ResponseMessageService getResponseMessageService() {
    return responseMessageService;
  }

  public void setResponseMessageService(ResponseMessageService responseMessageService) {
    this.responseMessageService = responseMessageService;
  }
}
