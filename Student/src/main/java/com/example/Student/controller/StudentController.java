package com.example.Student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.Service.DepartmentServiceImpl;
import com.example.Student.Service.StudentService;
import com.example.Student.model.Department;
import com.example.Student.model.Student;
import com.example.Student.repoistory.StudentRepoistory;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

	@Autowired
	private StudentService studentService;

	@Autowired
	private StudentRepoistory studentRepoistory;
	
	@Autowired
	private DepartmentServiceImpl departmentServiceImpl;

	@PostMapping("/add")
	public void SaveStudent(@RequestBody Student student) {
		Optional<Student> s = studentRepoistory.findById(student.getId());
		Student savedStudent;
		if(s.isEmpty())
		{
			savedStudent=studentService.SaveStudent(student);
		}
		else
		{
			student.setName("Srima");
		}
		studentService.SaveStudent(student);
	}

	@GetMapping("/get")
	public List<Student> fetchname(@RequestParam String name) {
		return studentService.findbyName(name);
	}

	@DeleteMapping("/delete")
	public void deleteStudent(@RequestParam int id) {
		studentService.deleteStudent(id);
	}

	@PutMapping("/update")
	public void updateStudent(@RequestBody Student student) {
		Optional<Student> s = studentRepoistory.findById(student.getId());
		if (s.isPresent()) {
			student.setName("Sriiii");
			studentService.SaveStudent(student);
		}

	}
	@PatchMapping("/patch")
	public void partialupdStudent(@RequestParam int id)
	{
		Optional<Student> s=studentRepoistory.findById(id);
		Student stu = s.get();
		if(s.isPresent())
		{ 
			stu.setDept("Mech");
		}
	}
	
	@GetMapping("/getAll")
	public List<Student> findAllStudent() {
		return studentService.findAllStudent();
	}
	
	@GetMapping("/getDept")
	public List<Department> findallbyDept()
	{
		return departmentServiceImpl.getAllDepartments();
	}
	
	@PostMapping("/addDept")
	public List<Department> saveDept(@RequestBody Department dept)
	{
		return departmentServiceImpl.getAllDepartments();
	}
}