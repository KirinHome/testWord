package com.fusion.test;


import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class test {


    public static void main(String[] args) {
        Map<String, String> map = Maps.newHashMap();
        for (int i = 0; i < 5; i++) {
            map.put("key_" + i, "val_" + i);
        }
        map.forEach(
                (Key,Value) -> System.out.println(Key + "----" + Value)
        );

        Set<String> set = Sets.newHashSet();
        set.add("1");
        set.add("2");
        set.add("3");

        Set<String> sets = Sets.newHashSet();
        set.forEach(System.out::println);

        sets.addAll(set.stream().collect(Collectors.toList()));
    }



}
