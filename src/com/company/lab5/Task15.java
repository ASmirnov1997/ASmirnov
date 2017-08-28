package com.company.lab5;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if(a < 0) {
            System.out.println("Значение A должно быть неотрицательным");
            return;
        }

        if(b < 0) {
            System.out.println("Значение B должно быть неотрицательным");
            return;
        }

        if(c < 0) {
            System.out.println("Значение C должно быть неотрицательным");
            return;
        }

        if(a == b || b == c || a == c) {
            System.out.println("Треугольник является равнобедренным.");
        } else {

            System.out.println("Треугольник не является равнобедренным.");
        }
    }
}
