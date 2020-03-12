package com.myApp.MyDemo.Repository;

import com.myApp.MyDemo.Models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
