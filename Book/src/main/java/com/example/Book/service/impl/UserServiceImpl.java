package com.example.Book.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Book.Repository.UserRepository;
import com.example.Book.pojo.Userinfo;

@Service
public class UserServiceImpl implements UserService{
	
	Logger log = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserRepository userRepository;
	
	public Boolean saveUser(Userinfo user)
	{
		Boolean insertionStatus = false;
		List<Userinfo> userdata = findByUsername(user.getUsername());
		log.info("Userdata{}",userdata);
		if(userdata.isEmpty())
		{
		 userRepository.save(user);
		 insertionStatus=true;
		 return insertionStatus;
		}
		log.info("Value of insertion status{}",insertionStatus);
		return insertionStatus;

	}
	
	@Override
	public Userinfo findById(Integer id)
	{
		return userRepository.findById(id);
	}

	@Override
	public List<Userinfo> findByUsername(String name) {
	List<Userinfo> userdata = userRepository.findByUsername(name);
	log.info("Find By Username{}",userdata);
	return userdata;
	}
	
	public List<Userinfo> findAll()
	{
		return userRepository.findAll();
	}

}