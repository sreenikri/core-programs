package com.edu.core;

public class PalindromeNumber {

    public static void main(String[] args) {
        int num=121;
        Boolean flag= reverseInt(num) == num;
        int num1=1201;
        System.out.println (num+" is a palindrom :" + (reverseInt(num) == num));
        System.out.println (num1 +" is a palindrom :" + (reverseInt(num1) == num1));
    }
    private static int reverseInt(int num) {
        int rev=0;
        if(num!=0){
            while(num!=0){
                rev=rev*10+num%10;
                num=num/10;
            }
        }
     return rev;
    }
}


