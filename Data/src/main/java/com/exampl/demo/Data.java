package com.exampl.demo;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.interfaces.RSAKey;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class Data  extends HttpServlet{
	@Override
	public void init(ServletConfig config) throws ServletException {
	
		System.out.println("Servelt Start");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	res.setContentType("text/html");
	PrintWriter pWriter=res.getWriter();
	pWriter.print("<h1>hi how are you</h1>");
	pWriter.print("hi how are you");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Servlet Destroy");
		
	}



	
	

	
	
	

}
