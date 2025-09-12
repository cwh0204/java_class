package com.hello.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HelloImp
 */
@WebServlet("/hello")
public class HelloImp extends HttpServlet implements Hello {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloImp() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<h1>Welcom to HelloWorld!</h1>");
		out.close();
	}
    
    @Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
		doGet(request, response);
	}
}
