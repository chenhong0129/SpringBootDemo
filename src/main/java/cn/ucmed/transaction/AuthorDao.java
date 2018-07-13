package cn.ucmed.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by chenhong on 2018/4/28.
 */
@Repository("transactional.authorDao")
public class AuthorDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int addAuthor(Author author){
        return jdbcTemplate.update("insert into t_author(real_name, nick_name) values(?, ?)",
                author.getRealName(), author.getNickName());
    }
}
