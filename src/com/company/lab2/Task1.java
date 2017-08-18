package com.company.lab2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double x;
        Scanner s = new Scanner(System.in);
        x = s.nextDouble();
        double result = x + 7;
        System.out.format("%.4f", result);
    }
}
