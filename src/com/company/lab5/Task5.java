package com.company.lab5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double distanceInKm = s.nextDouble() * 1000;
        double distanceInFeet = s.nextDouble() * 0.305;

        if(distanceInKm < 0) {
            System.out.println("Значение distanceInKm должно быть неотрицательным");
            return;
        }

        if(distanceInFeet < 0) {
            System.out.println("Значение distanceInFeet должно быть неотрицательным");
            return;
        }

        if(distanceInKm > distanceInFeet) {
            System.out.println("Расстояние в футах меньше");
        } else {
            System.out.println("Расстояние в километрах меньше");
        }
    }
}
