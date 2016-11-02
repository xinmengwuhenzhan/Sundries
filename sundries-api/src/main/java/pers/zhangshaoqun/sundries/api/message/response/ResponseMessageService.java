/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，1995-2016，所有权利保留。
 * 项目名：sundries
 * 文件名：ResponseMessageService
 * 模块说明：
 * 修改历史：
 * 2016-11-01- zhangshaoqun - 创建
 */

package pers.zhangshaoqun.sundries.api.message.response;

import pers.zhangshaoqun.sundries.api.SundriesServiceException;

/**
 * @Author zhangshaoqun
 */
public interface ResponseMessageService {

  BaseMessage processMessage(pers.zhangshaoqun.sundries.api.message.request.BaseMessage requestMessage) throws SundriesServiceException;
}
