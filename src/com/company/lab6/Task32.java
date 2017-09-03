package com.company.lab6;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int a;
        int b;

        if(w < 0) {
            System.out.println("Значение W должно быть неотрицательно");
            return;
        }

        if(h < 0) {
            System.out.println("Значение H должно быть неотрицательно");
            return;
        }

        for(b = 0; b < h; b++) {
            for(a = 1; a <= w; a++) {
                if(a == w) {
                    System.out.println(s);
                } else {
                    System.out.print(s);
                }

            }
        }





    }
}
