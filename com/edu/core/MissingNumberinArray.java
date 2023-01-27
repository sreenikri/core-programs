package com.edu.core;

import java.util.Arrays;

public class MissingNumberinArray {

    public static void main(String[] args) {
        int arr[]={1,2 ,3,5,6,7,8,9};

        Arrays.sort(arr);
        int sum=0;
        for(int i=1;i<=arr.length+1;i++){

            sum=sum+i;
        }

        System.out.println(" natural array sum :"+ sum);
        System.out.println(sum-getSum(arr));

    }

    private static int getSum(int arr[]){
        int sum=0;

        for (int i: arr){
            sum=sum+i;

        }
        System.out.println(" array sum :"+ sum);
        return sum;
    }
}
