package com.example.Book.Repository;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Book.pojo.Userinfo;

@Repository
public interface UserRepository extends JpaRepository<Userinfo,Id>{

	Userinfo findById(Integer id);
	
	List<Userinfo> findByUsername(String name);
}