package com.controller;

import com.bean.QueryVo;
import com.bean.User;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Date 2021/12/8 - 下午 2:32
 */
@Controller   //web注解
@RequestMapping("/user")     //一级访问目录  http://localhost:8080/SpringMVC_demo1/user/quick3
@SessionAttributes("username")  //向request域存入的key为username时，同步到session域中
public class UserController {


    /*@RequestMapping("/quick")
    public String quick() {
        //业务处理
        System.out.println("spring入门成功");
        //视图跳转   跳转形式是 请求转发跳转是网址栏不会变的  重载转发是会变的
        return "WEB-INF/pages/Controller_demo1.jsp";
    }*/

    //return 没有.jsp是   MVC.xml  视图解析器

    //模式设置方法方式为get和参数为?accountNmae    /quick?accountNmae
    //@RequestMapping(path = "/quick",method = RequestMethod.GET,params = {"accountNmae"})
    @RequestMapping("/quick")
    public String quick() {
        //业务处理
        System.out.println("spring入门成功");
        //视图跳转   跳转形式是 请求转发跳转是网址栏不会变的  重载转发是会变的
        return "Controller_demo1";
    }

    @RequestMapping("/quick2")
    public String quick2() {
        //业务处理
        System.out.println("spring入门成功2");
        //视图跳转   跳转形式是 请求转发跳转是网址栏不会变的  重载转发是会变的
        return "a";
    }

    @RequestMapping("/quick3")
    public String quick3() {
        //业务处理
        System.out.println("spring入门成功3");
        //视图跳转   跳转形式是 请求转发跳转是网址栏不会变的  重载转发是会变的
        return "b";
    }

    //获取基本类型参数
    @RequestMapping("/simplePanram")
    public String simplePanram(Integer id, String username) {
        //业务处理
        System.out.println(id);
        System.out.println(username);
        //视图跳转   跳转形式是 请求转发跳转是网址栏不会变的  重载转发是会变的
        return "Controller_demo1";
    }

    //对象集合
    @RequestMapping("/pojoParam")
    public String pojoParam(User user) {
        //业务处理
        System.out.println(user);
        //视图跳转   跳转形式是 请求转发跳转是网址栏不会变的  重载转发是会变的
        return "Controller_demo1";
    }

    //数组集合
    @RequestMapping("/arrayParam")
    public String arrayParam(Integer[] ids) {
        //业务处理
        System.out.println(Arrays.toString(ids));
        //视图跳转   跳转形式是 请求转发跳转是网址栏不会变的  重载转发是会变的
        return "Controller_demo1";
    }

    //集合(复杂)
    @RequestMapping("/queryParam")
    public String queryParam(QueryVo queryVo) {
        //业务处理
        System.out.println(queryVo);
        //视图跳转   跳转形式是 请求转发跳转是网址栏不会变的  重载转发是会变的
        return "Controller_demo1";
    }

    //获取自定义转换器
    @RequestMapping("/converterParam")
    public String converterParam(Date birthday) {
        System.out.println(birthday);
        return "Controller_demo1";
    }

    //分页查询
    // RequestParam当请求的参数name名称与Controller的业务方法参数名称不一致时，就需要通过@RequestParam注解显示的绑定
    /**
     * name:匹配页面pageNo=2
     * defaultValue：默认值
     * required：设置是否必须传递该参数，默认值:true，如果设置默认值，自动改为false
     */
    @RequestMapping("/findByPage")
    public String findByPage(@RequestParam(name = "pageNo", defaultValue = "1", required = false) Integer pageNum, @RequestParam(defaultValue = "5", required = false) Integer pageSizs) {
        System.out.println(pageNum);//2
        System.out.println(pageSizs);//5
        return "Controller_demo1";
    }

    //RequestHeader:获取请求头的数据。
    @RequestMapping("/requestHeader")
    public String requestHeader(@RequestHeader("Cookie") String cookie) {
        System.out.println(cookie);
        return "Controller_demo1";
    }

    //CookieValue:获取cookie中的数据。 ("获取cookie中的JSESSIONID  ")
    @RequestMapping("/cookieValue")
    public String cookieValue(@CookieValue("JSESSIONID") String jsessionId) {
        System.out.println(jsessionId);
        return "Controller_demo1";
    }

    //获取selectAPI
    @RequestMapping("/selectAPI")
    public String selectAPI(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession) {
        System.out.println(request);
        System.out.println(response);
        System.out.println(httpSession);
        return "Controller_demo1";
    }

    //请求转发和重定向
    @RequestMapping("/returnVoid")
    public void returnVoid(HttpServletRequest Request,HttpServletResponse Response) throws ServletException, IOException {
        //Request对象请求转发
        //Request.getRequestDispatcher("/WEB-INF/pages/Controller_demo1.jsp").forward(Request,Response);

        //直接放回数据
        //Response.setContentType("text/html;charset=utf-8");
        //Response.getWriter().write("哈利");

        //Response对象重定向  /WEB-INF安全目录不能请求访问，只可以服务器内部转发
        Response.sendRedirect(Request.getContextPath()+"/index.jsp");
    }

    //用forward关键字 进行请求转发
    @RequestMapping("/forward")
    public String forward(Model model) {
        model.addAttribute("username", "哈罗");
        return "forward:/WEB-INF/pages/Controller_demo1.jsp";
    }

    //@SessionAttributes :的效果多个请求之间共享数据
    @RequestMapping("/returnString")
    public String returnString() {
        return "Controller_demo1";
    }

    //Redirect关键字 重定向
    @RequestMapping("/redirect")
    public String redirect(Model model) {
        //model：底层使用request.setAttribute  范围是一次请求     重定向是两次请求所以显示不出index的${}内容
        model.addAttribute("username", "你好");
        return "redirect:/index.jsp";
    }

    //ModelAndView 页面跳转方式一
    @RequestMapping("/returnModelAndView")
    public ModelAndView returnModelAndView() {
        /*
            Model:模型  作用封装数据
            AndView:视图 展示数据
         */
        ModelAndView modelAndView1 = new ModelAndView();
        //设置模型
        modelAndView1.addObject("username", "modelAndView1方式一");
        //设置视图   视图解析器，解析modelAndView1  所以不加后缀
        modelAndView1.setViewName("Controller_demo1");
        return modelAndView1;
    }

    //ModelAndView 页面跳转方式二
    @RequestMapping("/returnModelAndView2")
    public ModelAndView returnModelAndView2(ModelAndView modelAndView) {
        /*
            Model:模型  作用封装数据
            AndView:视图 展示数据
         */
        //设置模型
        modelAndView.addObject("username", "modelAndView1方式二");
        //设置视图   视图解析器，解析modelAndView1  所以不加后缀
        modelAndView.setViewName("Controller_demo1");
        return modelAndView;
    }

    //Ajax异步交互
    @RequestMapping("/ajaxRequest")
    @ResponseBody   //将数据放回前台
    public List<User> ajaxRequest(@RequestBody List<User> list) {
        System.out.println(list);
        return list;
    }


}
