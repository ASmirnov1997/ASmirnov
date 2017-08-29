package com.company.lab6;

public class Task10 {
    public static void main(String[] args) {
        int a = 100;
        int b = 500;
        int sum = 0;

        System.out.print("Ход решения: ");

        while(a <= b) {
            sum = sum + a;
            System.out.print(sum + " ");
            a++;
        }

        System.out.println();
        System.out.println("Ответ: " + sum);
    }
}
