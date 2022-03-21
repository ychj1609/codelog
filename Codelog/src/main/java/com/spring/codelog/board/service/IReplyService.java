package com.spring.codelog.board.service;

import java.util.List;

import com.spring.codelog.board.model.ReplyVO;

public interface IReplyService {
	
    // 댓글 목록
    public List<ReplyVO> list(Integer rno);
    // 댓글 입력
    public void create(ReplyVO vo);
    // 댓글 수정
    public void update(ReplyVO vo);
    // 댓글 삭제
    public void delete(Integer rno);

}