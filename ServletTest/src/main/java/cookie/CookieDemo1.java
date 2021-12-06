package cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/CookieDemo1")
public class CookieDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //作用：不登录情况下 身份识别
        Cookie c=new Cookie("msg","hello");
        //设置cookie存活时间
        c.setMaxAge(30);//cookie持久化到硬盘，持续30秒，后自动删除，是负值浏览器关闭cookie就不存在了（默认就是负值），是0直接删除cookie
        //setPath(String path)设置cookie获取范围
        //发送cookie
        response.addCookie(c);
    }
}
