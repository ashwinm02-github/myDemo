package com.myApp.MyDemo.Service;

import com.myApp.MyDemo.Models.Student;
import com.myApp.MyDemo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
   public Student saveStudent(Student student){return studentRepository.save(student);}
   public List<Student> getAllStudent(){
       List<Student> studentList = new ArrayList<Student>();
       studentList = (List<Student>) studentRepository.findAll();
       return studentList;
   }
   public Optional<Student> getStudentById(int id){return  studentRepository.findById(id);}
}
