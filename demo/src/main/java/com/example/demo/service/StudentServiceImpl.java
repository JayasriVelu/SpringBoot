package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.StudentDAO;
import com.example.demo.pojo.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;

	@Transactional
	@Override
	public List<Student> fetchStudent() {
		// TODO Auto-generated method stub
		return studentDAO.fetchStudent();
	}

	@Transactional
	@Override
	public Student fetchStudentId(int id) {
		// TODO Auto-generated method stub
		return studentDAO.fetchStudentId(id);
	}

	@Transactional
	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		studentDAO.save(student);

	}

	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		studentDAO.delete(id);
	}

}