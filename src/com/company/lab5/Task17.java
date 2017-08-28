package com.company.lab5;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int m = s.nextInt();
        int p = s.nextInt();


        if(p == 0) {
            System.out.println("Значение P должно быть не равно нулю");
            return;
        }

        if(m % p != 0) {
            System.out.println("M не делится нацело на P");
        } else {
            System.out.println(m / p);

        }
    }
}
