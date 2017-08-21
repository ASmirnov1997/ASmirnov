package com.company.lab2;

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x1 = s.nextInt();
        int x2 = s.nextInt();

        double result = Math.pow((Math.pow(x2, 2) + Math.pow(x1, 2)), 0.5);

        System.out.format("%.4f", result);
    }
}
