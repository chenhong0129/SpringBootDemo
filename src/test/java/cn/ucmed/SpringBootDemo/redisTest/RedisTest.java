package cn.ucmed.SpringBootDemo.redisTest;

import cn.ucmed.SpringBootDemoApplication;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

/**
 * Created by chenhong on 2018/4/23.
 * SpringRunner与SpringJUnit4ClassRunner都可以
 * 指定spring-boot的启动类(直接@SpringBootTest()也可以)
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootDemoApplication.class)
public class RedisTest {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    public void testRedis(){
        ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
        valueOperations.set ("hello3", "redis3");
        valueOperations.set("","",1, TimeUnit.DAYS);
        System.out.println("useRedisDao = " + valueOperations.get("hello3"));
    }
}
