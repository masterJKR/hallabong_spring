package com.book.Repository;

import org.apache.ibatis.annotations.Mapper;

import com.book.DTO.MemberDTO;

@Mapper
public interface MemberRepository {
	
	// 입력한 회원 가입 데이터 저장 메서드
	public int save(MemberDTO memberDTO);
	
}
