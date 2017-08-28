package com.company.lab5;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int xt = s.nextInt();
        int yt = s.nextInt();
        int xp = s.nextInt();
        int yp = s.nextInt();
        int h = s.nextInt();
        int w = s.nextInt();
        int h1 = h + yp;
        int w1 = w + xp;

        if(yt < 0) {
            System.out.println("Координата Y должна быть неотрицательной");
        }

        if (h < 0) {
            System.out.println("Высота должна быть положительна");
            return;
        }

        if(w < 0) {
            System.out.println("Ширина должна быть положительна");
        }

        if(xt > xp && yt > yp && xt < w1 && yt < h1) {
            System.out.println("точка внутри");
        } else {
            System.out.println("точка не внутри");

        }

    }
}
