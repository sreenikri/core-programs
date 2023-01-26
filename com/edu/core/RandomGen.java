package com.edu.core;

import java.util.Random;

public class RandomGen
{
    public static void main(String[] args) {
        Random random=new Random();// it will give 0 to 49

        System.out.println(random.nextInt());
        System.out.println(Math.random());
;    }

}
