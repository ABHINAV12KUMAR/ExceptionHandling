package com.exceptionHandling;

public class TrowClass {
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("not vlaid");
        }
        else{
            System.out.println("welcom vote");
        }
    }
    public static void main(String[] args) {
        validate(13);
        System.out.println("rest code");
    }
}
// throw keyword is used to explicit throw an exception we can throw either checked exception or unchecked exception in java by throw keyword.