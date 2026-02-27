package com.book.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.book.Entity.User;

@Mapper
public interface UserRepository {
	public List<User> findAll();
}
