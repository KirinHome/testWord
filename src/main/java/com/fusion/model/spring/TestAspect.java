package com.fusion.model.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by kirin on 17/1/22.
 *
 * @ AspectJ风格的切面可以通过@Compenent注解标识其为Spring管理Bean，
 * 而@Aspect注解不能被Spring自动识别并注册为Bean，必须通过@Component注解来完成
 */
@Component
@Aspect
public class TestAspect {

    @Pointcut(value="execution(* *(..))")
    private void pointcut() {

        System.out.println("====TestAspect : pointcut()");
    }


    @Before(value="pointcut()")
    public void before() {
        System.out.println("=======before()");
    }
}
