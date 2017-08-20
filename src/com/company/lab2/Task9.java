package com.company.lab2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int aInitial;
        Scanner s = new Scanner(System.in);
        aInitial = s.nextInt();
        int aRemainder = aInitial % 360;
        System.out.println(aRemainder);
    }
}
