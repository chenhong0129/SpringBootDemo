package cn.ucmed.web;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ucmed on 2017/5/23.
 * 返回字符串"hello world!!!"   注解是用：@RestController
 */

//@RestController与@Controller：
//相同点：都是用来表示Spring某个类的是否可以接收HTTP请求
//不同点：@Controller标识一个Spring类是Spring MVC controller处理器
//       @RestController：是@Controller和@ResponseBody的结合体，两个标注合并起来的作用。

@RestController
//@Controller
//@ResponseBody
public class HelloController {
    private static final Logger LOG = Logger.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String index(){
        LOG.info("hello!!!!!!!!!!!!!!!!!!!!!!!");
        return "hello world!!!";
    }
}
