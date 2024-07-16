package com.perscholas.java_basics;

import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < 13; i++) {
            System.out.println(i+"*"+n+"="+ i*n);
        }
    }
}
