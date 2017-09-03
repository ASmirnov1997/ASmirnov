package com.company.lab6;

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int w = s.nextInt();
        int h = s.nextInt();

        if(w < 0) {
            System.out.println("Значение W должно быть неотрицательно");
            return;
        }

        if(h < 0) {
            System.out.println("Значение H должно быть неотрицательно");
            return;
        }

        if(w == 0 || h == 0) {
            return;
        }

        System.out.print(" ");
        for(int a = 0; a < w; a++) {
            System.out.print(a);
        }
        System.out.println(" ");
        for(int b = 0; b < h; b++) {
            System.out.print(b);
            for(int a = 0; a < w; a++) {
                System.out.print(".");
            }
            System.out.println("|");
        }
        System.out.print(" ");
        for(int a = 0; a < w; a++) {
            System.out.print("-");
        }
        System.out.println(" ");

    }
}
