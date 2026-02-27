package com.book.Entity;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
	private long id;
	private String userId;
	private String password;
	private String address;
	private String tel;
	private LocalDateTime createdAt;
}
