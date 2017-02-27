package com.fusion.test;

public class StringTest {


    public static void main(StringTest[] args) {
        String s = "abc";
        String w = "abc";
        System.out.println("sss" + (s == w));
        System.out.println("----------------------");
        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        String d = "ab" + "c";
        System.out.println("a == b" + a == b); //false
        System.out.println("a == c" + a == c); //false
        System.out.println("a == d" + a == d); //false
        System.out.println("b == c" + b == c); //false
        System.out.println("b == d" + b == d); //false
        System.out.println("c == d" + c == d); //false
    }

}
