package com.company.lab6;

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int w = s.nextInt();

        if(w < 0) {
            System.out.println("Значение W должно быть неотрицательно");
            return;
        }

        if(w == 0) {
            return;
        }

        System.out.print("+");
        for(int a = 0; a < w - 2; a++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.print("|");
        for(int a = 0; a < w - 2; a++) {
            System.out.print(".");
        }
        System.out.println("|");
        System.out.print("+");
        for(int a = 0; a < w - 2; a++) {
            System.out.print("-");
        }
        System.out.println("+");



    }
}
