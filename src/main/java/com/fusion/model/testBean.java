package com.fusion.model;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created by kirin on 17/1/22.
 *
 *  测试 @Required Spring自带依赖注入注解
 */
public class TestBean {




    private String message;

    public String getMessage() {
        return message;
    }

    @Required
    public void setMessage(String message) {
        this.message = message;
    }
}
