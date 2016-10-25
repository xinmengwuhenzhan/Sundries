package pers.zhangshaoqun.sundries.core.impl;

import org.springframework.stereotype.Service;
import pers.zhangshaoqun.sundries.api.SundriesServiceException;
import pers.zhangshaoqun.sundries.api.validate.ValidateInfo;
import pers.zhangshaoqun.sundries.api.validate.ValidateService;

/**
 * @Author zhangshaoqun
 */
@Service(ValidateService.DEFAULT_CONTEXT_ID)
public class ValidateServiceImpl implements ValidateService {

  /**
   * 验证微信
   * @param validateInfo
   *        微信验证对象
   * @return
   *        若是正确返回随机字符串，若是失败返回error
   * @throws SundriesServiceException
   */
  public String validate(ValidateInfo validateInfo) throws SundriesServiceException {
    return null;
  }
}
