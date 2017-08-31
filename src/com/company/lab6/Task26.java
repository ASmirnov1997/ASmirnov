package com.company.lab6;

public class Task26 {
    public static void main(String[] args) {
        int a = 100;
        int count = 0;

        System.out.print("Ход решения: ");

        while(a <= 1000) {
            if(a % 13 == 0) {
                System.out.print(a + "+ ");
                count++;
            } else {
                System.out.print(a + " ");
            }
            a++;
        }

        System.out.println("Ответ " + count);
    }
}
