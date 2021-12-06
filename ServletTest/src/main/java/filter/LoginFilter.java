package filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class LoginFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        String uri = req.getRequestURI();
         if(uri.contains("login.jsp") || uri.contains("/loginServlet")){
             chain.doFilter(request, response);
         }else{
             Object user=((HttpServletRequest) request).getSession().getAttribute("user");
             if(user!=null){
                 chain.doFilter(request, response);
             }else{

                 req.setAttribute("login_msg","尚未登陆");
                 req.getRequestDispatcher("/login.jsp").forward(req,response);
             }
         }

        //chain.doFilter(request, response);
    }
}
