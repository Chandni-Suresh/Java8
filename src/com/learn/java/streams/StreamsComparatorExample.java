package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {
        //Sort by Name
    public static List<Student> sortByName()
    {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    //Sort students by GPA in descending order
    public static List<Student> sortByGpaDesc()
    {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
         sortByName().forEach(System.out::println);
        System.out.println("Sorted by GPA"+sortByGpaDesc());
    }
}
