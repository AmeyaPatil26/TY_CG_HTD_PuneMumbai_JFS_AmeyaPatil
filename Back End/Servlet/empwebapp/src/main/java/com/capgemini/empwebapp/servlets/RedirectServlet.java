package com.capgemini.empwebapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//redirect to external resource
		String url="http://www.youtube.com";
		//redirect to internal resource
		//String url = "./currentDate";
		
		resp.sendRedirect(url); //sendRedirect use to redirect to another internal or external page
		
	}//end of doGet()
}//end of lass
