package servlet;

import javax.servlet.*;
import java.io.IOException;

public class ServletDemo2 implements Servlet {

//    尽量不要再servlet中定义成员变量

    //创建时执行，只执行一次
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init......");
    }

    //获取Servlet配置
    @Override
    public ServletConfig getServletConfig() {

        return null;
    }

    //每次servlet被访问时执行
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service......");
    }

    //获取Servlet信息
    @Override
    public String getServletInfo() {
        return null;
    }

    //servlet正常关闭时执行，只执行一次
    @Override
    public void destroy() {
        System.out.println("destroy......");
    }
}
