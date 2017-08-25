package com.company.lab5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int p = s.nextInt();
        int q = s.nextInt();

        if(p < q) {
            System.out.println("Максимальное " + q + ", минимальное " + p);
        } else {
            System.out.println("Максимальное " + p + ", минимальное " + q);
        }
    }
}
