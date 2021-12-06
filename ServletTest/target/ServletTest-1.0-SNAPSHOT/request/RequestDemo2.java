package request;

import com.sun.tools.javac.file.SymbolArchive;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/RequestDemo2")
public class RequestDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获取请求头数据
        String agent=request.getHeader("user-agent");
        String referer=request.getHeader("referer");
        System.out.println("---------------------------------");
        System.out.println(referer);
        if(referer!=null){
            if(referer.contains("/ServletTest_war_exploded")) {
                //System.out.println("正常！！！");
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("正常！！！");
            }
            else{
                //System.out.println("盗链！！！");
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("盗链！！！");
            }
        }
        System.out.println("---------------------------------");
        //判断agent的浏览器版本
        if(agent.contains("Chrome")){
            System.out.println("谷歌。。。");
        }
        else if(agent.contains("Firefox")){
            System.out.println("火狐。。。");
        }
        //获取所有请求头名称
        Enumeration<String> headerNames= request.getHeaderNames();
        //遍历
        while (headerNames.hasMoreElements()){
            String name=headerNames.nextElement();
            String value=request.getHeader(name);
            System.out.println(name+"---"+value);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
