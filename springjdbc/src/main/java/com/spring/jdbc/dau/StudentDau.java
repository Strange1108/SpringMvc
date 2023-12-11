package com.spring.jdbc.dau;

import java.util.List;

import com.spring.jdbc.entities.Student;

public interface StudentDau {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int studentId);
	public Student getStudent(int studentId);
	
	public List<Student> getAllStudents();
	
}
