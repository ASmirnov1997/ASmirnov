package com.company.lab6;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a;
        int count1 = 0;
        int count2 = 0;

        do {
            a = s.nextInt();
            if(a <= 83) {
                count1++;
            }

            if(a >= 199) {
                count2++;
            }

        } while(a <= 83 || a >= 199);

        System.out.println("Количество слева: " + count1 + ", количество справа: " + count2);
    }
}
