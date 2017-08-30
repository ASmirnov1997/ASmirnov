package com.company.lab6;

public class Task15 {
    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        int sum = 0;

        System.out.print("Ход решения: ");

        while(a <= b) {
            System.out.print(sum + "+" + (int)Math.pow(a, 3) + "= ");
            sum = sum + (int)Math.pow(a, 3);
            a++;
        }
        System.out.println();
        System.out.println("Ответ: " + sum);
    }
}