package com.company.lab2;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = 7 * (int)Math.pow(x, 2) - 3 * x + 6;

        System.out.println(y);
    }
}
