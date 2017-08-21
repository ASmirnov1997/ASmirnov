package com.company.lab2;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();

        if(a == 0) {
            System.out.println("Значение a должно быть не равно нулю");
        } else {
            if(d == 0) {
                System.out.println("Значение d должно быть не равно нулю");
            } else {
                double r = ((a * d) + (b * c)) / (a * d); // Почему-то не выводит нужное, если ввести первые числа
                System.out.format("%.4f", r);
            }
        }
    }
}
//