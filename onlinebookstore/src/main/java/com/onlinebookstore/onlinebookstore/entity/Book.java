package com.onlinebookstore.onlinebookstore.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_book")
public class Book {
	
	private Integer bookId;
	private String sku;
	private String bookName;
	private String description;
	private Double unitPrice;
	private String imageURL;
	private Boolean active;
	private Integer stockNumber;
	private Date dateCreated;
	private Date lastUpdated;
	private BookCategory categoryId;
	
	

}
