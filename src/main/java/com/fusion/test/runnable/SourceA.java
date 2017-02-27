package com.fusion.test.runnable;

import com.google.common.collect.Lists;

import java.util.List;

public class SourceA {

    private List<String> list = Lists.newArrayList();

    public synchronized void getSource(){
        for (String aList : list) {
            System.out.println(aList);
        }
    }

    public synchronized void setSource(String id) {
        list.add(id);
    }
}
