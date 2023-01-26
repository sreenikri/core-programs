package com.edu.core;

public class PrimeNumber {
    public static void main(String[] args) {
    int number=17;
    int count=0;

    if(number>1){
        for (int i=2;i<=number;i++) {
            if (number % i == 0) {
                count++;
            }
        }
        }else {
        System.out.println( number +" is not a Prime");
    }
        System.out.println(count);
    if(count==1){
        System.out.println(number +" is a prime number");
    }
    }
}
