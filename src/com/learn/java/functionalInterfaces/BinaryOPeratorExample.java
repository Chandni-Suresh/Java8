package com.learn.java.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOPeratorExample {
    static BinaryOperator<Integer> binary= (i,j)-> i*j;
    static Comparator<Integer> comparator= (a,b)->a.compareTo(b);
   static BinaryOperator<Integer> max= BinaryOperator.maxBy(comparator);
    static BinaryOperator<Integer> min= BinaryOperator.minBy(comparator);
    public static void main(String[] args) {
        System.out.println(binary.apply(10,20));
        System.out.println("Max is "+max.apply(23,87));
    }
}
