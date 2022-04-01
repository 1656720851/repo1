package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Date 2022/3/8 - 下午 12:34
 * RestFul
 */
//@Controller  //web 注解
@RestController   //Controller  + ResponseBody  组合
public class RestFulController {

    //查询
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @ResponseBody //将数据返回前台
    public String get(@PathVariable Integer id) {
        return "get" + ":" + id;
    }

    //添加
    @PostMapping(value = "/user2/{id2}")
    public String post( Integer id2) {
        return "post" + id2;
    }

    //修改
    @PutMapping(value = "/user3")
    public String put() {
        return "put";
    }

    //删除
    @DeleteMapping(value = "/user4/{id}")
    public String delest(@PathVariable Integer id) {
        return "delest"+id;
    }
}
