package com.company.lab2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        double x;
        Scanner s = new Scanner(System.in);
        x = s.nextDouble();
        if(x < 0) {
            System.out.println("Значение X должно быть неотрицательным");
        } else {
            double result;
            result = Math.pow(x, 0.5);
            System.out.format("%.4f", result);
        }
    }
}
