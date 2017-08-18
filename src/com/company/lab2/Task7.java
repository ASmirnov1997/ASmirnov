package com.company.lab2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        double aInGrad;
        Scanner s = new Scanner(System.in);
        aInGrad = s.nextInt();
        double aInRad;
        aInRad = aInGrad*Math.PI/180;
        System.out.format("%.4f", aInRad);
    }
}
