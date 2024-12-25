package com.example.Book.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Book.pojo.Book;

import jakarta.persistence.Id;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
	public Optional<Book> findById(Integer id);
}