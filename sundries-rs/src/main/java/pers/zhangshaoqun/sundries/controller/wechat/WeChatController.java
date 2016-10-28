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
import pers.zhangshaoqun.sundries.api.message.response.BaseMessage;
import pers.zhangshaoqun.sundries.api.validate.ValidateInfo;
import pers.zhangshaoqun.sundries.api.validate.ValidateService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
  public @ResponseBody String validate(ValidateInfo validateInfo) {
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

  @RequestMapping(method = RequestMethod.POST)
  public @ResponseBody
  BaseMessage process(HttpServletRequest request, HttpServletResponse response, @RequestBody String s) throws IOException {
    logger.info("开始处理微信信息请求");
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    System.out.println(s);
    return null;
  }
}
