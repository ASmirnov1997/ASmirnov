package com.company.lab6;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int a = 0;

        if(n < 0) {
            System.out.println("Значение N должно быть неотрицательным");
        }

        while(a < n) {
            System.out.print("!");
            a++;
            if(a % 5 == 0) {
                System.out.print(" ");
            }
        }
    }
}
