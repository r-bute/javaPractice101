package com.perscholas.java_basics;

public class ReplaceDemoMain {
    public static void main(String[] args) {
        String str1 = "abc cba";

        //'a' is replaced with 'z'
        System.out.println(str1.replace('a', 'z'));
        // 'L' is replaced with 'J'
        System.out.println("Lava".replace('L', 'J'));
        // character not in the string
        System.out.println("Hello".replace('4', 'J'));
        // "C++" is replaced with "Java"
        System.out.println(str1.replace("C++", "Java"));
        // "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz"));

        // substring not in the string
        System.out.println("Java".replace("C++", "C"));

    }
}
