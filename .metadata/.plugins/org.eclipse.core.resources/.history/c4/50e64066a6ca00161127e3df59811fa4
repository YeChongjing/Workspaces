package com;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class Success
 */
@WebFilter(urlPatterns={"/Success.jsp"})
public class Success implements Filter {

    /**
     * Default constructor. 
     */
    public Success() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse rep=(HttpServletResponse)response;
		HttpSession session=req.getSession();
		String path=req.getRequestURI();
		if(path.indexOf("login.jsp")>-1){
			chain.doFilter(request, response);
			return;
		}
		if(path.indexOf("LoginServlet")>-1){
			String username=(String)session.getAttribute("username");
			if(username==null){
				rep.sendRedirect(req.getContextPath()+"/login.jsp");
			}
		}
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
