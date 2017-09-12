package com.company.lab8;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        String arr[] = {"a", "b", "c", "d", "e", "f", "g", "h"};
        int a = 0;


        while(a < arr.length) {
            if(arr[a].equals(str)) {
                System.out.println(arr[a] + "+");
            } else {
                System.out.println(arr[a]);
            }

            a++;


        }


    }
}
