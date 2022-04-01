package com.exception;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Date 2022/3/8 - 下午 3:36
 *  自定义异常处理器   存到IOC容器
 */
public class GlobalExceptionResolver implements HandlerExceptionResolver {

    /**
     * Exception  e  实际抛出异常对象
     */

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        //创建一个模型
        ModelAndView modelAndView = new ModelAndView();
        //模型   ex.getMessage  获取异常
        modelAndView.addObject("error", ex.getMessage());
        //视图   走前端处理器，不需要加后缀
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
