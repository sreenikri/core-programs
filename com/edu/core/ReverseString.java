package com.edu.core;

public class ReverseString {
    public static void main(String[] args) {

        String string="Hello";
        String rev="";
        for(int i=0; i<string.length();i++){
        rev= string.charAt(i)+rev.trim();
        }
        System.out.println("Origional String " +string);
        System.out.println("Reverse of String :"+rev);
        System.out.println("Reverse String : " +new StringBuffer(string).reverse());
        System.out.println("Reverse String : " +new StringBuilder(string).reverse());
            rev="";
        for(char ch: string.toCharArray()){
            rev= ch+rev;
        }
        System.out.println("Reverse of String :"+rev);


    }

}
