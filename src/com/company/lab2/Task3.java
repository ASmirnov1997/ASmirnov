package com.company.lab2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int edge;
        Scanner s = new Scanner(System.in);
        edge = s.nextInt();
        if(edge <= 0) {
            System.out.println("Значение edge должно быть положительным");
        } else {
            int volume = (int)Math.pow(edge, 3);
            System.out.println(volume);
        }

    }
}
