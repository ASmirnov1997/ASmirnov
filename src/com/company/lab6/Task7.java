package com.company.lab6;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        if(a < b) {
            while(a <= b) {
                System.out.print(a + " ");
                a++;
            }
        } else {
            while(b <= a) {
                System.out.print(a + " ");
                a--;
            }
        }

    }
}
