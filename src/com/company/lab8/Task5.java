package com.company.lab8;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String left = s.nextLine();
        String right = s.nextLine();

        String arr1[] = left.split(" ");
        String arr2[] = right.split(" ");
        int a = 0;
        int pr;

        if(arr1.length < arr2.length || arr2.length < arr1.length) {
            System.out.println("Размеры массивов должны быть одинаковы");
        }

//        while(a < arr1.length) {
//            pr =
//        }
    }
}
