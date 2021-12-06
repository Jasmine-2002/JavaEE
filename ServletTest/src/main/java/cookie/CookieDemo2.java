package cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/CookieDemo2")
public class CookieDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        //获取cookie
        Cookie[] cs = request.getCookies();
        //遍历cookie
        if(cs!=null){
            for(Cookie c:cs){
                String name=c.getName();
                String value=c.getValue();
                System.out.println(name+":"+value);
            }
        }
    }
}
