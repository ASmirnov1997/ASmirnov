package com.company.lab8;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int p = s.nextInt();
        int q = s.nextInt();
        s.nextLine();
        String str = s.nextLine();
        String[] arr = str.split(" ");
        int a = 0;

        if(p < 0 || p > arr.length) {
            System.out.println("Число P должно быть в интервале [0," + arr.length + ")");
            return;
        }

        if(q < 0 || q > arr.length) {
            System.out.println("Число E должно быть в интервале [0," + arr.length + ")");
            return;
        }

        while(a < arr.length) {
            if(a == p) {
                System.out.print(arr[q] + " ");
            } else {
                if(a == q) {
                    System.out.print(arr[p] + " ");
                } else {
                    System.out.print(arr[a] + " ");
                }
            }

            a++;

        }


    }
}
