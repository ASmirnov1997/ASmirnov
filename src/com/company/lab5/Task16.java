package com.company.lab5;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();

        if(y < x && z < x) {
            System.out.println(x);
        }

        if(x < y && z < y) {
            System.out.println(y);
        }

        if(x < z && y < z) {
            System.out.println(z);

        }
    }
}
