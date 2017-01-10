package com;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	user = new User();
	user.setAge(Integer.parseInt(request.getParameter("age")));
	user.setName(request.getParameter("Name"));
	user.setNickName(request.getParameter("nickname"));
	user.setPassword(request.getParameter("password"));
	user.setRePassword(request.getParameter("password2"));
	if(user.isValid()){
		request.getSession().setAttribute("user", user);//session代码
		response.sendRedirect(request.getContextPath()+"/ch5/registResult_1.jsp");
	}else{
		response.sendRedirect(request.getContextPath()+"/ch5/fail.jsp");
	}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
	}
	
}
