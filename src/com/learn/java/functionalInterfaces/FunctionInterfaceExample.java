package com.learn.java.functionalInterfaces;

import java.util.Optional;
import java.util.function.Function;

public class FunctionInterfaceExample {
    static Function<String,String> function= (name)->name.toUpperCase();
    static Function<String,String> addBlessing= (name)->" God Bless You !"+ name;
    public static void main(String[] args) {

        System.out.println(function.andThen(addBlessing).apply("Chandhu"));
        //God Bless You !CHANDHU
        //COmpose executes the parameter function first then the function()
        System.out.println(function.compose(addBlessing).apply("Chandhu"));
        //GOD BLESS YOU !CHANDHU

    }
}
