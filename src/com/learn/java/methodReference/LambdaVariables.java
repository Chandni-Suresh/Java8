package com.learn.java.methodReference;

import java.util.function.Consumer;

public class LambdaVariables {

    public static void main(String[] args) {
        int i=0;
        //Local variable
        Consumer<Integer> c1= (a)->{
            System.out.println(a+i); //Error Variable i is already defined in the scope
        };
        c1.accept(5);
    }
}
