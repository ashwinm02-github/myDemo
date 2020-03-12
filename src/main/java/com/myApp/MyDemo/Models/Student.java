package com.myApp.MyDemo.Models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @Column
    private int rollno;
    @Column
    private String name;
    @Column
    private String exam;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public Student(int rollno) {
        this.rollno = rollno;
    }

    public Student(int rollno, String name, String exam) {
        this.rollno = rollno;
        this.name = name;
        this.exam = exam;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", exam='" + exam + '\'' +
                '}';
    }
}
