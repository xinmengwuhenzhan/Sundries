package pers.zhangshaoqun.sundries.api.message.request.location;

import pers.zhangshaoqun.sundries.api.SundriesServiceException;
import pers.zhangshaoqun.sundries.api.message.response.BaseMessage;

/**
 * 位置信息
 */
public interface LocationMessageService {
  String DEFAULT_CONTEXT_ID = "sundries-api.locationMessageService";

  BaseMessage processMessage(LocationMessage locationMessage) throws SundriesServiceException;
}
