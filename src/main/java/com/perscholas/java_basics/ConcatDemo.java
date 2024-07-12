package com.perscholas.java_basics;

public class ConcatDemo {
    public static void main(String[] args) {
        //use concat to combine the two strings
        String str1 = "Learn ";
        String str2 = "Java";
        //System.out.println(str1 + str2); //test
        System.out.println(str1.concat(str2));

        String s3 =  "hello";
        String s4 = "Learners";
        System.out.println(s3.concat(s4));

        String s5 = s3 + s4;
        System.out.println(s5);

        String message = "Welcome " + "to " + "Java";
        System.out.println(message);

        String s = "Chapter" + 2;
        System.out.println(s);

        String s1 = "Supplement" + 'B';
        System.out.println(s1);
    }
}
