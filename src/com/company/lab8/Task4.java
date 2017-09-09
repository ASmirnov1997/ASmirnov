package com.company.lab8;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        String arr[] = str.split(" ");
        int a = 0;
        int sum = 0;
        int c;

        if(str.equals("")) {
            System.out.println(0);
            return;
        }

        while(a < arr.length) {
            c = Integer.parseInt(arr[a]);
            sum = sum + c;
            a++;
        }

        double avg = (double)sum / arr.length;
        System.out.println(avg);

    }
}
