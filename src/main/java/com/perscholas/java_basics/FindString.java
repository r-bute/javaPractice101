package com.perscholas.java_basics;

public class FindString {
    public static void main(String[] args) {
        String str1 = "Java is fun";
        int result;

        // getting index of character 's'
        result = str1.indexOf('s');

        System.out.println(result); // 6

        // getting index of character 'J'
        result = str1.lastIndexOf('J');
        System.out.println(result); // 0

    }
}
