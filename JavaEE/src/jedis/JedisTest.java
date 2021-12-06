package jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class JedisTest {
    @Test
    public void test1(){
        Jedis jedis =new Jedis("localhost",6379);

        jedis.set("username","zxw");

        jedis.close();
    }

    //string
    @Test
    public void test2(){
        Jedis jedis =new Jedis();//连本机可以使用空参

        jedis.set("username","zxw");
        String username=jedis.get("username");
        System.out.println(username);

        //一段时间自动删除
        jedis.setex("activecode",20,"haha");

        jedis.close();
    }

    //hash
    @Test
    public void test3(){
        Jedis jedis =new Jedis("localhost",6379);

        jedis.hset("user","name","zjl");
        jedis.hset("user","age","18");
        jedis.hset("user","gender","male");

        String name = jedis.hget("user", "name");

        Map<String, String> user = jedis.hgetAll("user");
        Set<String> keySet = user.keySet();
        for(String key:keySet){
            String value = user.get(key);
            System.out.println(value);
        }
        jedis.close();
    }

    //list 可重复元素
    @Test
    public void test4(){
        Jedis jedis =new Jedis("localhost",6379);

        jedis.lpush("mylist","a","b","c");
        jedis.rpush("mylist","a","b","c");
        List<String> mylist = jedis.lrange("mylist", 0, -1);
        System.out.println(mylist);

        String element1 = jedis.lpop("mylist");
        String element2 = jedis.rpop("mylist");
        System.out.println(element1);
        System.out.println(element2);

        jedis.close();
    }

    //set 不可重复
    @Test
    public void test5(){
        Jedis jedis =new Jedis("localhost",6379);

        jedis.sadd("myset","java","php","c++");
        Set<String> myset = jedis.smembers("myset");
        System.out.println(myset);

        jedis.close();
    }

    //sortedset 不可重复 元素有序
    @Test
    public void test6(){
        Jedis jedis =new Jedis("localhost",6379);

        jedis.zadd("sortedset",3,"hurry");
        jedis.zadd("sortedset",5,"emma");
        jedis.zadd("sortedset",7,"R1SE");

        Set<String> sortedset = jedis.zrange("sortedset", 0, -1);
        System.out.println(sortedset);


        jedis.close();
    }

    //jedis连接池
    @Test
    public void test7() {

        JedisPool jedisPool = new JedisPool();
        Jedis jedis = jedisPool.getResource();


        jedis.set("aoao","xixi");

        jedis.close();
    }




}
