package pers.zhangshaoqun.sundries.service.util;


import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;

import java.io.Writer;

/**
 * @Author zhangshaoqun
 */
public class MessageUtil {

  /** 请求消息--文本消息 */
  public static final String REQUEST_MESSAGE_TYPE_TEXT = "text";
  /** 请求消息--图片消息 */
  public static final String REQUEST_MESSAGE_TYPE_IMAGE = "image";
  /** 请求消息--链接 */
  public static final String REQUEST_MESSAGE_TYPE_LINK = "link";
  /** 请求消息--地理位置 */
  public static final String REQUEST_MESSAGE_TYPE_LOCATION = "location";
  /** 请求消息--音频 */
  public static final String REQUEST_MESSAGE_TYPE_VOICE = "voice";
  /** 请求消息--推送 */
  public static final String REQUEST_MESSAGE_TYPE_EVENT = "event";


  private static XStream xstream = new XStream(new XppDriver() {
    public HierarchicalStreamWriter createWriter(Writer out) {
      return new PrettyPrintWriter(out) {
        // 对所有xml节点的转换都增加CDATA标记
        boolean cdata = true;

        @SuppressWarnings("unchecked")
        public void startNode(String name, Class clazz) {
          super.startNode(name, clazz);
        }

        protected void writeText(QuickWriter writer, String text) {
          if (cdata) {
            writer.write("<![CDATA[");
            writer.write(text);
            writer.write("]]>");
          } else {
            writer.write(text);
          }
        }
      };
    }
  });

  /**
   * 对象转xml
   * @param object
   *        不含list对象
   * @return
   *        xml字符串
   */
  public static String objToXml(Object object){
    xstream.alias("xml", object.getClass());
    return xstream.toXML(object);
  }

}
