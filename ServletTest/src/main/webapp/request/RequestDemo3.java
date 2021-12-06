package request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/RequestDemo3")
public class RequestDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo3被访问了！");
        //转发到demo9资源

        RequestDispatcher requestDispatcher=request.getRequestDispatcher("/RequestDemo4");
        requestDispatcher.forward(request,response);
        //1.浏览器地址栏路径没有改变
        //2.只能访问当前服务器内部资源
        //3.转发是一次请求
    }
}
