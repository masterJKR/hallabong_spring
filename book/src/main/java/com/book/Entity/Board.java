package com.book.Entity;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class Board {
	private long id;
	private String writer;
	private String title;
	private String content;
	private Date created_at;
	private int hit;
	private String category;
}
