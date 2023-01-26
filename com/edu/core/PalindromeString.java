package com.edu.core;

public class PalindromeString {
    public static void main(String[] args) {
        String name="Sreenivas";

        System.out.println (name+" is a palindrom :" + (getRevesre(name).equals(name)));
        System.out.println ("SRS" +" is a palindrom :" + (getRevesre("SRS").equals("SRS")));
    }

     static String getRevesre(String name){
        String rev="";
        if(null!=name&& name!=""){
            for(char ch:name.toCharArray()){
                rev=ch+rev;
            }
        }
            return rev;
    }
}
