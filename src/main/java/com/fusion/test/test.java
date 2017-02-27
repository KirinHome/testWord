package com.fusion.test;


//import com.google.common.collect.Sets;
//

//import java.util.Set;
//import java.util.stream.Collectors;

import org.apache.http.HttpEntity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class test {


//    public static void main(StringTest[] args) {

//        String a = "a,b,,c,,d,,,,,,";
//        String[] s = a.split(",");
//
//        System.out.println(s.length);


//        Map<String, String> map = Maps.newHashMap();
//        for (int i = 0; i < 5; i++) {
//            map.put("key_" + i, "val_" + i);
//        }
//        map.forEach(
//                (Key,Value) -> System.out.println(Key + "----" + Value)
//        );
//
//        Set<String> set = Sets.newHashSet();
//        set.add("1");
//        set.add("2");
//        set.add("3");
//
//        Set<String> sets = Sets.newHashSet();
//        set.forEach(System.out::println);
//
//        sets.addAll(set.stream().collect(Collectors.toList()));
//    }

//    public static void main(String[] args) {

//        Date date1 = new Date(2015, 11, 10);
//        Date date2 = new Date(2016, 5, 11);
//
//
//        date1.setMonth(6);
//
//        if ((date2.getYear() - date1.getYear()) > 0 && (12 - date2.getMonth() + date1.getMonth()) > 6){
//                System.out.println("超过半年");
//        }
//
//        if ((date2.getYear() - date1.getYear()) == 0 && (date2.getMonth() - date1.getMonth()) > 6){
//            System.out.println("超过半年");
//        }
//
//
//        if ((date2.getYear() - date1.getYear()) == 0 && (date2.getMonth() - date1.getMonth()) == 6 && (date2.getDate() > date1.getDate())){
//            System.out.println("超过半年");
//        }

//        System.out.println(date2.getDate());
//
//        int monthDiff = (date2.getYear() - date1.getYear()) * 12 + date2.getMonth() - date1.getMonth();

//        System.out.println(monthDiff);
//        List<String> list = new ArrayList<>(2);
//        System.out.println(list.size());
//        list.add("12");
//        System.out.println(list.size());
//        list.set(1,"22");
//        System.out.println(list.size());
//        list.add("111");
//        System.out.println(list.size());
//        System.out.println(list.toString());

//    }


//    public static void main(String[] args) {
//
//        String str ;
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(2013, 7, 31, 17, 35, 44);
//        calendar.add(Calendar.MONTH, 6);
//
//        str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS")).format(calendar.getTime());
//        System.out.println(str);
//
//    }

//    public static void main(String[] args) {
//
//        for (int i = 0; i < 5; i++) {
//
//            String s = "";
//            for (int j = 0; j <= i; j++) {
//                    s += " * ";
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        int size = 5;
//        for (int i = 0; i < size; i++) {
//            for (int x = 1; x <= size - i; x++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i * 2 + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int x = 0; x < size / 2; x++) {
//            for (int s = 1; s <= size; s++) {
//                System.out.print(" ");
//            }
//            System.out.println("*");
//        }
//    }


    public static void main(String[] args) {
        float test = test(1f);

        System.out.println(test);
    }

    private static float test(float sum) {
        if(sum==10000){
            return sum;
        } else{
            return sum+test(sum+1);
        }
    }
}
