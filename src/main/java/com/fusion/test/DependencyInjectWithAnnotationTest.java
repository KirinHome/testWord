package com.fusion.test;

import com.fusion.model.TestBean;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kirin on 17/1/22.
 *
 *  测试 Spring自带依赖注入注解
 */
public class DependencyInjectWithAnnotationTest {

    private static String configLocation = "classpath:dependecyInjectWithAnnotation.xml";
    private static ApplicationContext ctx = new ClassPathXmlApplicationContext(configLocation);
    //1、Spring自带依赖注入注解
    @Test
    public void testRequiredForXmlSetterInject() {
        TestBean testBean = ctx.getBean("testBean", TestBean.class);
        Assert.assertEquals("hello", testBean.getMessage());
//        System.out.println(testBean.getMessage());

    }

}
