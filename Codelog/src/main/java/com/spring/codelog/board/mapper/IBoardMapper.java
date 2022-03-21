package com.spring.codelog.board.mapper;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.spring.codelog.board.commons.ImgVO;
import com.spring.codelog.board.model.BoardVO;

public interface IBoardMapper {
	// 01. 게시글 작성  
	void write(BoardVO vo);

	  void image(ImgVO vo);
	 
	  BoardVO test(int board_id);
	

   // 02. 게시글 상세보기
    BoardVO read(int board_id) ;
   // 03. 게시글 수정
    void update(BoardVO vo) ;
   // 04. 게시글 삭제
    void delete(int board_id) ;
   // 05. 게시글 전체 목록
    List<BoardVO> listAll() ;
   // 06. 게시글 조회 증가
    void increaseViewcnt(int board_id, HttpSession session) ;

}
