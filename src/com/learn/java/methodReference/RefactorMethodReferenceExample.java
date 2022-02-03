package com.learn.java.methodReference;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {
    //If the student has grade>=3 then return true else return false
    static Predicate<Student> p1= RefactorMethodReferenceExample::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student s)
    {
        if(s.getGradeLevel()>=3)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
        //Output is false because Adam has grade =2


    }
}
