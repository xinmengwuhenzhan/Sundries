package pers.zhangshaoqun.sundries.service.impl.validate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pers.zhangshaoqun.sundries.api.SundriesServiceException;
import pers.zhangshaoqun.sundries.api.validate.ValidateInfo;
import pers.zhangshaoqun.sundries.api.validate.ValidateService;
import pers.zhangshaoqun.sundries.service.util.EncryptUtil;

import java.util.Arrays;

/**
 * @Author zhangshaoqun
 */
@Service(ValidateService.DEFAULT_CONTEXT_ID)
public class ValidateServiceImpl implements ValidateService {

  private static final Logger logger = LoggerFactory.getLogger(ValidateServiceImpl.class);

  private static String token;

  public static String getToken() {
    return token;
  }

  public static void setToken(String token) {
    ValidateServiceImpl.token = token;
  }

  /**
   * 验证微信
   * @param validateInfo
   *        微信验证对象
   * @return
   *        若是正确返回随机字符串，若是失败返回error
   * @throws SundriesServiceException
   */
  public String validate(ValidateInfo validateInfo) throws SundriesServiceException {
    logger.info("token" + token);
    String signature = validateInfo.getSignature();
    String timestamp = validateInfo.getTimestamp();
    String nonce = validateInfo.getNonce();
    String echostr = validateInfo.getEchostr();
    if (signature != null && timestamp != null && nonce!= null){
      String [] arrStr = new String[] {token, timestamp, nonce};
      Arrays.sort(arrStr);
      String content = arrStr[0] + arrStr[1] + arrStr[2];
      String digest = EncryptUtil.encode("SHA1", content).toLowerCase();
      if (digest.equals(signature)) {
        return echostr;
      }
    }
    logger.info("请求来源不是微信");
    return "error";
  }
}
