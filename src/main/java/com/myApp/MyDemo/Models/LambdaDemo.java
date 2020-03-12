package com.myApp.MyDemo.Models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        Stream<String> stream = list.stream();
        //Stream to perform Filteration on Collecion Object which return Optional type of result.

        Stream<String> st = stream.filter(item->item.startsWith("o"));
        System.out.println(st.collect(Collectors.toList()));

        //Find shortest using stream-------------------------

        Stream<String> stream1 = list.stream();
        String s = "one";
        boolean shortest = stream1.min(Comparator.comparing(item->s).thenComparing(item->"ONE")).isPresent();
        System.out.println(shortest);

        //Concat list of item to string.--------------------

        Stream<String> stream2 = list.stream();
        String concat = stream2.reduce((acc,item)->acc+" "+item).get();
        System.out.println(concat);

        //Concat  list of item with filteration

        Stream<String> stream3 = list.stream();
        String concating = stream3.filter(item->item.startsWith("o")).
                filter(it->it.startsWith("t")).reduce("",(acc,itm)->itm + " "+ acc);
        System.out.println(concating);

        Student s1 = new Student(1,"a1","one");
        Student s2 = new Student(1,"a2","one");
        Student s3 = new Student(2,"b1","one");
        Student s4 = new Student(2,"b2","one");
        Student s5 = new Student(3,"c1","one");
        Student s6 = new Student(3,"c2","one");
        Student s7 = new Student(4,"d","one");
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);
        studentList.add(s7);

        studentList.stream()
                .collect(Collectors.groupingBy(Student::getRollno)).values().stream()
                .filter(peopleWithSameId -> peopleWithSameId.size() == 1)
                .forEach(peopleWithSameId -> System.out.println("People with identical IDs: " + peopleWithSameId));
    }
}
