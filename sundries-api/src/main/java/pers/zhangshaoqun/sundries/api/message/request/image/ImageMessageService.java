package pers.zhangshaoqun.sundries.api.message.request.image;

import pers.zhangshaoqun.sundries.api.SundriesServiceException;
import pers.zhangshaoqun.sundries.api.message.response.BaseMessage;

/**
 * 图片信息
 */
public interface ImageMessageService {
  String DEFAULT_CONTEXT_ID = "sundries-api.imageMessageService";

  BaseMessage processMessage(ImageMessage imageMessage) throws SundriesServiceException;
}
