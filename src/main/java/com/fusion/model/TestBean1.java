package com.fusion.model;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by kirin on 17/1/22.
 * //@Autowired(required=true)
 *  构造器、字段、方法
 */

public class TestBean1 {


    // @Autowired //字段注入
    private String message;

    /**
     *  构造器注入
     */
    @Autowired
    public TestBean1(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
