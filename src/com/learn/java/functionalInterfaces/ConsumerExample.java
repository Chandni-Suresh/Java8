package com.learn.java.functionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerExample {
 static  Consumer<Student> consumer= (student)-> System.out.println(student);
    static Consumer<Student> c1= (student)-> System.out.println("Name: "+student.getName());
   static Consumer<Student> c2= (student)-> System.out.println("Activities are: "+ student.getActivities());
    public static void printAllStudents()
    {
        List<Student> studentList= StudentDataBase.getAllStudents();

        studentList.forEach(consumer);
    }

    public  static void printNameAndActivities()
    {
        List<Student> studentList= StudentDataBase.getAllStudents();
        //Consumer Chaining
        studentList.forEach(c1.andThen(c2));
    }

    public static void printNameAndActivitiesCOndition()
    {
       List<Student> studentList= StudentDataBase.getAllStudents();
       studentList.forEach((student)->{
           if(student.getGradeLevel()>=3)
           {
               c1.andThen(c2).accept(student);
           }
       });
    }


    public static void main(String[] args) {
        Consumer<String> consumer= (s)-> System.out.println(s.toLowerCase());
        consumer.accept("Hello world");
        printAllStudents();
       // printNameAndActivities();
        printNameAndActivitiesCOndition();
    }
}
