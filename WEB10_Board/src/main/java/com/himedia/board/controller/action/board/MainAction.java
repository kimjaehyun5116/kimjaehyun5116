package com.himedia.board.controller.action.board;

import java.io.IOException;
import java.util.ArrayList;

import com.himedia.board.controller.action.Action;
import com.himedia.board.dao.BoardDao;
import com.himedia.board.dto.BoardDto;
import com.himedia.board.util.Paging;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MainAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 게시판의 게시물을 모두 조회해서  request 에 담고 main.jsp  로  포워딩합니다
		BoardDao bdao = BoardDao.getInstance();
		Paging paging = new Paging();
		
		int page = 1;
		if(request.getParameter("page")!=null) 
			page = Integer.parseInt( request.getParameter("page"));
			
		paging.setPage(page);	// 결정된 page값을 객체의 해당 멤버변수에 저장합니다
		
		// 1. 페이지 구성요소들을 계산하기 위해 총 레코드 갯수부터 조회
		int count = bdao.getAllCount();
		System.out.println("레코드 갯수 : " + count);
		
		
		
		ArrayList<BoardDto> list =  bdao.getAllBoard();
		
		for( BoardDto bdto : list) {
			// bdto.getNum() 으로 reply 테이블에서 댓글 갯수를 조회하고 결과를 bdto.setReplycnt 로 저장
		    count = bdao.getReplyCount(bdto.getNum());
			bdto.setReplycnt(count);
			System.out.println(count);
		}
		request.setAttribute("boardList", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
		rd.forward(request, response);
	}

}










