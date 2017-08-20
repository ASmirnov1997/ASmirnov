package com.company.lab2;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x1 = s.nextInt();
        int x2 = s.nextInt();
        int x3 = s.nextInt();

        int r = (x1 * x2) + (x1 * x3) + (x2 * x3);

        System.out.println(r);
    }
}
