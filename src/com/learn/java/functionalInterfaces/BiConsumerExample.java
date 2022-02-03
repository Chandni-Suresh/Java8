package com.learn.java.functionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer=(a, b)-> System.out.println("a:"+a+"B:"+b);
        biConsumer.accept("hello","world");

        BiConsumer<Integer,Integer> add=(i,j)->{
            System.out.println("Addition is :"+ i+j);
               };
        BiConsumer<Integer,Integer>multiply=(i,j)->{
            System.out.println("Multiplication is :"+ i*j);
        };
        add.andThen(multiply).accept(10,20);
    }
}
