package com.aurionpro.ecommerce_miniproject.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MySessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
	    ServletContext context = se.getSession().getServletContext();
	    Integer count = (Integer) context.getAttribute("onlineUsers");
	    int newCount = (count == null) ? 1 : count + 1;
	    context.setAttribute("onlineUsers", newCount);
	    System.out.println("[Session Created] Online users: " + newCount);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
	    ServletContext context = se.getSession().getServletContext();
	    Integer count = (Integer) context.getAttribute("onlineUsers");
	    int newCount = (count == null || count <= 0) ? 0 : count - 1;
	    context.setAttribute("onlineUsers", newCount);
	    System.out.println("[Session Destroyed] Online users: " + newCount);
	}
}
