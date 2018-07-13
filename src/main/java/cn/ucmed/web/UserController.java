package cn.ucmed.web;

import freemarker.log.Logger;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;

/**
 * Created by ucmed on 2017/5/23.
 * 返回user.vm页面，注解用：@Controller
 */

@Controller
public class UserController {
    @Autowired
    private Configuration configuration;
    private static final Logger logger = Logger.getLogger("UserController");

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String user(Map<String, Object> model) throws Exception{
        model.put("message", "这是测试的内容。。。");
        model.put("toUserName", "张三");
        model.put("fromUserName", "老许");
        return "test/user";
    }
}
