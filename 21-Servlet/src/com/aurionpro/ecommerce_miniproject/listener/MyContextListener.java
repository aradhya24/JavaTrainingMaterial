package com.aurionpro.ecommerce_miniproject.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyContextListener implements ServletContextListener {

	 @Override
	    public void contextInitialized(ServletContextEvent sce) {
	        ServletContext context = sce.getServletContext();
	        context.setAttribute("onlineUsers", 0);
	        context.setAttribute("portalMotto", "Shop Smart, Live Better!");
	    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("[Context Destroyed] E-Commerce Application shutdown.");
    }
}