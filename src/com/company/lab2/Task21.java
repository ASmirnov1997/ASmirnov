package com.company.lab2;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int r1 = s.nextInt();
        int r2 = s.nextInt();

        if(r1 == 0) {
            System.out.println("Значение r1 должно быть не равно нулю");
        } else {
            if(r2 == 0) {
                System.out.println("Значение r2 должно быть не равно нулю");
            } else {
                double result = Math.pow(r1, -1) + Math.pow(r2, -1);
                System.out.format("%.4f", result);
            }
        }
    }
}
//