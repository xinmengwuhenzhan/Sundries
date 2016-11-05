package pers.zhangshaoqun.sundries.api.message.request.video;

import pers.zhangshaoqun.sundries.api.SundriesServiceException;
import pers.zhangshaoqun.sundries.api.message.response.BaseMessage;

/**
 * 视频
 */
public interface VideoMessageService {
  String DEFAULT_CONTEXT_ID = "sundries-api.videoMessageService";

  BaseMessage processMessage(VideoMessage videoMessage) throws SundriesServiceException;
}
