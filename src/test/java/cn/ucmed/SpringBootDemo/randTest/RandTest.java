package cn.ucmed.SpringBootDemo.randTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chenhong on 2018/4/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RandTest {
    @Value("${rand.str}")
    private String str;
    @Value("${rand.intid}")
    private int anInt;
    @Value("${rand.longid}")
    private long aLong;
    @Value("${rand.number}")
    private int number;
    @Value("${rand.range}")
    private int range;

    @Test
    public void getRand(){
        System.out.println(str);
        System.out.println(anInt);
        System.out.println(aLong);
        System.out.println(number);
        System.out.println(range);
    }
}
