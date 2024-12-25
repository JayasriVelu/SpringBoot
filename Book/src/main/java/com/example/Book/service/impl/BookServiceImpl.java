package com.example.Book.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Book.Repository.BookRepository;
import com.example.Book.pojo.Book;
import com.example.Book.pojo.Userinfo;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private UserService userService;

	public Book saveBook(Book book) {
		Book bookData = null;
		try {
			//Userinfo userData = userService.findById(id);
			//System.out.println(userData);
			//boolean enabled = userData.isIsenabled();
			/*if (enabled == true) {*/
				bookData = bookRepository.save(book);
				return bookData;
			//}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bookData;
	}

	public Optional<Book> findById(Integer id) {
		return bookRepository.findById(id);

	}
	
	public List<Book> findAllBook() 
	{
		return bookRepository.findAll();
	}
	
	public void deleteBook(Integer id)
	{
	 bookRepository.deleteById(id);
	}

}
