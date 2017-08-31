package com.company.lab6;

import java.util.Scanner;

public class Task25_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int y = s.nextInt();
        int a = 0;

        while(a < 15) {
            if (a < y) {
                System.out.print("#");
            } else {
                System.out.print(".");
            }
            a++;
        }

    }
}
