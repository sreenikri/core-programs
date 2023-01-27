package com.edu.core;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {4, 5, 8, 90, 24, 45, 68, 54, 86, 90};
        int element=97;

        System.out.println("Element found "+findElelemnt(arr,element));
    }

    private static boolean findElelemnt(int arr[], int element){

        for(int ele: arr)
        {
            if(element==ele)
            return  true;
        }
        return false;
    }
}
