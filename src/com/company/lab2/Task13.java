package com.company.lab2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int x;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();

        if((61 - x) < 0) {
            System.out.println("Подкоренное выражение должно быть неотрицательным");
        } else {
            double result = 3 * Math.sqrt(61 - x);
            System.out.format("%.4f", result);
        }
    }
}
//

