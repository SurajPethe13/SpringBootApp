package com.velocity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BookDetails")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer id;
	private String name;
	private String author;
	
	@ManyToOne
	private User user;
	

	public Book() {
		super();
	}
	


	public User getUser() {
		return user;
		
	}



	public void setUser(User user) {
		this.user = user;
	}



	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
}
