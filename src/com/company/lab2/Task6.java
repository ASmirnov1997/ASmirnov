package com.company.lab2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        double base;
        double height;
        Scanner s = new Scanner(System.in);
        base = s.nextDouble();
        height = s.nextDouble();

        if(base <= 0) {
            System.out.println("Значение base должно быть положительным");
        } else {
            if(height <= 0) {
                System.out.println("Значение height должно быть положительным");
            } else {
                double area = base * height / 2;
                System.out.format("%.2f", area);

            }
        }


    }
}
//