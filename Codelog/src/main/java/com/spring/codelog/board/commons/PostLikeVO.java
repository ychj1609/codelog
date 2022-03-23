package com.spring.codelog.board.commons;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostLikeVO {
	private int id;
	private int boardId;
	private String userId;
	private Timestamp likeDate;
	private int pLike;
}
