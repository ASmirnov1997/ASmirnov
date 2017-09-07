package com.company.lab8;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        String[] arr = str.split(" ");

        int a = 0;

        if(str.equals("")) {
            return;
        }

        while(a < arr.length) {
            System.out.println(arr[a] + " " + a);
            a++;
        }

    }
}
