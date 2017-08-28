package com.company.lab5;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int xt = s.nextInt();
        int yt = s.nextInt();
        int xp1 = s.nextInt();
        int yp1 = s.nextInt();
        int xp2 = s.nextInt();
        int yp2 = s.nextInt();

        if(xt < 0) {
            System.out.println("Координата X должна быть неотрицательной");
        }

        if(xt >= xp1 && yt >= yp1 && xt <= xp2 && yt <= yp2) {
            System.out.println("Точка принадлежит прямой");
        } else {
            System.out.println("Точка не принадлежит прямой");

        }
    }
}
