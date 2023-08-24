package com.velocity.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

}
