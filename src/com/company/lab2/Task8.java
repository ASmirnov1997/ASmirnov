package com.company.lab2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int totalInM;
        int partInCm;
        Scanner s = new Scanner(System.in);
        totalInM = s.nextInt();
        partInCm = s.nextInt();

        if(totalInM <= 0) {
            System.out.println("Значение totalInM должно быть положительным");
        } else {
            if(partInCm <= 0) {
                System.out.println("Значение partInCm должно быть положительным");
            } else {
                totalInM = totalInM * 100;
                int result = totalInM / partInCm;
                int left = result * partInCm;
                left = totalInM - left;
                System.out.println(result +  " шт и " + left + " см");
            }
        }
    }
}
