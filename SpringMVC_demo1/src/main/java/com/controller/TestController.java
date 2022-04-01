package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Date 2022/3/8 - 下午 5:04
 */
@Controller
public class TestController {

    @RequestMapping("/targetMethod")
    public String targetMethod() {
        System.out.println("目标方法执行了");
        return "Controller_demo1";
    }
}
