package com.company.lab2;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();

        double result = Math.sqrt(Math.cos(x) * Math.cos(x)); // Почему-то вычисления другие, не пойму... Формула та же.

        System.out.format("%.4f", result);

    }
}
