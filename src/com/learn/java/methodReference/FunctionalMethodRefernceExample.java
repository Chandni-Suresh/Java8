package com.learn.java.methodReference;

import java.util.function.Function;

public class FunctionalMethodRefernceExample{

    public static void main(String[] args) {

    Function<String,String> toUpperCase= String::toUpperCase;

        System.out.println(toUpperCase.apply("abcdefg"));
    }

}
