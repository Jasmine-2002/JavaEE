package session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/SessionDemo1")
public class SessionDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //一次会话的多次请求间共享数据
        //session实现依赖于cookie

        HttpSession session = request.getSession();
        System.out.println(session);

        //期望客户端关闭,服务器不关闭，session也能相同
        Cookie c =new Cookie("JSEESIONID",session.getId());
        c.setMaxAge(60*60);
        response.addCookie(c);

        /*客户端不关闭，服务器重启，确保数据不丢失（tomcat做了）
        session钝化：服务器正常关闭之前，将session对象序列化到硬盘上
        session活化：服务器启动后，将session 文件转化为内存中的session对象
         */
        //session.setAttribute("msg","hello session");
    }
}
