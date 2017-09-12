package com.company.lab8;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int b = s.nextInt();
        int e = s.nextInt();
        s.nextLine();
        String str = s.nextLine();
        String[] arr = str.split(" ");
        int p;
        int q;

        if(b < 0 || b > arr.length) {
            System.out.println("Число B должно быть в интервале [0," + arr.length + ")");
            return;
        }

        if(e < 0 || e > arr.length) {
            System.out.println("Число E должно быть в интервале [0," + arr.length + ")");
            return;
        }

        if(b < e) {
            p = b;
            q = e;
        } else {
            p = e;
            q = b;
        }

        while(p <= q) {
            System.out.print(arr[p] + " ");
            p++;
        }


    }
}
