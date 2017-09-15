package com.company.lab7;

import java.util.Scanner;

/**
 * Created by pro-27 on 15.09.2017.
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = "abcdefwxyz";
        int ca = s.nextInt();
        int cb = s.nextInt();

        if(ca < 0) {
            System.out.println("Значение CA должно быть в интервале [0," + str.length() + ")");
            return;
        }

        if(cb < 0) {
            System.out.println("Значение CB должно быть неотрицательно");
            return;
        }

        if(ca + cb > str.length()) {
            System.out.println("Сумма значений CA и CB должна быть меньше длины строки");
            return;
        }

        System.out.println(str.substring(0, ca) + str.substring(ca + cb, 10));



    }
}
