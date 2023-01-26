package com.edu.core;

public class ReverseNumber {

    public static void main(String[] args) {
        int origional=1024;
        System.out.println(" origional  number " +origional);
        int rev=0;
        while(origional!=0){
            rev=rev*10+origional%10;
            origional=origional/10;
        }
        System.out.println(" reverse of a number " +rev);
        // by using StringBuff
        int num=2048;
        System.out.println(" origional number "+num);
        System.out.println(" reverse of a number " +new StringBuffer(String.valueOf(num)).reverse());
        //by using stringBuilder class
        System.out.println(" reverse of a number " +new StringBuilder().append(num).reverse());

    }
}
