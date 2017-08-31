package com.company.lab6;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a;
        int numbers = 0;
        int sum = 0;

        do {
            a = s.nextInt();
            numbers++;
            sum = sum + a;
        } while(sum <= 1000);

        System.out.println(numbers);
    }
}
