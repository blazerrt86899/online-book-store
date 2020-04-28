package com.onlinebookstore.onlinebookstore.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_book_category")
public class BookCategory {
	
	private Integer categoryId;
	private String categoryName;

}
