package com.learn.java.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        //Annonymous Class
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable\n");
            }
        };
        new Thread(runnable).start();
        //Lambda Expression
        Runnable runnableLambda= ()->{
            System.out.println("Inside Lambda Runnable");
        };
        new Thread(runnableLambda).start();
        //Lambda without assigning to a variable
         new Thread(()-> System.out.println("Inside Lambda without assignmment")).start();

    }
}
