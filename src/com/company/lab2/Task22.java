package com.company.lab2;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int mass = s.nextInt();
        int alInGrad = s.nextInt();

        if(mass <= 0) {
            System.out.println("Масса должна быть положительной");
        } else {
            final double g = 9.8067;
            double alInRad = alInGrad * Math.PI / 180;
            double force = mass * g * Math.cos(alInRad);
            System.out.format("%.6f", force);
        }
    }
}
//