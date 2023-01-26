package com.edu.core

public class SwapNumbers {
    public static void main(String[] args) {

        int a=10; int b=30;
        System.out.println("before swap and b values are : " +a +"  " +b);
        int temp=0;

      //approach -1
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swap and b values are : " +a +"  " +b);
    // approach-2
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("before swap and b values are : " +a +"  " +b);

     //approach-3
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("before swap and b values are : " +a +"  " +b);

        //approach-4
        b=a+b-(a=b);
        System.out.println("before swap and b values are : " +a +"  " +b);

    }

}
