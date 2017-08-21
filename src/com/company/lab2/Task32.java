package com.company.lab2;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double a = s.nextDouble();
        double b = 12 * Math.pow(a, 2) + 7 * a - 16;

        System.out.format("%.4f", b);

    }
}
