package com.perscholas.java_basics;

public class ExplicitTest {
    public static void main(String[] args) {
        double  d = 100.04;
        //explicit type casting
        long I = (long) d;
        int i = (int) I;
        System.out.println("Double value "+d);
        System.out.println("Long value "+I);
        System.out.println("Integer value "+i);

        byte b;
        int z = 257;
        double dou = 323.142;
        System.out.println("\nConversion of int to byte.");
        b = (byte) z;
        System.out.println("z = "+ z + " b = "+b);
        System.out.println("\nConversion of double to int.");
        z = (int)dou;
        System.out.println("dou = "+ dou + " b = "+z);
        System.out.println("\nConversion of double to byte.");
        b = (byte)  dou;
        System.out.println("dou = "+ dou + " b = "+b);

    }
}
