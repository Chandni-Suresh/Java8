package com.learn.java.imperativeVSdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVersusDeclarativeEx1 {
    public static void main(String[] args) {

        //Use case summation of first 100 elements
        /*
         ** Imperative Code of Programming -- How style of Programming
         * Not thread safe as sum is mutable. Cant run in multithreaded environment
         */
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("Imperative Sum is " + sum);


        /*
        Declarative approach-- what style of programming
       Java has a built in method to get all the sum
       Thread safe and runs as expected in the multi threaded environment.
         */

        int sum2 = IntStream.rangeClosed(0, 100)
                .parallel() //splits the input and creates parallel
                .sum();
        System.out.println("Declarative approach sum is " + sum2);
    //Use case eliminate duplicates from the list
    /*
    Imperative approach
     */
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 2, 3, 4, 8, 9, 11, 12);
        List<Integer> outputList = new ArrayList<>();
        for (Integer i : inputList) {
            if (!outputList.contains(i))
                outputList.add(i);
        }
        System.out.println(outputList);

        /*Declarative approach
         */
        List<Integer> outputList1 = inputList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Declarative approach "+ outputList1);
    }}
