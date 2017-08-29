package com.company.lab2;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int x = s.nextInt();
        double root = a * Math.pow(x, 2) + b * x + c;

        if(root < 0) {
            System.out.println("Подкоренное выражение должно быть неотрицательным");
        } else {
            if(root == 0) {
                System.out.println("Знаменатель не может быть равен нулю");
            } else {
                double r = 1 / Math.sqrt(root);
                System.out.format("%.4f", r);
            }
        }
    }
}

