package com.company.lab8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        String str = s.nextLine();
        String[] arr = str.split(";");

        if(a < 0 || a > arr.length) {
            System.out.println("Число A должно быть в интервале [0," + arr.length + "]");
            return;
        }

        if(str.equals("")) {
            System.out.println("Исходная строка пуста");
            return;
        }

        System.out.println(arr[a]);
    }
}
