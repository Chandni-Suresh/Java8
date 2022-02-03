package com.learn.java.student_examples;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p= (s)->s.getGradeLevel()>=3;
    //Biupredicate takes 2 parameters
    static BiPredicate<Integer,Double> biPredicate=(gradeLeval,gpa)-> gradeLeval>=3 && gpa>=3.9;

    public static void filterStudentByGradeLevel()
    {
        Consumer<Student> consumer= (s)->{
            if (biPredicate.test(s.getGradeLevel(),s.getGpa())) {
                System.out.println(s);
            } };
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach(consumer);
    }

    public static void main(String[] args) {
        //Student with grades greater than 3
        filterStudentByGradeLevel();

    }
}
