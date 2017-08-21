package com.company.lab2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        double yInGrad;
        Scanner s = new Scanner(System.in);
        yInGrad = s.nextDouble();
        double yInRad = yInGrad * Math.PI / 180;
        double result = 5 * Math.cos(yInRad);
        System.out.printf("%.4f", result);
    }
}
//