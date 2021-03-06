package Response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/ResponseDemo1")
public class ResponseDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Demo1.......");
        //重定向
//        response.setStatus(302);
//        response.setHeader("location","/ServletTest_war_exploded/ResponseDemo2");
        //动态获取虚拟目录
        String contextPath = request.getContextPath();
        //简单重定向方法
         response.sendRedirect(contextPath + "/ResponseDemo2");
    }
}
