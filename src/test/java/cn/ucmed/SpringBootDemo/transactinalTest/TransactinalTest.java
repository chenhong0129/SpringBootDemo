package cn.ucmed.SpringBootDemo.transactinalTest;

import cn.ucmed.transaction.Author;
import cn.ucmed.transaction.AuthorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chenhong on 2018/4/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TransactinalTest {
    @Autowired
    private AuthorService authorService;

//    @Test
    public void add1() throws Exception{
        authorService.add1(new Author("陈虹", "陈虹"));
        authorService.add1(new Author("testTransactional", "testTransactional"));
    }

//    @Test
    public void add2() throws Exception{
        authorService.add2(new Author("陈虹", "陈虹"));
        authorService.add2(new Author("testTransactional", "testTransactional"));
    }

    @Test
    public void add3() throws Exception{
        authorService.add3(new Author("陈虹", "陈虹"));
        authorService.add3(new Author("testTransactional", "testTransactional"));
    }
}
