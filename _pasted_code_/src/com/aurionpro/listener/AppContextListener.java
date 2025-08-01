package com.aurionpro.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppContextListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        ServletContext ctx = sce.getServletContext();
        ctx.setAttribute("visitCount", 0);
        ctx.setAttribute("fictionCount", 0);
        ctx.setAttribute("scienceCount", 0);
        ctx.setAttribute("techCount", 0);
        System.out.println("ServletContext initialized.");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext destroyed.");
    }
}
