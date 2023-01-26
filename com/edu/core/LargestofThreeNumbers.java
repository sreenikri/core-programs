package com.edu.core;

public class LargestofThreeNumbers {
    public static void main(String[] args) {
        int a=60;int b=-35;int c=87;

        if(a>b&&a>c)
            System.out.println(" biggest number is :"+a);
        if(b>a&&b>c)
            System.out.println(" biggest number is :"+b);

        if(c>a&&c>b)
            System.out.println(" biggest number is :"+c);

        int largest=a>(b>c?b:c)?a:(b>c?b:c);
        System.out.println(" the largest :" +largest);


    }
}
