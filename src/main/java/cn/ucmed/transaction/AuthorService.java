package cn.ucmed.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by chenhong on 2018/4/28.
 * 通过定义 Author 的 realName 字段长度必须小于等于 5，如果字段长度超过规定长度就会触发参数异常。
   值得注意的是，noRollbackFor 修饰表明不做事务回滚，rollbackFor 修饰的表明需要事务回滚。
 */
@Service("transactional.authorService")
public class AuthorService {

    @Autowired
    private AuthorDao authorDao;

    public int add1(Author author){
        int n = this.authorDao.addAuthor(author);
        if (author.getRealName().length()>5){
            throw new IllegalArgumentException("author real name is too long.");
        }
        return n;
    }

    @Transactional(noRollbackFor = IllegalArgumentException.class)
    public int add2(Author author){
        int n = this.authorDao.addAuthor(author);
        if (author.getRealName().length()>5){
            throw new IllegalArgumentException("author real name is too long.");
        }
        return n;
    }

    @Transactional(rollbackFor = IllegalArgumentException.class)
    public int add3(Author author){
        int n = this.authorDao.addAuthor(author);
        if (author.getRealName().length()>5){
            throw new IllegalArgumentException("author real name is too long.");
        }
        return n;
    }
}
