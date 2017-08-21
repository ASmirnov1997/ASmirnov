package com.company.lab2;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();

        if((-7 * b) < 0) {
            System.out.println("Значение b должно быть не положительным");
        } else {
            double result = a * Math.sqrt(-7 * b);
            System.out.format("%.4f",result);
        }

    }
}
//