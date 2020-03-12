package com.myApp.MyDemo.Controller;

import com.myApp.MyDemo.Models.Student;
import com.myApp.MyDemo.Repository.StudentRepository;
import com.myApp.MyDemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;
@RestController
public class StudentController {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public Iterable<Student> getStudents(){ return studentService.getAllStudent();}
    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student){
            return studentService.saveStudent(student);
    }
    @GetMapping("/student/{id}")
    public Optional<Student> getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }
    @GetMapping("/student/template/{id}")
    public Student getByIdByTemplate(@PathVariable int id) throws URISyntaxException {
        final String baseUrl = "http://localhost:8080/student/"+id;
        URI uri = new URI(baseUrl);
        return restTemplate.getForObject(uri,Student.class);
    }
    @PostMapping(path="/student/template")
    public ResponseEntity<Student> saveByTemplate(@RequestBody Student student) throws URISyntaxException {
        final String baseUrl = "http://localhost:8080/student";
        URI uri = new URI(baseUrl);
        return restTemplate.postForEntity(uri,student,Student.class);
    }

}
