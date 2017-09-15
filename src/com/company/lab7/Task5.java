package com.company.lab7;

import java.util.Scanner;

/**
 * Created by pro-27 on 15.09.2017.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = "abcdefwxyz";
        int ca = s.nextInt();
        int cb = s.nextInt() + 1;

        if(ca > cb && cb > 0) {
            System.out.println("Значение CA должно быть меньше CB");
            return;
        }

        if(ca < 0 || ca > str.length()) {
            System.out.println("Значение CA должно быть в интервале [0," + str.length() + ")");
            return;
        }

        if(cb < 0 || cb > str.length()) {
            System.out.println("Значение CB должно быть в интервале [0," + str.length() + ")");
            return;
        }

        System.out.println(str.substring(ca, cb));



    }
}
