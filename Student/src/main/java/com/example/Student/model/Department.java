package com.example.Student.model;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
	private List<Student> student;

	public Department() {
		System.out.println("Eager Initialized for dept");
		System.out.println("HashCode value for dept" + hashCode());
	}

	// Getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getEmployees() {
		return student;
	}

	public void setEmployees(List<Student> student) {
		this.student = student;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, name, student);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(student, other.student);
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", student=" + student + "]";
	}
}