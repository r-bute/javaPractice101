package com.perscholas.java_basics;

public class AssignmentOperatorsDemo {
    public static void main(String[] args) {
        // you can assign two or mor primitive values as follows given they're of the same type.
        int j, k;
        j = 9;
        j = 5;// at this stage J gets value 5 and overwrites the 10
        k = j;
        System.out.println("j is : " + j + " \nk is : " + k);

        //multiple assignments
        k = j = 10 ;
        System.out.println("j is : " + j + " \nk is : " + k);
    }

}
