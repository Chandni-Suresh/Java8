package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {

    public static void main(String[] args) {

        Predicate<Student> studentGpaPredicate= (student)->student.getGpa()>=3.9;
        Map<String, List<String>> studentMap= StudentDataBase.getAllStudents().stream()
                //Peek to check the stream at each level
                .peek(student -> System.out.println(student))
                //filter(predicate)
                .filter((student)->student.getGradeLevel()>=3)
                .peek(student -> System.out.println(student))
                .filter(studentGpaPredicate)

                .peek(student -> System.out.println(student))
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentMap);

       Stream<Student> studentStream= StudentDataBase.getAllStudents().stream();
       studentStream.forEach(System.out::println);
        studentStream.forEach(System.out::println);

    }
}
