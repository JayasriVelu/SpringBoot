package com.example.Book.service.impl;

import java.util.List;
import java.util.Optional;

import com.example.Book.pojo.Book;

public interface BookService {
	
	public Optional<Book> findById(Integer id);
	Book saveBook(Book book);
	List<Book> findAllBook();
	public void deleteBook(Integer id);

}
