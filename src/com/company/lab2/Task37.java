package com.company.lab2;

import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int volume1 = s.nextInt();
        int temperature1 = s.nextInt();
        int volume2 = s.nextInt();
        int temperature2 = s.nextInt();

        if(volume1 < 0 || volume2 < 0) {
            System.out.println("Объём должен быть неотрицательным");
        } else {
            double volume = volume1 + volume2;
            double temperature = (double)((temperature1 * volume1) + (temperature2 * volume2)) / (volume1 + volume2);

            System.out.format("%.4f", volume);
            System.out.println();
            System.out.format("%.4f", temperature);

        // Не выводит целую часть в переменной temperature. Выводит 73,0000 вместо 73,3333. Почему?
        }
    }
}
