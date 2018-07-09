package com.zhangqi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/3/12 0012.
 */

@RestController
public class HelloController {

    @RequestMapping(value = "/hello.do")
    public String hello(){
        return "hello";
    }
}
