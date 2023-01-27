package com.edu.core;

public class FindMinMaxArray {

    public static void main(String[] args) {
        int a[]={10,15,17,19,25,30,85,91,75,2,37,0};
        int max=a[0];
        int min=a[0];

        for (int i=1;i<a.length;i++){
            if(a[i]>max)
                max=a[i];
            if (a[i]<min)
                min=a[i];

        }
        System.out.println("min :" +min + " max " +max);
    }
}
