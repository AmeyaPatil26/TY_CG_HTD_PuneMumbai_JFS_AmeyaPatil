package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/include")
public class IncludeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//	String url="./currentDate"; //dynamic resource
		String url= "./searchEmployeeForm.html";
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello User!!</h1><br>");
		out.println("</body>");
		out.println("</html>");
		RequestDispatcher dispatcher = req.getRequestDispatcher(url);
		dispatcher.include(req, resp);
		
	}//end of doGet()
	
}// end of class
