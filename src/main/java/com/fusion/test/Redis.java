package com.fusion.test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class Redis {

    private static Jedis jedis;

    public static void main(String[] args) {

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
