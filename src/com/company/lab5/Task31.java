package com.company.lab5;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a1 = s.nextInt();
        int b1 = s.nextInt();
        int a2 = s.nextInt();
        int b2 = s.nextInt();

        if(a1 > b1 || a2 > b2) {
            System.out.println("Значение A должно быть меньше значения B");
            return;
        }

        if(b1 < a2) {
            System.out.println("Не пересекаются");
            return;
        }

        if(b2 < a1) {
            System.out.println("Не пересекаются");
            return;
        }

        if(a1 < a2 && a2 < b1 && b1 < b2) {
            System.out.println("Пересекаются(" + a2 + ";" + b1 + ")");
            return;
        }

        if(a2 < a1 && a1 < b2 && b2 < b1) {
            System.out.println("Пересекаются(" + a1+ ";" + b2 + ")");
            return;
        }


        if(a1 < a2 && b2 < b1) {
            System.out.println("Пересекаются(" + a2 + ";" + b2 + ")");
            return;
        }

        if(a2 < a1 && b1 < b2) {
            System.out.println("Пересекаются(" + a1 + ";" + b1 + ")");
        }
    }


}
