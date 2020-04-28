package com.onlinebookstore.onlinebookstore.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tbl_book")
@Setter
@Getter
@ToString
public class Book implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String sku;
	
	@Column(name = "name")
	private String bookName;
	
	private String description;
	
	@Column(name = "unit_price")
	private BigDecimal unitPrice;
	
	@Column(name = "image_url")
	private String imageURL;
	
	private Boolean active;
	
	@Column(name = "units_in_stock")
	private Integer stockNumber;
	
	@Column(name = "date_created")
	private Date dateCreated;
	
	@Column(name = "last_updated")
	private Date lastUpdated;
	
	@ManyToOne
	@JoinColumn(name = "category_id",nullable = false)
	//@OnDelete(action = OnDeleteAction.CASCADE)
	private BookCategory category;
	
	

}
