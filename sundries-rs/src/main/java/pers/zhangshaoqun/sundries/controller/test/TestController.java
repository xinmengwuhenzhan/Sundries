package pers.zhangshaoqun.sundries.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author zhangshaoqun
 */
@Controller
@RequestMapping("/test")
public class TestController {

  @RequestMapping(value = "/query")
  public @ResponseBody String test(@RequestParam(value = "name")String name){
    return "hello  " + name;
  }
}
