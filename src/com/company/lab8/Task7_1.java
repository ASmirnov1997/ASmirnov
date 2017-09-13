package com.company.lab8;


import java.util.Scanner;

public class Task7_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int p = s.nextInt();
        int q = s.nextInt();
        s.nextLine();

        String str = s.nextLine();
        String arr[] = str.split(" ");
        int a = 0;
        String cup = arr[q];
        arr[q] = arr[p];
        arr[p] = cup;


        while(a < arr.length) {
            System.out.print(arr[a] + " ");
            a++;
        }

    }
}
