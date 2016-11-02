/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，1995-2016，所有权利保留。
 * 项目名：sundries
 * 文件名：TextMessageImpl
 * 模块说明：
 * 修改历史：
 * 2016-11-02- zhangshaoqun - 创建
 */

package pers.zhangshaoqun.sundries.service.impl.message.response;

import pers.zhangshaoqun.sundries.api.SundriesServiceException;
import pers.zhangshaoqun.sundries.api.message.response.BaseMessage;
import pers.zhangshaoqun.sundries.api.message.response.ResponseMessageService;
import pers.zhangshaoqun.sundries.api.message.response.text.TextMessage;
import pers.zhangshaoqun.sundries.service.util.MessageUtil;

/**
 * @Author zhangshaoqun
 */
public class TextMessageImpl implements ResponseMessageService {

  public BaseMessage processMessage(pers.zhangshaoqun.sundries.api.message.request.BaseMessage requestMessage) throws SundriesServiceException {
    TextMessage textMessage = new TextMessage();
    textMessage.setContent("这是一个测试");
    textMessage.setMsgType(MessageUtil.RESPONSE_MESSAGE_TYPE_TEXT);
    return textMessage;
  }
}
