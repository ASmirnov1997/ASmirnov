package com.company.lab2;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        double temperatureInC;
        Scanner s = new Scanner(System.in);
        temperatureInC = s.nextDouble();

        if(temperatureInC < -273.15) {
            System.out.println("Температура должна быть выше абсолютного нуля");
        } else {
            double temperatureInF = (temperatureInC * 1.8) + 32;
            System.out.format("%.4f",temperatureInF);
        }


    }
}
