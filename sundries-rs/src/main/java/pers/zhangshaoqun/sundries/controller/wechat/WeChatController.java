package pers.zhangshaoqun.sundries.controller.wechat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.zhangshaoqun.sundries.api.SundriesServiceException;
import pers.zhangshaoqun.sundries.api.validate.ValidateInfo;
import pers.zhangshaoqun.sundries.api.validate.ValidateService;

/**
 * @Author zhangshaoqun
 */
@Controller
@RequestMapping("/wechat")
public class WeChatController {

  private static final Logger logger = LoggerFactory.getLogger(WeChatController.class);

  @Autowired
  private ValidateService validateService;

  @RequestMapping(value = "/valid", method = RequestMethod.GET)
  public @ResponseBody String validate(@RequestBody ValidateInfo validateInfo) {
    logger.info("开始进行微信验证");
    String result = "";
    try {
      result = validateService.validate(validateInfo);
    } catch (SundriesServiceException e) {
      e.printStackTrace();
      logger.error("微信验证失败" + e.getMessage());
    }
    return result;
  }
}
