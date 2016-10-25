package pers.zhangshaoqun.sundries.core.util;

import java.security.MessageDigest;

/**
 * 微信加密算法工具类
 */
public class EncryptUtil {

  private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',
          'e', 'f'};

  /**
   * 将字节转换为十六进制字符串
   * @param bytes
   *        字节数组
   * @return
   */
  private static String getFormattedText(byte[] bytes) {
    int len = bytes.length;
    StringBuilder buf = new StringBuilder(len * 2);
    // 把密文转换成十六进制的字符串形式
    for (int j = 0; j < len; j++) {
      buf.append(HEX_DIGITS[(bytes[j] >> 4) & 0x0f]);
      buf.append(HEX_DIGITS[bytes[j] & 0x0f]);
    }
    return buf.toString();
  }

  /**
   * 根据加密算法将字符串加密
   * @param algorithm
   *        加密算法
   * @param str
   *        需要加密的字符串
   * @return
   *        加密后的16进制字符串
   */
  public static String encode(String algorithm, String str) {
    if (str == null) {
      return null;
    }
    try {
      MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
      messageDigest.update(str.getBytes());
      return getFormattedText(messageDigest.digest());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

}
