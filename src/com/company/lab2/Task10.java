package com.company.lab2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        double xInGrad;
        Scanner s = new Scanner(System.in);
        xInGrad = s.nextDouble();
        double xInRad = xInGrad*Math.PI/180;
        double result = Math.sin(xInRad);
        System.out.format("%.4f", result);
    }
}
