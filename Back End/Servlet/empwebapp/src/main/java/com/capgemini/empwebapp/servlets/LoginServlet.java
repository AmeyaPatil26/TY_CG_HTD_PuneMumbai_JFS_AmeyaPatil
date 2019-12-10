package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.empwebapp.beans.EmployeeInfoBean;
import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOJpaImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//get the form data
		 int empIdVal = Integer.parseInt(req.getParameter("empId"));
		 String password = req.getParameter("password");
		 
		 EmployeeDAO dao = new EmployeeDAOJpaImpl();
		 EmployeeInfoBean employeeInfoBean = dao.authenticate(empIdVal, password);
		 
		 resp.setContentType("text/html");
		 PrintWriter out = resp.getWriter();
		 out.println("<html>");
		 out.println("<body>");
		 
		 RequestDispatcher dispatcher = null;
		 if(employeeInfoBean != null) {
			 //Valid credential
			 HttpSession session = req.getSession(true);
			 session.setMaxInactiveInterval(60);
			 session.setAttribute("empInfo", employeeInfoBean);
			 out.println("<h2 style='color: navy'>Hello" + employeeInfoBean.getEmpName() +"</h2>");
			  dispatcher = req.getRequestDispatcher("./homePage.html");
			  
		 } else {
			 //Invalid credential
			 out.println("<h2 style='color: red'>Invalid Credential</h2>");
			 dispatcher = req.getRequestDispatcher("./loginForm.html");
		 }
		 dispatcher.include(req, resp);
		 out.println("</body>");
		 out.println("</html>");
		 
	}//End of doPost

}//End of Class
