package listener;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebListener
public class ListenerDemo1 implements ServletContextListener, HttpSessionListener, HttpSessionAttributeListener {

    public ListenerDemo1() {
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        /* This method is called when the servlet context is initialized(when the Web application is deployed). */
        //加载资源文件
        ServletContext servletContext = sce.getServletContext();
        String listenerDemo1 = servletContext.getInitParameter("ListenerDemo1");
        String realPath = servletContext.getRealPath(listenerDemo1);
        try{
            FileInputStream fileInputStream = new  FileInputStream(realPath);
            System.out.println(fileInputStream);
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("creating......");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        /* This method is called when the servlet Context is undeployed or Application Server shuts down. */
        System.out.println("stop......");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        /* Session is created. */
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        /* Session is destroyed. */
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent sbe) {
        /* This method is called when an attribute is added to a session. */
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent sbe) {
        /* This method is called when an attribute is removed from a session. */
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent sbe) {
        /* This method is called when an attribute is replaced in a session. */
    }
}
