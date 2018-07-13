package cn.ucmed.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ucmed on 2017/5/23.
 * 返回home.html页面，注解用：@Controller
 */
//@RestController与@Controller：
//相同点：都是用来表示Spring某个类的是否可以接收HTTP请求
//不同点：@Controller标识一个Spring类是Spring MVC controller处理器
//       @RestController：是@Controller和@ResponseBody的结合体，两个标注合并起来的作用。


@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(){
        return "test/home";
    }
}
