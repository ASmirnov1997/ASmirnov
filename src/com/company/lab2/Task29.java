package com.company.lab2;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();

        if(x + 5 < 0 || x - 5 < 0 || x < 0) {
            System.out.println("Подкоренное выражение должно быть неотрицательным");
        } else {
            double r = ((Math.sqrt(x + 5)) + (Math.sqrt(x - 5))) / (2 * Math.sqrt(x));

            System.out.format("%.6f", r);
        }


    }
}
