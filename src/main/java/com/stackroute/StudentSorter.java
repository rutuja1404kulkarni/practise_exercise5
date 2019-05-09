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

import java.util.Collections;
import java.util.Comparator;

public class StudentSorter implements Comparator<StudentInfo>
{

    @Override
    public int compare(StudentInfo studentInfo1, StudentInfo studentInfo2)
    {
        // for comparison
        int nameCompare = studentInfo1.getName().compareTo(studentInfo2.getName());
        int ageCompare;
        int idCompare;

        if (studentInfo1.getAge() > studentInfo2.getAge()) {
            ageCompare = -10;
        } else if (studentInfo1.getAge() < studentInfo2.getAge()) {
            ageCompare = 10;
        } else {

            if (nameCompare != 0) {
                return nameCompare;
            }

            if (studentInfo1.getID() > studentInfo2.getID()) {
                idCompare = 10;
            } else {
                idCompare = -10;
            }

            return idCompare;

        }
        return ageCompare;
    }

}