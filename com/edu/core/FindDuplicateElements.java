package com.edu.core;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateElements {

    public static void main(String[] args) {


        //String names= String.valueOf(new String[]{"String", "Sreeni", " hello", " vasu", "Sreeni"});
        String name[]= {"String", "Sreeni", "hello", "vasu", "Sreeni","Sreeni","vasu"};
        Map<String, Integer> map = new HashMap<String, Integer>();
        int count=1;
        for (String element:name) {
            if(map.containsKey(element))
                map.put(element,count+1);
            else
                map.put(element,count);
        }
        for(Map.Entry<String, Integer> entry: map.entrySet()){

            if(entry.getValue()>1)
                System.out.println(entry.getKey()+" is a duplicate element : " +entry.getValue());
       else
                System.out.println(entry.getKey()+" is not a duplicate element : " +entry.getValue());
        }
        
    }
}
