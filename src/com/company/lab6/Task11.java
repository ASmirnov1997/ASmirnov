package com.company.lab6;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = 500;
        int sum = 0;

        if(a < -100 || a > 500) {
            System.out.println("Значение A должно быть в интервале [-100, 500]");
            return;
        }

        while(a <= b) {
            sum = sum + a;
            a++;
        }

        System.out.println(sum);

    }
}
