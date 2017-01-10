package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.UserBiz;
import biz.impl.UserBizImpl;

import entity.User;

public class IndexServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = new User();
		request.setCharacterEncoding("UTF-8");
		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		UserBiz userbiz = new UserBizImpl();
		if(userbiz.login(user)){
			request.getSession().setAttribute("user", user);
			RequestDispatcher re=request.getRequestDispatcher("WEB-INF/site/success.jsp");
			re.forward(request, response);
		}else{
			System.out.println("您输入有误，请从新输入！");
			RequestDispatcher re=request.getRequestDispatcher("WEB-INF/site/login.jsp");
			re.forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}

}
