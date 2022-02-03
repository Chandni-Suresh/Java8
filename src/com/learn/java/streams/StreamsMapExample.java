package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

public class StreamsMapExample {


    public static List<String> nameList(){
       List<String> names= StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getName)   //map accepta a function that takes Student as input and gives name string as output //Stream<String>
               .map(String::toUpperCase) //map takes input as String and gives output as String
               .collect(toList());
       return names;
    }
    public static Function<Integer,Integer>  doubleTheNumber=(i)->
    {
        int result=i*i;
        return Integer.valueOf(result);
    };

    public static Predicate<Integer> checkDivisibility= (i)->{
        return  !(i%10==5 || i%10==6);

    };
    public static List<Integer> doubleNums()
    {
        List<Integer> nums= new LinkedList<>();
        nums.add(12);
        nums.add(45);
        nums.add(78);

       return  nums.stream() //created a stream of nums
                .map(doubleTheNumber)  //Input Integer and Output Integer
               .filter(checkDivisibility)
                .collect(toList());
    }
    public static void main(String[] args) {
        System.out.println(nameList());
        System.out.println(doubleNums());

    }
}
