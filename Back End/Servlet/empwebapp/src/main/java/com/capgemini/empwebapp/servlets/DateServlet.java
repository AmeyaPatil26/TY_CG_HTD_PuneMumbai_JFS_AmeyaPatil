package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet {
	
	//Instantiation Phase
	public DateServlet() {
		System.out.println("its instantiation ");
	}
	
	//Initialization phase
	 @Override
	public void init() throws ServletException {
		System.out.println("Initi phase");
	}
	
	 //service phase
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("It's service phase");
		Date date= new Date(); //to fetch current date n time
//		resp.setHeader("refresh", "1");
		resp.setContentType("text/html"); //type of response  
		
		ServletContext context= getServletContext();
		String companyNameVal = context.getInitParameter("companyName");
		
		PrintWriter out =resp.getWriter();
		out.println("<html>");
//		out.println("<head>");
//		out.println("<meta http-equiv='refresh'content='1'>"); //auto-reload page after 1 sec
//		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Current system date and time-<br>");
		out.println(date +"</h1>");
		out.println("<h2> Context Param value is : "+ companyNameVal +"</h2>");
		out.println("</body>");
		out.println("</html>");
	}//end of doGet()
	
	@Override
	public void destroy() {
		System.out.println("Destroy Phase");
	}

}//end of the class
