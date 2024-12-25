package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping(value = "/api")
public class StudentListController {
	@Autowired
	private StudentService studentService;

	@PostMapping("/student")
	public Student save (@RequestBody Student student)
	{
		studentService.save(student);
		return student;
	}
	
	@GetMapping("/student")
	public List<Student> fetchStudent()
	{
		return studentService.fetchStudent();
	}
	
	@GetMapping("/student/{id}")
	public Student get(@PathVariable int id) {
		Student student = studentService.fetchStudentId(id);
		if(student == null) {
			throw new RuntimeException("Student not found for the Id:"+id);
		}
		return student;
	}
	
	@PutMapping("/student")
	public Student update(@RequestBody Student student) {
		studentService.save(student);
		return student;
	}
	
	@DeleteMapping("/student/{id}")
	public String delete(@PathVariable int id) {
		studentService.delete(id);
		return "Student has been deleted with id:"+id;
	}
	
	@PutMapping("/update")
	public void updateStudent(@RequestBody Student student) {
		studentService.fetchStudentId(student.getId());
		
		student.setName("Sriiii");
			studentService.save(student);
		

	}
	@PatchMapping("/patch")
	public void partialupdStudent(@RequestParam int id)
	{
		Student s=studentService.fetchStudentId(id);
		
			s.setName("Mech");
			studentService.save(s);
		
	}
}