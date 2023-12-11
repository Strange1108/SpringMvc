package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dau.StudentDau;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program Started....." );
//        ApplicationContext context = new AnnotationConfigApplicationContext("jdbcConfig.java");
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        StudentDau studentDau = context.getBean("studentDau", StudentDau.class);
        
//        INSERT DATA
//        Student student = new Student();
//        student.setId(666);
//        student.setName("John");
//        student.setCity("Lucknow");
//        
//        int result = studentDau.insert(student);
//        System.out.println("student added" + result);
        
//        UPDATE DATA
//        Student student = new Student();
//        student.setId(666);
//        student.setName("Raj");
//        student.setCity("Gurgaon");
//        
//        int result = studentDau.change(student);
//        System.out.println("student updated" + result);
        
        //DELETE DATA
//        int result = studentDau.delete(666);
//        System.out.println("delete" + result);
        
        //select single field from databases
//        Student student = studentDau.getStudent(222);
//        System.out.println(student);
        
        List<Student> students = studentDau.getAllStudents();
        for(Student s:students)
        {
        	System.out.println(s);
        }
        
    }
}
