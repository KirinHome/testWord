package com.fusion.test.spring;

import com.fusion.model.spring.TestCompoment;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kirin on 17/1/22.
 *  Component 测试
 */
public class ComponentDefinitionWithAnnotationTest {

    private static String configLocation = "classpath:componentDefinitionWithAnnotation.xml";

    private static ApplicationContext ctx = new ClassPathXmlApplicationContext(configLocation);

    @Test
    public void testComponent() {
        TestCompoment component = ctx.getBean("component", TestCompoment.class);
        Assert.assertNotNull(component.getCtx());
    }

}
