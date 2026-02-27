package com.book.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.book.Entity.Board;

@Mapper
public interface BoardRepository {
	
	// 게시글 저장 메서드
	public int save(Board board);
	
	// 게시글 전체 조회 메서드
	public List<Board> findAll();
}



