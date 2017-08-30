package com.company.lab6;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int sum = 0;

        if(a < b) {
            while(a <= b) {
                sum = sum + a;
                a++;
            }
            System.out.println(sum);

        } else {
            while(b <= a) {
                sum = sum + b;
                b++;
            }
            System.out.println(sum);
        }
    }
}
