package pers.zhangshaoqun.sundries.controller.wechat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author zhangshaoqun
 */
@Controller
@RequestMapping("wechat")
public class WeChatController {

  private static final Logger logger = LoggerFactory.getLogger(WeChatController.class);

  @RequestMapping(value = "/valid", method = RequestMethod.GET)
  public @ResponseBody String validate() {
    return "";
  }
}
