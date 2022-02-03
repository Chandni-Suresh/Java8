package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class StreamReduceExample {

    public static int multiply(List<Integer> list)
    {
       return  list.stream()
                //1
                //3
                //5
                //7
               // 1st a=1(identity default value) b=1(stream) result=1
                //2nd a=1(prev result) b=3(stream) result=1*3=3
                //3rd a=3 (Prev result) b=5 result=15
                //4th a=15 b=7 result=105
                .reduce(1,(a,b)->a*b);
       //reduce(intial_defaultValue, BinaryOPerator(int,int))
    }
    public static Optional<Integer> multiplyWithoutIdentity(List<Integer> list)
    {
        return  list.stream()
                //1
                //3
                //5
                //7
                // 1st a=1(identity default value) b=1(stream) result=1
                //2nd a=1(prev result) b=3(stream) result=1*3=3
                //3rd a=3 (Prev result) b=5 result=15
                //4th a=15 b=7 result=105
                .reduce((a,b)->a*b);
        //reduce(intial_defaultValue, BinaryOPerator(int,int))
    }

    //Reduce() to get the student with hightest GPA
    public static Optional<Student> getHighestGpa()
    {
        return StudentDataBase.getAllStudents().stream()
                .reduce(
                        (s1,s2)-> (s1.getGpa()>s2.getGpa())?s1:s2

                        );
    }

    public static void main(String[] args) {
        List<Integer> input= Arrays.asList(1,3,5,7);
        System.out.println("The multiplication of the stream is "+ multiply(input));
        //Output is 105
        Optional<Student> studentWithHighestGpa=getHighestGpa();
        if(studentWithHighestGpa.isPresent()) {
            System.out.println("Student with highest GPA is "+
            studentWithHighestGpa.get());
        }
    }
}
