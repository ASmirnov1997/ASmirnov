package com.company.lab6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = 0;
        String b = s.nextLine();
        int a = s.nextInt();

        if(a < 0) {
            System.out.println("Значение A должно быть неотрицательным");
            return;
        }

        System.out.print("\"");

        while(c < a) {
            System.out.print(b);
            c++;
        }

        System.out.println("\"");
    }
}
