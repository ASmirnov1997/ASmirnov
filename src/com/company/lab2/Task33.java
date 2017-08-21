package com.company.lab2;

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double h = s.nextDouble();
        final int radius = 6350;


        if(h < 0) {
            System.out.println("Высота над уровнем Земли должна быть неотрицательна");
        } else {
            double a = Math.sqrt(Math.pow((radius + h), 2) - Math.pow(radius, 2));

            System.out.format("%.4f", a);
        }


    }
}
