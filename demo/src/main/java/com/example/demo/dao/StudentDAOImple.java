package com.example.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.pojo.Student;

import jakarta.persistence.EntityManager;

@Repository
public class StudentDAOImple implements StudentDAO {
	
	@Autowired
	private EntityManager entitymanager;

	@Transactional
	@Override
	public List<Student> fetchStudent() {
		
		Session currentSession = entitymanager.unwrap(Session.class);
		Query<Student> query = currentSession.createQuery("from Student",Student.class);
		List<Student> studentList = query.getResultList();
		// TODO Auto-generated method stub
		return studentList;
	}

	@Transactional
	@Override
	public Student fetchStudentId(int id) {
		// TODO Auto-generated method stub
		Session currentSession = entitymanager.unwrap(Session.class);
		Student student = currentSession.get(Student.class, id);
		return student;
	}

	@Transactional
	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		
		Session currentSession = entitymanager.unwrap(Session.class);
		currentSession.saveOrUpdate(student);

	}

	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session currentSession = entitymanager.unwrap(Session.class);
		Student student = currentSession.get(Student.class, id);
		currentSession.delete(student);

	}

}