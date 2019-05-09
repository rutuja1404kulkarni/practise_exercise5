//Write a program to implement set interface which sorts the given randomly ordered names in
//
//        ascending order. Convert the sorted set in to an array list
//        Input : Harry Olive Alice Bluto Eugene
//        Output :
//        Sorted Set : Alice Bluto Eugene Harry Olive
//        Array list from Set : Alice Bluto Eugene Harry Olive

package com.stackroute;

import java.util.*;

public class SortList
{
    public void listSorting()
    {
       SortedSet<String> sortedSet=new TreeSet<>();
       sortedSet.add("Rutuja");
       sortedSet.add("Adi");
       sortedSet.add("Kshitija");
       sortedSet.add("Rakhi");
       sortedSet.add("Umesh");

       ArrayList<String> strings=new ArrayList<>(sortedSet);
       System.out.println(strings);

    }

    public static void main(String[] args) {
        SortList sortList=new SortList();
        sortList.listSorting();
    }
}
