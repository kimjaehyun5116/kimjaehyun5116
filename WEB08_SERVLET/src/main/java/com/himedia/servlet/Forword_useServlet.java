package com.himedia.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login.do")
public class Forword_useServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public Forword_useServlet() {
        super();
        
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 현재 서블릿이 method="get"으로 호출될때 실행되는 메서드
		// jsp 페이지에 있던 request 와 response가 전송되어 와서 매개변수 (request, response)에 저장됩니다.
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		if(id.equals("scott")&& pwd.equals("1234")) {
			request.setAttribute("name", "김재현");
			RequestDispatcher rd = request.getRequestDispatcher("CH02/082_LoginOK.jsp");
			rd.forward(request, response);
		}else {
			response.sendRedirect("CH02/081_Login_forward_servlet.jsp");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 현재 서블릿이 method="post"으로 호출될때 실행되는 메서드
		
		doGet(request, response);
	}

}
