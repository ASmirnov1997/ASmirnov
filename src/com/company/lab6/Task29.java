package com.company.lab6;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int y = s.nextInt();
        int a = 1;
        int k = 0;

        if(y < 0) {
            System.out.println("Значение Y должно быть положительным");
        }

        while(a < y) {
            if(y % a == 0) {
                k++;
            }

            a++;
        }

        if(k > 2) {
            System.out.println("число не простое");
        } else {
            System.out.println("число простое");
        }
    }
}
