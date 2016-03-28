package com.henry.redis;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DataTypes {
    private static Jedis jedis = new Jedis("123.57.136.60");
    public static void main(String[] args) {
        strings();
        hashes();
        lists();
        sets();
        sortedSets();
    }

    private static void strings(){
        jedis.set("key", "String_value");
        String value = jedis.get("key");
        System.out.println("value = " + value);
    }

    private static void hashes(){
        Map<String,String> map = new HashMap<String, String>();
        map.put("username","henry");
        map.put("sex","male");
        jedis.hmset("hash",map);
        Map<String,String> valueMap=jedis.hgetAll("hash");
        System.out.println("valueMap = " + valueMap);
        String username = jedis.hget("hash","username");
        System.out.println("username = " + username);
    }

    private static void lists(){
        jedis.lpush("list", "1");
        jedis.lpush("list", "4");
        jedis.rpush("list", "2");
        jedis.rpush("list", "5");
        List list = jedis.lrange("list", 0, -1);
        System.out.println(list.toString());
        List sortList = jedis.sort("list");
        System.out.println("sortList = " + sortList);
    }

    private static void sets(){
        jedis.sadd("set","1","2","3");
        Set<String> set = jedis.smembers("set");
        System.out.println("set = " + set);
        boolean isExist = jedis.sismember("set","20");
        System.out.println("isExist = " + isExist);
    }

    private static void sortedSets(){
        jedis.zadd("zSet",5,"mesage1");
        jedis.zadd("zSet",2,"mesage2");
        jedis.zadd("zSet",3,"mesage3");
        Set<String> set = jedis.zrange("zSet",0,-1);
        System.out.println("set = " + set);
    }
}
