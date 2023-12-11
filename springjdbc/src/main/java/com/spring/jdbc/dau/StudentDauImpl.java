package com.spring.jdbc.dau;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("studentDau")
public class StudentDauImpl implements StudentDau{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int insert(Student student) {
		String query = "insert into student(id, name, city) values(?,?,?)";
		int r =this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}
	
	public int change(Student student) {
		//updating datda
		String query = "update student set name=?, city=? where id=? ";
		int r =this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return r;
	}
	public int delete(int studentId) {
		//delete data
		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query, studentId);
		return r;
	}
	public Student getStudent(int studentId) {
		//select single student data
		String query = "select * from student where id=?";
		RowMapper<Student> rwoMapper =  new rowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rwoMapper, studentId);
		return student;
	}
	public List<Student> getAllStudents() {
		//Select Multiple field from databases
		String query = "select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new rowMapperImpl());
		return students;
	}

	

}
