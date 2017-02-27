package com.fusion.model.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by kirin on 17/1/22.
 *
 * 在类上使用@Component注解，表示该类定义为Spring管理Bean，使用默认value（可选）属性表示Bean标识符
 */

@Component("component")
public class TestCompoment {


    @Autowired
    private ApplicationContext ctx;

    public ApplicationContext getCtx(){
        return ctx;
    }
}
