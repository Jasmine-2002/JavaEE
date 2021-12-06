package filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

//转发访问index.jsp过滤器不会被执行
//@WebFilter(value = "/index.jsp",dispatcherTypes = DispatcherType.REQUEST)
//只有转发访问index.jsp过滤器才会被执行
//@WebFilter(value = "/index.jsp",dispatcherTypes = DispatcherType.FORWARD)
//@WebFilter(value = "/*",dispatcherTypes ={DispatcherType.FORWARD,DispatcherType.REQUEST} )
public class FilterDemo4 implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("demo4.......");
        chain.doFilter(request, response);
    }
}
