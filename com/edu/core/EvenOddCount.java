package com.edu.core;

public class EvenOddCount {
    public static void main(String[] args) {
        int number=120343;
        int evenCount=0;
        int oddCount=0;

        while (number!=0){
            int digit=number%10;
            if(digit%2==0)
                evenCount++;
            else
                oddCount++;
            number=number/10;
        }

        System.out.println(" Total even digits :" +evenCount +" and Odd digits :"+oddCount );
    }
}
