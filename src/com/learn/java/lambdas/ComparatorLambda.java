package com.learn.java.lambdas;

import java.util.Comparator;
import java.util.concurrent.ConcurrentMap;

public class ComparatorLambda {
    public static void main(String[] args) {
        /**
         * Conventional way
         */
        Comparator<Integer> comparator= new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); //0 if equal, 1 if greater, -1 if lesser
            }
        };
        System.out.println(comparator.compare(3, 2));

        /**
         * Lambda 8
         */
        Comparator<Integer> comparatotLambda= (Integer a, Integer b)-> a.compareTo(b);
        System.out.println(comparatotLambda.compare(3,2));

        /**
         * Lambda without even specifying the type Integer
         * Because Comparator<Integer> we are specifying that its Integer
         */
        Comparator<Integer> comparatorLambda1= (a,b)->a.compareTo(b);
        System.out.println(comparatotLambda.compare(3,2));


    }
}
