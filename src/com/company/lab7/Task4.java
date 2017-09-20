package com.company.lab7;

import java.util.Scanner;

/**
 * Created by pro-27 on 20.09.2017.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = "abcdacadbacdaabaadc";
        String a = s.nextLine();

        if(a.length() < 2 || a.length() > 2) {
            System.out.println("Вводимая строка должна содержать ровно 2 символа");
            return;
        }

        int f = 0;
        int i;
        i = str.indexOf(a, f);
        while(i >= 0) {
            System.out.print(i + " ");
            f = i + 1;
            i = str.indexOf(a, f);
        }
    }
}
