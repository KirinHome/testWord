package com.fusion.test;

public class StringTT {


    public volatile  static long count = 0;


    public static void inc () {

        try {

            Thread.sleep(1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        count++;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {

                    StringTT.inc();
                }
            }).start();
        }

        System.out.println("运行结果:Counter.count=" + StringTT.count);
    }


}
