package com.henry.redis;

import redis.clients.jedis.Jedis;

public class StartUp {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("123.57.136.60");
        jedis.set("key", "hello redis");
        System.out.println(jedis.get("key"));
    }
}
