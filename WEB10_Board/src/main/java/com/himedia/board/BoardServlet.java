package com.himedia.board;

import java.io.IOException;

import com.himedia.board.controller.action.Action;
import com.himedia.board.controller.action.LoginAction;
import com.himedia.board.controller.action.LoginFormAction;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BoardServlet
 */
public class BoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String command = request.getParameter("command");
		System.out.println("command : " + command);
		
		Action ac = null;
		if( command.equals("loginForm") ) ac = new LoginFormAction();
		else if(command.equals("login") ) ac = new LoginAction();
		
		ac.execute(request, response);
		
		/*
		if( command.equals("loginForm") ) {
			LoginFormAction lfa = new LoginFormAction();
			lfa.execute(request, response);
		}else if(command.equals("login") ) {
			LoginAction la = new LoginAction();
			la.execute(request, response);			
		}
		*/	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
