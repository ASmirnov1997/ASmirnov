package com.company.lab6;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a;
        int numbers = 0;
        int sum = 0;

        do {
            a = s.nextInt();
            numbers++;
            sum = sum + a;
        } while(a != 0);

        System.out.print("Сумма чисел: " + sum);
        System.out.println(", Количество чисел: " + numbers);
    }

}
