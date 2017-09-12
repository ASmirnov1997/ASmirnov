package com.company.lab8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int m = s.nextInt();
        s.nextLine();
        String data = s.nextLine();
        String arr[] = data.split(" ");
        int n = arr.length - 1;
        int a = 0;

        while(n >= a) {
            System.out.print((Integer.parseInt(arr[n]) * m) + " ");
            n--;
        }
    }
}
