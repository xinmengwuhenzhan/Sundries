package pers.zhangshaoqun.sundries.service.impl.validate;

import org.junit.Test;
import pers.zhangshaoqun.sundries.api.SundriesServiceException;
import pers.zhangshaoqun.sundries.api.validate.ValidateInfo;
import pers.zhangshaoqun.sundries.api.validate.ValidateService;
import pers.zhangshaoqun.sundries.service.BaseTest;

/**
 * Created by admin on 2016-10-25.
 */
public class ValidateServiceTest extends BaseTest {

  private ValidateService validateService;

  public void initData() throws Exception {
    validateService = getBean(ValidateService.class);
  }

  @Test
  public void testToken(){
    ValidateInfo validateInfo = new ValidateInfo();
    validateInfo.setSignature("aa");
    validateInfo.setTimestamp("1234564521");
    validateInfo.setNonce("12345");
    validateInfo.setEchostr("123123");
    try {
      System.out.println(validateService.validate(validateInfo));
    } catch (SundriesServiceException e) {
      e.printStackTrace();
    }
  }

}
