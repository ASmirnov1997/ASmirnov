package com.company.lab8;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String left = s.nextLine();
        String right = s.nextLine();

        String[] arr1 = left.split(" ");
        String[] arr2 = right.split(" ");
        int a = 0;

        if(arr1.length != arr2.length) {
            System.out.println("Размеры массивов должны быть одинаковы");
            return;
        }

        while(a < arr1.length) {
           int c = Integer.parseInt(arr1[a]) * Integer.parseInt(arr2[a]);
           a++;
            System.out.print(c + " ");
        }

    }
}
