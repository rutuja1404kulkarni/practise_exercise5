//Write a program where an array of strings is input and output is a Map<String,boolean> where
//        each different string is a key and its value is true if that string appears 2 or more times in the array
//        Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
//        Output - {“a” : true,”b” :false ,”c” :true,”d” : false}


package com.stackroute;

import java.util.HashMap;
import java.util.Scanner;

public class MapString {
    public void mapString()
    {
        String inputString ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        inputString = scanner.nextLine().toLowerCase().trim();

        HashMap<Character,Boolean> stringCount=new HashMap<>();

        inputString.split("[\\s_]+");
        char[] strArray=inputString.toCharArray();

        for (Character s:strArray)
        {
            if(stringCount.containsKey(s))
            {
                stringCount.put(s,true);
            }
            else
            {
                stringCount.put(s,false);
            }

        }
        System.out.println(stringCount);

    }

    public static void main(String[] args) {
        MapString mapString=new MapString();
        mapString.mapString();
    }
}
