package com.jspServletDemo;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
public class FirstServlet implements Servlet{
 ServletConfig config;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "My Servlet comes........!";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config=config;
		System.out.println("Creating obj");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Serviceing..");
		res.setContentType("text/html");
		PrintWriter pW=res.getWriter();
		pW.println("My Servlet first prgm !!");
	}

}
