package com.company.lab2;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        int velocity1;
        int velocity2;
        double distance;

        Scanner s = new Scanner(System.in);

        velocity1 = s.nextInt();
        velocity2 = s.nextInt();
        distance = s.nextDouble();

        if(velocity1 < 0 || velocity2 < 0) {
            System.out.println("Скорость должна быть неотрицательна");
        } else {
            double time = distance / (velocity1 + velocity2);
            System.out.format("%.4f", time);
        }
    }
}
//