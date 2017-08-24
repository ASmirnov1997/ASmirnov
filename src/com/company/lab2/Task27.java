package com.company.lab2;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        double gr = (x * Math.PI / 180);

        double result = Math.sqrt(Math.cos(gr) * Math.cos(gr));

        System.out.format("%.4f", result);

    }
}
//