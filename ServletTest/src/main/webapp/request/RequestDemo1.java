package request;

import sun.lwawt.macosx.CSystemTray;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/RequestDemo1")
public class RequestDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获取请求行
        String method=request.getMethod();
        System.out.println(method);

        //***虚拟目录
        String contextPath=request.getContextPath();
        System.out.println(contextPath);

        //servlet路径
        String servletPath=request.getServletPath();
        System.out.println(servletPath);

        //get方法 请求参数
        String queryString=request.getQueryString();
        System.out.println(queryString);

        //***
        String requestURI=request.getRequestURI();
        StringBuffer requestUIL= request.getRequestURL();
        System.out.println(requestURI);
        System.out.println(requestUIL);

        //协议及版本
        String protocol = request.getProtocol();
        System.out.println(protocol);

        //IP
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String method=request.getMethod();
        System.out.println(method);

        String contextPath=request.getContextPath();
        System.out.println(contextPath);

        String servletPath=request.getServletPath();
        System.out.println(servletPath);

        String queryString=request.getQueryString();
        System.out.println(queryString);

        String requestURI=request.getRequestURI();
        StringBuffer requestUIL= request.getRequestURL();
        System.out.println(requestURI);
        System.out.println(requestUIL);

        String protocol = request.getProtocol();
        System.out.println(protocol);

        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);
    }
}
