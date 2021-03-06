package com.company.lab5;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        double discriminant = (Math.pow(b, 2) - 4 * a * c);

        if(a == 0) {
            System.out.println("Данное уравнение не является квадратным");
            return;
        }


        if(discriminant < 0) {
            System.out.println("Вещественных корней уравнения " + a
                    + "x^2+" + b + "x+" + c + "=0 нет");
        }

        if(discriminant == 0) {
            System.out.println("Уравнение " + a
                    + "x^2+" + b + "x+" + c + "=0 имеет один корень");
        }

        if(discriminant > 0) {
            System.out.println("У уравнения " + a
                    + "x^2+" + b + "x+" + c + "=0 два вещественных корня");
        }


    }
}
