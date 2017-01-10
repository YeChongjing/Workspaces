package com;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;

@WebListener
public class OnlineCountListener implements ServletContextListener, HttpSessionAttributeListener {
	private ServletContext application=null;
    
    public OnlineCountListener() {
    }
    public void sessionCreated(HttpSessionEvent arg0){
    	arg0.getSession().setMaxInactiveInterval(30);
    }
    public void attributeRemoved(HttpSessionBindingEvent arg0) {
    	if("username".equals(arg0.getName())){
    		int count =(Integer)(application.getAttribute("count"));
    		count--;
    		application.setAttribute("count", count);
    	}
    }

    public void attributeAdded(HttpSessionBindingEvent arg0) {
    	if("username".equals(arg0.getName())){
    		int count =(Integer)(application.getAttribute("count"));
    		count++;
    		application.setAttribute("count", count);
    	}
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0) {
        application=arg0.getServletContext();
        application.setAttribute("count", 0);
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0) {
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
    }
	
}
