package com.learn.java.methodReference;

import com.learn.java.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorrefernceExample {

    //This creates an Student Object with no-args constructor
    public static Supplier<Student> s1= Student::new;

    //This function takes a String name and returns a Student Object
    public static Function<String,Student> f1= Student::new;

    public static void main(String[] args) {
        System.out.println(s1.get());
        System.out.println(f1.apply("Chandni"));

        /*

        Output is :
        Student{name='null', gradeLevel=0, gpa=0.0, gender='null', activities=[]}
         Student{name='Chandni', gradeLevel=0, gpa=0.0, gender='null', activities=[]}
         */
    }

}
