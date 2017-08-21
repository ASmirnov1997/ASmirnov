package com.company.lab2;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int cInGrad = s.nextInt();

        double cInRad = cInGrad * Math.PI / 180;

        double result = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) - (2 * a * b * Math.cos(cInRad)));

        System.out.format("%.4f", result);
    }
}
//