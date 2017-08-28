package com.company.lab5;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sc = s.nextInt();
        int ss = s.nextInt();

        if(sc < 0) {
            System.out.println("Площадь круга должна быть положительной");
            return;
        }

        if(ss < 0) {
            System.out.println("Площадь квадрата должна быть положительной");
            return;

        }

        if((2 * Math.sqrt(sc / Math.PI)) >= (Math.sqrt(ss))) {
            System.out.println("Круг не поместится в квадрате");
        } else {
            System.out.println("Круг уместится в квадрате");
        }
    }


}
