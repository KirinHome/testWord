package com.fusion.test.collections;


import com.google.common.collect.Lists;
import com.sun.istack.internal.Pool;

import java.sql.Connection;
import java.util.*;

/**
 * Created by kirin on 17/1/23.
 *
 *  map 测试
 */
public class map {

    public static void main(String[] args) {



        Map<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","1");
        map.put("3","1");
        map.put("4","1");
        map.put("5","1");
        map.put("6","1");
        map.put("7","1");
        map.put("8","1");
        map.put("9","1");
        map.put("10","1");
        map.put("11","1");
        map.put("12","1");
        map.put("13","1");
        map.put("14","1");
        map.put("15","1");
        map.put("16","1");
        map.put("17","1");

        List<String> list = Lists.newArrayList();
        list.add("1");

        System.out.println(map);
        TreeMap<String, String> tmp = new TreeMap<String, String>();

        tmp.put("1","1");
        tmp.put("2","1");
        tmp.put("3","1");
        tmp.put("4","1");
        tmp.put("5","1");
        tmp.put("6","1");
        tmp.put("7","1");
        tmp.put("8","1");
        tmp.put("9","1");
        tmp.put("10","1");
        tmp.put("11","1");
        tmp.put("12","1");
        tmp.put("13","1");
        tmp.put("14","1");
        tmp.put("15","1");
        tmp.put("16","1");
        tmp.put("17","1");

        System.out.println(tmp);


        HashSet<String> strings = new HashSet<>();



//        map.put("4","1");
//
//        map.get("1");
//        System.out.println(map.get("1"));

    }

}
