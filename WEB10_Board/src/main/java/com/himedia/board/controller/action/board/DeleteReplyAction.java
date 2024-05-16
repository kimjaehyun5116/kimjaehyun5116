package com.himedia.board.controller.action.board;

import java.io.IOException;
import java.util.ArrayList;

import com.himedia.board.controller.action.Action;
import com.himedia.board.dao.BoardDao;
import com.himedia.board.dto.BoardDto;
import com.himedia.board.dto.ReplyDto;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteReplyAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int replynum = Integer.parseInt( request.getParameter("replynum"));
		int boardnum = Integer.parseInt( request.getParameter("boardnum"));
		
		BoardDao bdao = BoardDao.getInstance();
		bdao.deleteReply(replynum);
		response.sendRedirect("board.do?command=boardViewWithoutCnt&num="+boardnum);

	}

}
