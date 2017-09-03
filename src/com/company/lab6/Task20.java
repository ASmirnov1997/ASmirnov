package com.company.lab6;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long a = s.nextLong();
        long b = s.nextLong();
        long sum = 0;

        if(a < b) {
            while(a <= b) {
                sum = sum + (long)Math.pow(a , 2);
                a++;
            }

            System.out.println(sum);
        } else {
            while(b <= a) {
                sum = sum + (long)Math.pow(b, 2);
                b++;
            }

            System.out.println(sum);
        }
    }
}
