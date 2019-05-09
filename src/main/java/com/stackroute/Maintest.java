//Create a Student class that represents the following information of a student: id, name, and age
//        all the member variables should be private .
//        a. Implement `getter and setter` .
//        b. Create a `StudentSorter` class that implements `Comparator interface` .
//        c. Write a class `Maintest` create Student class object(minimum 5)
//        d. Add these student object into a List of type Student .
//        e. Sort the list based on their age in decreasing order, for student having
//        same age, sort based on their name.
//        f. For students having same name and age, sort them according to their ID.

package com.stackroute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Maintest {
    public static void main(String[] args)
    {
        ArrayList<StudentInfo> studentList = new ArrayList<>();
        studentList.add(new StudentInfo(1,23,"Rutuja"));
        studentList.add(new StudentInfo(2,24,"kshitija"));
        studentList.add(new StudentInfo(3,25,"Aditya"));
        studentList.add(new StudentInfo(4,25,"Rakhi"));
        studentList.add(new StudentInfo(5,27,"Umesh"));
        System.out.println("List before Sorting Object");
        Iterator iterator=studentList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        Collections.sort(studentList,new StudentSorter());

        System.out.println("List After Sorting Objects");
        Iterator iterator1=studentList.iterator();
        while (iterator1.hasNext())
        {
            System.out.println(iterator1.next());
        }
    }

}
