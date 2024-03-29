package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.SeekableByteChannel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.empwebapp.beans.EmployeeInfoBean;

@WebServlet("/logout")
public class LogoutServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session =req.getSession(false);
		if (session != null) {
			EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean) session.getAttribute("empInfo");
			session.invalidate();
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h2 style = 'color:green'>Thanks "+ employeeInfoBean.getEmpName()+"</h2>");
			out.println("<h2 style = 'color:red'>You are successfully Logout! </h2>");
			out.println("</body>");
			out.println("</html>");
		}
		RequestDispatcher dispatcher = req.getRequestDispatcher("./loginForm.html");
		dispatcher.include(req, resp);
	}//end of doGet()
}//end of class
