package com.company.lab6;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int w = s.nextInt();
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;
        int e = 1;
        int f = 1;
        int g = 1;
        int h = 1;
        int k = 1;
        int l = 1;

        if(w < 0 || w > 20) {
            System.out.println("Значение W должно быть в интервале [0, 20]");
            return;
        }

        while(a <= w) {
            if(a == w) {
                System.out.println(0);
            } else {
                System.out.print(0);
            }

            a++;
        }

        while(b <= w) {
            if(b == w) {
                System.out.println(1);
            } else {
                System.out.print(1);
            }

            b++;
        }

        while(c <= w) {
            if(c == w) {
                System.out.println(2);
            } else {
                System.out.print(2);
            }

            c++;
        }

        while(d <= w) {
            if(d == w) {
                System.out.println(3);
            } else {
                System.out.print(3);
            }

            d++;
        }

        while(e <= w) {
            if(e == w) {
                System.out.println(4);
            } else {
                System.out.print(4);
            }

            e++;
        }

        while(f <= w) {
            if(f == w) {
                System.out.println(5);
            } else {
                System.out.print(5);
            }

            f++;
        }

        while(g <= w) {
            if(g == w) {
                System.out.println(6);
            } else {
                System.out.print(6);
            }

            g++;
        }

        while(h <= w) {
            if(h == w) {
                System.out.println(7);
            } else {
                System.out.print(7);
            }

            h++;
        }

        while(k <= w) {
            if(k == w) {
                System.out.println(8);
            } else {
                System.out.print(8);
            }

            k++;
        }

        while(l <= w) {
            if(l == w) {
                System.out.println(9);
            } else {
                System.out.print(9);
            }

            l++;
        }
    }
}
