package com.company.lab5;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if(a < b && b < c) {
            System.out.println("\"Выполняется\"");
        } else {
            System.out.println("\"Не выполняется\"");
        }
    }
}
