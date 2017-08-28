package com.company.lab5;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double x = s.nextDouble();
        double y = s.nextDouble();
        double z = s.nextDouble();

        if(-3 < x && x < 5) {
            System.out.print(x + " ");
        }

        if(-3 < y && y < 5) {
            System.out.print(y + " ");
        }

        if(-3 < z && z < 5) {
            System.out.print(z + " ");
        }
    }
}
