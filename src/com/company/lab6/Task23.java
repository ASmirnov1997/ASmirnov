package com.company.lab6;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int a = 1;

        if(n < 0) {
            System.out.println("Значение N должно быть неотрицательным");
            return;
        }

        while(a <= n) {
            if(a % 20 == 0) {
                System.out.println("#");
            } else {
                System.out.print("#");
            }

            a++;

        }
    }
}
