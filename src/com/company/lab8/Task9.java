package com.company.lab8;

import java.util.Scanner;

/**
 * Created by pro-27 on 13.09.2017.
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        String arr[] = str.split(" ");
        int b = arr.length - 1;
        int c = 0;


        String q = arr[b];

        while(c < arr.length && b > 0) {
            arr[b] = arr[b - 1];
            b--;
            c++;

        }
          arr[b] = q;

        c = 0;

        while(c < arr.length) {
            System.out.print(arr[c] + " ");
            c++;
        }


    }
}
