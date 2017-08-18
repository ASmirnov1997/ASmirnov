package com.company.lab2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int radius;
        Scanner s = new Scanner(System.in);
        radius = s.nextInt();
        if(radius <= 0) {
            System.out.println("Радиус должен быть положительным");
        } else {
            double circumference;
            circumference = 2 * Math.PI * radius;
            System.out.format("%.4f", circumference);
        }

    }
}
