package com.perscholas.java_basics;

public class TestStringComparison {
    public static void main(String[] args) {
        String s1="PerScholas";
        String s2="PerScholas";
        String s9="PerscholasX";

        String s3=new String("PerScholas");
        String s4="Teksystem";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false

        String s7=new String("Perscholas");
        System.out.println(s1==s2);//true (because both refer to same instance)
        System.out.println(s1==s7);//false(because s3 refers to instance created in nonpool)

        System.out.println(s1.compareTo(s2)); //0
        System.out.println(s1.compareTo(s3)); // 1(because s1>s3)
        System.out.println(s1.compareTo(s9)); // -1(because s1<s4 )

    }
}
