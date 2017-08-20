package com.company.lab2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        double radius;
        Scanner s = new Scanner(System.in);
        radius = s.nextDouble();
        if(radius <= 0) {
            System.out.println("Значение radius должно быть положительным");
        } else {
            double volume = 4 * Math.PI * Math.pow(radius, 3) / 3;
            System.out.format("%.4f", volume);
        }
    }
}
