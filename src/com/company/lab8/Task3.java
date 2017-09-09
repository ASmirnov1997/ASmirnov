package com.company.lab8;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.nextLine();
        String[] arr = a.split(" ");

        int n = arr.length - 1;
        int b = 0;

        while(n >= b) {
           System.out.print(arr[n] + " ");
              n--;
        }

//        System.out.print(arr[n] + " " + n);
//        n--;
//        System.out.print(arr[n] + " " + n);
//        n--;
//        System.out.print(arr[n] + " " + n);
//        n--;
//        System.out.print(arr[n] + " " + n);
//        n--;
//        System.out.print(arr[n] + " " + n);


    }
}
