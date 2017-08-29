package com.company.lab5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double velocityInKmH = s.nextDouble();
        double velocityInMS = s.nextDouble();

        if(velocityInKmH < 0) {
            System.out.println("Значение velocityInKmH должно быть неотрицательным");
            return;
        }

        if(velocityInMS < 0) {
            System.out.println("Значение velocityInKmH должно быть неотрицательным");
            return;
        }

        if(((velocityInKmH * 1000) / 3600) < velocityInMS) {
            System.out.format("%.2f", velocityInKmH);
            System.out.print(" км/ч меньше ");
            System.out.format("%.2f", velocityInMS);
            System.out.println(" м/с");
        } else {
            System.out.format("%.2f", velocityInMS);
            System.out.print(" м/с меньше ");
            System.out.format("%.2f", velocityInKmH);
            System.out.println(" км/ч");
        }
    }
}
