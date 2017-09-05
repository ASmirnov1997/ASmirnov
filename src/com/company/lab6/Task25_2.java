package com.company.lab6;

import java.util.Scanner;

public class Task25_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int y = s.nextInt();
        int a = 0;

        if(y < 0 || y > 15) {
            System.out.println("Значение Y должно быть в интервале [0, 15]");
            return;
        }

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
