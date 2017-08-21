package com.company.lab2;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int mass = s.nextInt();
        int velocity = s.nextInt();
        int height = s.nextInt();

        if(mass < 0) {
            System.out.println("Значение mass должно быть положительным");
        } else {
            if(velocity < 0) {
                System.out.println("Значение velocity должно быть положительным");
            } else {
                if(height < 0) {
                    System.out.println("Значение height должно быть неотрицательным");
                } else {
                    double kineticEnergy = (mass * Math.pow(velocity, 2)) / 2;
                    double g = 9.8067;
                    double potentialEnergy = mass * g * height;
                    System.out.print("Кинетическая энергия составляет: ");
                    System.out.format("%.4f", kineticEnergy);
                    System.out.println(" дж");
                    System.out.print("Потенциальная энергия составляет: ");
                    System.out.format("%.4f", potentialEnergy);
                    System.out.println(" дж");

                }
            }
        }
    }
}
//