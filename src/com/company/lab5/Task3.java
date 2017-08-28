package com.company.lab5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int k = s.nextInt();

        if(k > 0) {
            System.out.println((int)Math.sqrt(k));
        } else {
            System.out.println((int)Math.pow(k, 2));

        }
    }
}
