package com.company.lab2;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();

        if(y < 0) {
            System.out.println("Значение y должно быть неотрицательным");
        } else {
            if(x + Math.sqrt(y) < 0) {
                System.out.println("Подкоренное выражение должно быть неотрицательным"); //NaN
            } else {
                double r = -5 * Math.sqrt(x + Math.sqrt(y));
                System.out.format("%.4f", r);
            }
        }
    }
}
//