package com.edu.core;

import java.util.Arrays;

public class ArrayComparison {
    public static void main(String[] args) {

        int a[]={3,5,6,7,8,10 ,15,90,17};
        int b[]={3,5,6,7,8,10 ,15,17,90};
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a,b));

    }
}
