package com.company.lab6;

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c;
        int i = 1;
        int p;
        int q;


       if(a <= b) {
           p = a;
           q = b;
       } else {
          p = b;
          q = a;
       }

        while(p <= q) {
            if(p % 2 == 1) {
                c = 1;
                while(c < i) {
                    System.out.print(".");
                    c++;
                }

                System.out.println(p);

                i++;

            }

            p++;
        }





    }
}
