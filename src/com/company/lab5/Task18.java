package com.company.lab5;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        if(a > 9999) {
            System.out.println("Значение A должно быть в интервале [1000, 9999]");
            return;
        }

        if(a < 1000) {
            System.out.println("Значение A должно быть в интервале [1000, 9999]");
            return;
        }

        if(a % 10 == ((a / 100) % 10)) {
            System.out.println("Равно");

        } else {
            System.out.println("Не равно");

        }
    }
}
