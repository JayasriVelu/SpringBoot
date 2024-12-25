package com.example.Book.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String bookname;
	private int yearofpublish;
	private String author;
	
	public Book()
	{
		
	}

	public Book(Integer id, String bookname, int yearofpublish, String author) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.yearofpublish = yearofpublish;
		this.author = author;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBook(String bookname) {
		this.bookname = bookname;
	}

	public int getYearofpublish() {
		return yearofpublish;
	}

	public void setYearofpublish(int yearofpublish) {
		this.yearofpublish = yearofpublish;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookname=" + bookname + ", yearofpublish=" + yearofpublish + ", author=" + author + "]";
	}
	
	
	
}