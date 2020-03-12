package com.myApp.MyDemo;

import com.myApp.MyDemo.Models.Student;
import com.myApp.MyDemo.Repository.StudentRepository;
import com.myApp.MyDemo.Service.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest
class MyDemoApplicationTests {

	@Autowired
	private StudentService studentService;

	@MockBean
	private StudentRepository studentRepository;
	@Test
	public void getStudentTest(){
		when(studentRepository.findAll()).thenReturn(Stream.of(new Student(1,"abc","prac"),new Student(2,"bcd","theory")).collect(Collectors.toList()));
		assertEquals(2,studentService.getAllStudent().size()) ;
	}
	@Test
	public void getStuentByIdTest(){
		Student student=new Student(1, "rty", "pract");
		when(studentRepository.findById(1)).thenReturn(java.util.Optional.of(student));
		assertEquals(java.util.Optional.of(student),studentService.getStudentById(1));
	}
	@Test
	public void saveStudentTest(){
		Student student=new Student(1, "rty", "pract");
		when(studentRepository.save(student)).thenReturn(student);
		assertEquals(student,studentService.saveStudent(student));
	}
}
