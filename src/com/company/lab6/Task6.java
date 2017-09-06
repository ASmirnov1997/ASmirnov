package com.company.lab6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int p;
        int q;

        if(a < b) {
            p = a;
            q = b;
        } else {
           p = b;
           q = a;
        }

        while(p <= q) {
            System.out.print(p + " ");
            p++;
        }
    }
}
