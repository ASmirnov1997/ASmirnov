package com.company.lab6;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int a;

//        while(a <= 20) {
//            if (x == a) {
//                System.out.println(a + "+");
//            } else {
//                System.out.println(a);
//            }
//
//            a++;
//        }

        for(a = 10; a <= 20; a++) {
            if (x == a) {
                System.out.println(a + "+");
            } else {
                System.out.println(a);
            }
        }






    }

}
