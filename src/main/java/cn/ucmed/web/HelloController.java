package cn.ucmed.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ucmed on 2017/5/23.
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "hello world!!!";
    }
}
