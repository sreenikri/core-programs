package com.edu.core;

import java.util.Scanner;

public class CountPrimes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter starting number");
        int start = scanner.nextInt();
        System.out.println("Please enter ending number");
        int end = scanner.nextInt();
        int count = 0;

        for (int i = start; i <= end; i++) {
            if(checkprime(i)) {
                count++;
                System.out.print(i);
            }
        }
        System.out.println();
        System.out.println("Total Prime Numbers : " +count);
    }
    private static boolean checkprime(int number) {
        int count = 0;
       // boolean flag = false;
        if (number > 1) {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
        }
        if (count == 1) {

            return true;
        }
     return false;
    }
}