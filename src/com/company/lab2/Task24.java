package com.company.lab2;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int mass1 = s.nextInt();
        int mass2 = s.nextInt();
        int distance = s.nextInt();
        double g = 9.8067;

        if(mass1 <= 0 || mass2 <= 0) {
            System.out.println("Масса должна быть неотрицательной");
        } else {
            if(distance <= 0) {
                System.out.println("Дистанция должна быть неотрицательной");
            } else {
                double force = g * ((mass1 * mass2) / Math.pow(distance, 2));
                System.out.format("%.4f", force);
            }
        }
    }
}
//