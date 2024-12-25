package com.example.Book.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Book.pojo.Book;
import com.example.Book.service.impl.BookService;

@RestController
@RequestMapping("/book")
@CrossOrigin
public class BookController {

	Logger log = LoggerFactory.getLogger(BookController.class);

	@Autowired
	private BookService bookService;

	@PostMapping("/add")
	public ResponseEntity<Book> saveBook(@RequestBody Book book) {
		log.info("RequestBody{}", book);
		Book bookData;
		bookData = bookService.saveBook(book);
		log.info("Bookdata{}", bookData);
		System.out.println(bookData);
		if (bookData != null) {
			System.out.println( "Book details saved successfully");
		} else {
			System.out.println( "User dont have access to add the book");
		}
		return ResponseEntity.ok(bookData);
	}

	@GetMapping("/get")
	public Optional<Book> fetchBook(@RequestParam Integer id) {
		return bookService.findById(id);

	}
	
	@GetMapping("/getall")
	public List<Book> fetchAllBook()
	{
		return bookService.findAllBook();
	}
	
	@DeleteMapping("/delete")
	public String deleteBook(@RequestParam Integer id)
	{
		return "Book Details deleted Successfully";
		
	}

}