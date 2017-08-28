package com.company.lab5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        if(a < 0) {
            System.out.println(a * (-1));
        } else {
            System.out.println(a);

        }
    }
}
