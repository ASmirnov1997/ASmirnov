package com.company.lab2;

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int aInGrad = s.nextInt();
        int bInGrad = s.nextInt();

        double aInRad = aInGrad * Math.PI / 180;
        double bInRad = bInGrad * Math.PI / 180;

        double result = 3 * Math.sin(2 * aInRad) * Math.cos(3 * bInRad);

        System.out.format("%.4f", result);


    }
}
