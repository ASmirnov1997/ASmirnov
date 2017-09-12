package com.company.lab8;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        String arr[] = str.split(" ");
        int n = arr.length - 1;

        while(n >= 0) {
            System.out.print(arr[n] + " ");
            n--;
        }
    }
}
