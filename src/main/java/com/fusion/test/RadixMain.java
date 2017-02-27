package com.fusion.test;

public class RadixMain {

    public static void main(StringTest[] args) {

        /// 10 进制 转换 其他进制
        System.out.println(Integer.toBinaryString(11)); //2 进制
        System.out.println(Integer.toHexString(112)); // 16 进制
        System.out.println(Integer.toOctalString(112)); // 8 进制


        //  其他 进制 转化为十进制
        System.out.println(Integer.parseInt("1110000",2)); // 2进制
        System.out.println(Integer.parseInt("27",8)); // 8 进制
        System.out.println(Integer.parseInt("A8",16)); // 16进制

    }


}
