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

@WebServlet("/updateEmployee")
public class UpdateEmployeeServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		HttpSession session = req.getSession(false);
		if (session != null) {
			// Valid session
			// Get the form data
			int empId = Integer.parseInt(req.getParameter("empId"));
			String empName = req.getParameter("empName");
			String password = req.getParameter("password");
			String designation = req.getParameter("designation");
			long mobile = Long.parseLong(req.getParameter("mobile"));
			
			EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
			employeeInfoBean.setEmpId(empId);
			if(empName != null && !empName.isEmpty()) {
				employeeInfoBean.setEmpName(empName);
			}
			
			
			if(designation != null && !designation.isEmpty()) {
				employeeInfoBean.setDesignation(designation);
			}
			
			if(password != null && !password.isEmpty()) {
				employeeInfoBean.setPassword(password);
			}
			
			
			EmployeeDAO dao = new EmployeeDAOJpaImpl();
			boolean isUpdate = dao.updateEmployee(employeeInfoBean);

			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			if (isUpdate) {
				out.println("<h2>Employee Record Updated successfully</h2>");
			} else {
				out.println("<h2 style'color: red'>Unable to add EMployee Record!!!</h2>");
			}
			out.println("</body>");
			out.println("</html>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("./updateEmployeeForm.html");
			dispatcher.include(req, resp);
		} else {
			// Invalid Session
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h2 style='color:red'>Please Login First!</h2>");
			out.println("</body>");
			out.println("</html>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("./loginForm.html");
			dispatcher.include(req, resp);
		}
	}//end od doPost()

}//end of class
