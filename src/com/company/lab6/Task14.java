package com.company.lab6;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long a = s.nextInt();
        long b = s.nextInt();
        long pr = 1;

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


        }
    }
}
