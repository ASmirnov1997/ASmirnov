package com.company.lab7;

import java.util.Scanner;

/**
 * Created by pro-27 on 20.09.2017.
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        String[] arr = str.split(", ");
        System.out.println(arr.length);
    }
}
