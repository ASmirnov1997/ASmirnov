package com.company.lab2;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int initialVelocity = s.nextInt();
        int time = s.nextInt();
        int acceleration = s.nextInt();

        if(initialVelocity < 0) {
            System.out.println("Начальная скорость должна быть неотрицательна");
        } else {
            if(time < 0) {
                System.out.println("Время должно быть положительным");
            } else {
                double distance = (initialVelocity * time) + ((acceleration * Math.pow(time, 2)) / 2);
                System.out.println(distance);
            }
        }

    }
}
//