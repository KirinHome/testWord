package com.fusion.test;

import com.fusion.model.Topo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class testArray {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {


        Topo topo = new Topo();
        String name = topo.getClass().getName();
        System.out.println(name);

        Class<?> c1 = null;
        Class<?> c2 = null;

        //  1 --> 实例化
        Class<?> c3 = null;
        c1 = Class.forName(name);
        System.out.println("class1 :  " + c1.getName());

        // 2 --> 实例化
        c2 = new Topo().getClass();
        System.out.println(c2.getName());

        // 3 --> 实例化
        c3 = Topo.class;
        System.out.println(c3.getName());

        // 4 --> 实例化设置对象值
        topo = (Topo) c1.newInstance();
        topo.setTopoType(1);
        System.out.println(topo.getTopoType());

        // 5 --> 获取对象方法
        Method[] methods = c1.getMethods();
        for (Method method : methods) {
            String methodName = method.getName();
            System.out.println(methodName);
        }

        // 6 --> 获取对象属性值与类型
        Field[] declaredFields = c1.getDeclaredFields();
        for (Field field : declaredFields) {
            String fieldName = field.getName();
            Class<?> type = field.getType();
            System.out.println(fieldName);
            System.out.println(type);
        }
    }


}
