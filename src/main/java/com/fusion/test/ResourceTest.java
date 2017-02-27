package com.fusion.test;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

public class ResourceTest {



    public static void testResourceByte () {

        Resource resource = new ByteArrayResource("hello word".getBytes());

        if (resource.exists()){
            dumpStream(resource);
        }
    }


    public static void dumpStream (Resource resource) {
        InputStream is = null;
        try {
            //1.获取文件资源
            is = resource.getInputStream();
            //2.读取资源
            byte[] descBytes = new byte[is.available()];
            is.read(descBytes);
//            System.out.println(new StringTest(descBytes));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(StringTest[] args) {


        testResourceByte();
    }

}
