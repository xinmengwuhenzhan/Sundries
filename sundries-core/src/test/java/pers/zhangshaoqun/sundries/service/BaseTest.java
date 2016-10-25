package pers.zhangshaoqun.sundries.service;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 2016-10-25.
 */
public class BaseTest {
  protected static ApplicationContext appCtx;

  @Before
  public void setup() throws Exception {
    appCtx = new ClassPathXmlApplicationContext("classpath:main.xml");

    initData();
  }

  // 初始化数据
  public void initData() throws Exception {

  }

  public static <T> T getBean(String beanName) {
    return (T) appCtx.getBean(beanName);
  }

  public static <T> T getBean(Class<T> clazz) {
    return appCtx.getBean(clazz);
  }


}
