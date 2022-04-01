package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Date 2022/3/8 - 下午 3:44
 *    测试自定义异常处理器   不能和异常处理器在一个包中
 */
@Controller
public class exceptionController {

    @RequestMapping("/testException")
    public String testException() {
        int i = 1 / 0;
        return "Controller_demo1";
    }
}
