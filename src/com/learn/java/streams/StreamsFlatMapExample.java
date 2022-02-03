package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {
    public static List<String> printStudentActivities(){
        List<String> activities =StudentDataBase.getAllStudents().stream()  //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .distinct() //displays only hte distinct stream
                .sorted()//arranges in alphabetical order
                .collect(Collectors.toList());
             return activities;
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivities());

    }
}
