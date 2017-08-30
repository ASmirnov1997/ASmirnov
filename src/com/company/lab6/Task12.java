package com.company.lab6;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = -10;
        int b = s.nextInt();
        int sum = 0;

        if(b < -10 || b > 10000) {
            System.out.println("Значение b должно быть в интервале [-10,10000]");
            return;
        }

        while(a <= b) {
            sum = sum + a;
            a++;
        }

        System.out.println(sum);

    }
}
