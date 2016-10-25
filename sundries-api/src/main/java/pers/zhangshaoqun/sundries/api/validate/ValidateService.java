package pers.zhangshaoqun.sundries.api.validate;

import pers.zhangshaoqun.sundries.api.SundriesServiceException;

/**
 * Created by admin on 2016-10-25.
 */
public interface ValidateService {

  String DEFAULT_CONTEXT_ID = "sundries-api.validateService";

  /**
   * 微信验证
   * @param validateInfo
   *        验证信息
   * @return
   *     若是正确返回随机字符串，若是失败返回error
   * @throws SundriesServiceException
   */
  String validate(ValidateInfo validateInfo) throws SundriesServiceException;
}
