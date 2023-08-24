package com.velocity.service;

import java.util.List;

import com.velocity.model.Book;
import com.velocity.model.User;

public interface BookService {

	public  List<Book> getAll();
	
	public void create(Book book);
	
	public void update(Integer id, Book book);
	
	public void delete(Integer id);
	
}
