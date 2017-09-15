package com.company.lab7;

import java.util.Scanner;

/**
 * Created by pro-27 on 15.09.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = "abcdefwxyz";
        String a = s.nextLine();

        if(str.contains(a)) {
            System.out.printf("Содержится");
        } else {
            System.out.printf("Не содержится");
        }

    }
}
