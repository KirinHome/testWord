package com.fusion.test.collections;

import java.util.LinkedList;

public class linked {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
    }

}
