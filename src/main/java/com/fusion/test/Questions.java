package com.fusion.test;

public class Questions {


    /**
     * questions1
     */
    private static void questions1() {
        String str = "str";
        Questions.appendStr(str);
        System.out.println(str);
    }

    private static void appendStr(String str) {
        str += "1";
    }


    /**
     * inner class A B
     */
    static class A {
        private static String staticStr = initStaticStr();
        {
            System.out.print("1");
        }

        private String str = initStr();

        public A() {
            System.out.print("2");
        }

        private static String initStaticStr() {
            System.out.print("4");
            return "initStaticStr";
        }

        private String initStr() {
            System.out.print("3");
            return "initStr";
        }
    }

    static class B extends A {
        public B() {
            System.out.print("5");
        }
    }
    /**
     * questions2
     */
    private static void questions2() {

        new B();
        System.out.println();
    }



    /**
     * questions3
     */
    private static void questions3() {

        int a = 3, b = 4;

        if (a++ == 3 && ++b == 5 && ++a + b++ == 10
                && a++ == 7 && ++b == 11) {
            System.out.println("a:" + a + "   b:" + b);
        } else {
            System.out.println("a:" + a + "   b:" + b);
        }
    }







    /**
     * questions4
     */
    private static int  questions4() {

        int i = 0;
        try {
            for (; i < 5; i++) {
                if (i == 4) {
                    throw new Exception("i==4");
                }
            }
            i -= i;
        } catch (Exception ignored) {
            return i;
        } finally {
            i += i;
            System.out.println("==="+i);
        }

        return i;
//        System.out.println(i);
    }

    /**
     * questions5
     */
    public static void questions5() {
        int result = 0;
        int i = 2;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
                break;
        }
        System.out.println(result);
    }




    public static void main(String[] args) {
        questions1();
        questions2();
        questions3();
        System.out.println(questions4());
        questions5();
    }

}
