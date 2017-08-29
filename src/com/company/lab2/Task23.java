package com.company.lab2;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if(a == 0) {
            System.out.println("Данное уравнение не является квадратным");
            return;
        }

        System.out.format("%.4f", discriminant);





    }
}

