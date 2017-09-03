package com.company.lab6;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int a = 1;

        if(x < 0) {
            System.out.println("Значение X должно быть положительным");
            return;
        }

        while(a <= x) {
            if(x % a == 0) {
                System.out.print(a + " ");
            }

            a++;
        }


    }
}
