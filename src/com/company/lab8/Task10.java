package com.company.lab8;

import java.util.Scanner;

/**
 * Created by pro-27 on 13.09.2017.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int ss = s.nextInt();
        s.nextLine();
        String str = s.nextLine();
        String arr[] = str.split(" ");
        int b;
        int c;
        int d = 0;



        while(d < ss) {
            c = 0;
            b = arr.length - 1;
            String q = arr[b];
            while(c < arr.length && b > 0) {
                arr[b] = arr[b - 1];
                b--;
                c++;

            }
            arr[b] = q;
            d++;
        }

//        while(c < arr.length && b > 0) {
//            arr[b] = arr[b - 1];
//            b--;
//            c++;
//
//        }

        c = 0;

        while(c < arr.length) {
            System.out.print(arr[c] + " ");
            c++;
        }
    }
}
