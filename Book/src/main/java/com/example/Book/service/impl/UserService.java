package com.example.Book.service.impl;

import java.util.List;

import com.example.Book.pojo.Userinfo;

public interface UserService {
	
	Boolean saveUser(Userinfo user);
	
	Userinfo findById(Integer id);

	List<Userinfo> findByUsername(String name);
	
	List<Userinfo> findAll();

}