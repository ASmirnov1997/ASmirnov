package com.company.lab6;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int a = 1;
        double sum = 0;

        if(n <= 0) {
            System.out.println("Значение N должно быть положительным");
            return;
        }

        while(a <= n) {
            sum = sum + 1 / (double)a;
            a++;
        }

        System.out.format("%.4f", sum);

    }
}
