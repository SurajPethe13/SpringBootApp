package com.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Book;
import com.velocity.model.User;
import com.velocity.service.BookService;


@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;
	
	
	@GetMapping("/getAll")
	public List<Book> getAllBooks(){	
		return bookService.getAll();
	}
	
	
	
	@PostMapping("/createbook")
	public void createBook(@RequestBody Book book) {
		bookService.create(book);
	}
	
	@PutMapping("/update/{id}")
	public void update(@PathVariable Integer id, @RequestBody Book book) {
		bookService.update(id, book);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		bookService.delete(id);
	}
	
}
