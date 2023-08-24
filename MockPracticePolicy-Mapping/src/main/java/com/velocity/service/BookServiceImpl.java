package com.velocity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Book;
import com.velocity.model.User;
import com.velocity.repo.BookRepository;
import com.velocity.repo.UserRepository;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepository;
	
//	For update User and Book in Mapping
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public List<Book> getAll() {
		
		return (List<Book>) bookRepository.findAll();
	}

	@Override
	public void create(Book book) {
		
		bookRepository.save(book);
	}

//	@Override
//	public void update(Integer id, Book book) {
//		
//		
//		Optional<Book> bookdataid = bookRepository.findById(id);
//		
//		if(bookdataid.isPresent()) {
//			
//			Book book2 = bookdataid.get();
//			
//			book2.setName(book.getName());
//			book2.setAuthor(book.getAuthor());
//			
//			bookRepository.save(book2);
//
//		}	
//	}

	
	@Override
	public void update(Integer id, Book book) {
		
		Optional<Book> bookdataid = bookRepository.findById(id);
		Optional<User> userdataid = userRepository.findAll(book);
		
		if(bookdataid.isPresent() && userdataid.isPresent()) {
			
			Book book2 = bookdataid.get();
			User user2 = userdataid.get();
			
			book2.setName(book.getName());
			book2.setAuthor(book.getAuthor());
			
			book2.setUser(book.getUser());
			
			bookRepository.save(book2);
			userRepository.save(user2);

		}	
	}
	
	
	@Override
	public void delete(Integer id) {
		bookRepository.deleteById(id);
		
	}

	
	
}
