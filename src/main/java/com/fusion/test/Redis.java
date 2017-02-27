package com.fusion.test;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Redis {

    private static Jedis jedis;

    private static ExecutorService executorService = Executors.newFixedThreadPool(10);

    private static JedisPool jedisPool = null;

    public static void main(StringTest[] args) {

        GenericObjectPoolConfig genericObjectPoolConfig = new GenericObjectPoolConfig();

        genericObjectPoolConfig.setMaxTotal(100);

        jedisPool = new JedisPool(genericObjectPoolConfig, "", 1111);

        executorService.submit(new Runnable() {
            @Override
            public void run() {

                Jedis jedis = null;
                try {

                    Jedis resource = Redis.jedisPool.getResource();

                    resource.setex("",5*60,"");

                }catch (Exception e){
                    e.printStackTrace();
                    if (jedis != null){
                        Redis.jedisPool.returnResource(jedis);
                    }
                }finally {
                    Redis.jedisPool.returnResource(jedis);
                }
            }
        });


//        String redisAddress = "192.168.1.101";
//        int redisPort = 6379;
//        int redisTimeout = 2000;
//
//        JedisPool pool = new JedisPool(new JedisPoolConfig(), redisAddress, redisPort, redisTimeout);
//
//        Jedis jedis = pool.getResource();
//        jedis.set("test123", "lulu");
//
//        pool.returnResource(jedis);
//        JedisPool jedisPool = new JedisPool("192.168.1.101", 6379);


        jedis = new Jedis("192.168.1.101", 6379);

        System.out.println("Connection to server sucessfully");
        //查看服务是否运行
        System.out.println("Server is running: " + jedis.ping());


    }
}
