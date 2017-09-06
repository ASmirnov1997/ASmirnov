package com.company.lab6;

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int h = sc.nextInt();
        int a;
        int i = 1;

        if(h < 0) {
            System.out.println("Значение H должно быть неотрицательно");
            return;
        }

        while(i <= h) {
            a = 0;
            while(a < i) {
                System.out.print(s);
                a++;
            }
            System.out.println();

            i++;
        }








    }
}
