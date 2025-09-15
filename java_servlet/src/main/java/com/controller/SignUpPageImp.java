package com.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUpPageImp
 */
@WebServlet("/signup")
public class SignUpPageImp extends HttpServlet implements SignUpPage{

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpPageImp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    
    
    @Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	request.setCharacterEncoding("UTF-8");
    	String name = request.getParameter("name");
    	String userId = request.getParameter("userId");
    	String password = request.getParameter("password");
    	
    	
    	System.out.println("유저 이름은"+name);
    	System.out.println("유저 아이디는"+userId);
    	System.out.println("유저 비밀번호는"+password);
	}

}
