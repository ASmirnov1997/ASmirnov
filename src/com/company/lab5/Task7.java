package com.company.lab5;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int radius = s.nextInt();
        int edge = s.nextInt();

        if(radius < 0) {
            System.out.println("Радиус должен быть положительным");
            return;
        }

        if(edge < 0) {
            System.out.println("Сторона квадрата должна быть положительна");
            return;

        }

        if(Math.PI * Math.pow(radius, 2) < Math.pow(edge, 2)) {
            System.out.format("Площадь квадрата " + "%.4f" + "больше площади круга " + "%.4f", Math.pow(edge, 2), Math.PI * Math.pow(radius, 2));
        } else {
            System.out.format("Площадь круга " + "%.4f" + "больше площади квадрата " + "%.4f", Math.PI * Math.pow(radius, 2), Math.pow(edge, 2));
        }
    }
}
