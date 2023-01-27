package com.edu.core;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayComparison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.nextInt();

        int a[]={3,5,6,7,8,10 ,15,90,17};
        int b[]={3,5,6,7,8,10 ,15,17,90};
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a,b));

    }
}

class Dataset2{

    int year;

    int number;

    public Dataset2(int year, int number) {
        this.year = year;

        this.number = number;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
