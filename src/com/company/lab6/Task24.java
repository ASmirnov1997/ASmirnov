package com.company.lab6;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();

       for(int a = 30; a <= 40; a++) {
           if(x == a) {
               System.out.println(a + "+");
           } else {
               System.out.println(a + "-");
           }
       }
    }
}
