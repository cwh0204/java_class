package com.test;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class frontCont
 */
@WebServlet("*.do")
public class frontCont extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());

		System.out.println("요청 URI: " + requestURI);
		System.out.println("매핑된 커맨드: " + command);

		// 2. 요청에 따라 적절한 컨트롤러(작업 클래스)로 위임
		if ("/test.do".equals(command)) {
		    System.out.println("들어옴");
		    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/test.jsp");
		    dispatcher.forward(request, response);
		}
	}
}
