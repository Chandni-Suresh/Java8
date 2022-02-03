package com.learn.java.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    //Both input is String and outputs a String
    static UnaryOperator<String> unary= (name)->"Hello "+ name;
    public static void main(String[] args) {
        System.out.println(unary.apply("Joel"));
    }
}
