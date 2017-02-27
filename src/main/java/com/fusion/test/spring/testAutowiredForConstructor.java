package com.fusion.test.spring;

import com.fusion.model.TestBean1;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.SourceFilteringListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kirin on 17/1/22.
 *
 *
 */
public class TestAutowiredForConstructor {

    private static String configLocation = "classpath:dependecyInjectWithAnnotation.xml";
    private static ApplicationContext ctx = new ClassPathXmlApplicationContext(configLocation);

    @Test
    public static void main(String[] args) {

        TestBean1 testBean1 = ctx.getBean("testBean1", TestBean1.class);
        System.out.println(testBean1.getMessage());
        Assert.assertEquals("hello",testBean1.getMessage());
    }


}
