package com.learn.java.student_examples;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;
import com.learn.java.functionalInterfaces.PredicateExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionStudentExample {
    static Function<List<Student>, Map<String,Double>> function=(students)->{
        Map<String, Double> map= new HashMap<>();
        students.forEach((student)->{
            if(PredicateStudentExample.p.test(student))
            map.put(student.getName(),student.getGpa());
        });
        return map;
        };

    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction=(students,p1)->{
        Map<String, Double> map= new HashMap<>();
        students.forEach(student->{
            if(p1.test(student))
                map.put(student.getName(), student.getGpa());
        });
      return map;
    };

    public static void main(String[] args) {
        System.out.println("Printing the map ");
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),PredicateStudentExample.p));
    }
    }

