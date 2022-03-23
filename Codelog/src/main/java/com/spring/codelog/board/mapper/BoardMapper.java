package com.spring.codelog.board.mapper;

import java.util.List;

import com.spring.codelog.board.commons.ImgVO;
import com.spring.codelog.board.model.BoardVO;

public interface BoardMapper {
 public void write(BoardVO vo);

 public void image(ImgVO vo);
 
 public List<BoardVO> getList();
 
 public BoardVO test(int boardId);
 
 public BoardVO read(int boardId);
}
