package com.learn.java.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> p2= (i)->i%2==0;
        Predicate<Integer> p5= (i)-> i%5==0;
        System.out.println(p2.test(4));
        System.out.println(p2.test(5));
        System.out.println(p5.and(p2).test(15));
        System.out.println(p5.or(p2).test(10));
    }
}
