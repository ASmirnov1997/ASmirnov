package com.company.lab8;

import java.util.Scanner;

/**
 * Created by pro-27 on 13.09.2017.
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int arr[] = new int[]{11, 13, 17, 19, 10, 12, 14, 15, 16, 18, 20};
        int a = 0;

        while(a < arr.length) {
            if(arr[a] == x) {
                System.out.println(arr[a] + "+");
            } else {
                System.out.println(arr[a]);
            }

            a++;
        }
    }
}
