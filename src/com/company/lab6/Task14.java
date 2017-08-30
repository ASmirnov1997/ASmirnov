package com.company.lab6;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int pr = 1;

        if(a <= b) {
            while(a <= b) {
                pr = pr * a;
                a++;
            }

            System.out.println(pr);
        } else {
            while(b <= a) {
                pr = pr * b;
                b++;
            }

            System.out.println(pr); // тест 5 - отрицательное значение. То есть если b < a, то непонятно как считается.
        }
    }
}
