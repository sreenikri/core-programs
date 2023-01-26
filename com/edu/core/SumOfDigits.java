package com.edu.core;

public class SumOfDigits {
    public static void main(String[] args) {
        int number=545654645;
        int sum=0;
        while (number!=0){
            sum=sum+number%10;
            number=number/10;
        }
        System.out.println(" sum of digits of a "+number +" is :" +sum);
    }
}
