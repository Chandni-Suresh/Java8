package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

    //Filter out only female students
    public static List<Student> getFemaleStudents(){
       return StudentDataBase.getAllStudents().stream()
                .filter(student-> student.getGender().equals("female"))
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        System.out.println("Female Students are");
        getFemaleStudents().forEach(System.out::println);
    }
}
