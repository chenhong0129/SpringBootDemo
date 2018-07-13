package cn.ucmed.mybatis;

import cn.ucmed.model.User;
import cn.ucmed.service.UserService;
import cn.ucmed.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by ucmed on 2018/3/15.
 */

@Controller
public class MyBatisTest {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/mybatis", method = RequestMethod.GET)
    public String getBatisTest(Map<String, Object> map){
        List<User> list = userService.findAllUser(1, 1000);
        map.put("list", list);
        return "test/mybatis";
    }

}
