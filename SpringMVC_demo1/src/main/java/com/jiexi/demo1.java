package com.jiexi;

/**
 * @Date 2021/12/8 - 下午 2:57
 */
public class demo1 {

    //解析demo1

    /*
        //1.
        创建一个string类  打印一句话 return是Controller_demo1.jsp 跳转页面
        @Controller 类需要加 web注解 和 方法上加 @RequestMapping("/quick") 访问路径

        //2.编写Controller_demo1.jsp  内容 在浏览器显示一句话

        //3.编写springMVC核心文件  因为注解开发 需要扫描包标签

        //4.此时需要Tomcat启动   /quick 是找不到的，要在web.xml文件  加上<servlet>标签  DispathcerServlet 是前端控制器
        <init-param>标签是 加载springMVC核心文件的   <load-on-startup>标签是加载  init标签的

        此时整个写好了
        步骤分析 启动Tomcat 先到4 再到 3 再到 1 再到 2
     */
}
