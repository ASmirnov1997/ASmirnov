package com.company.lab5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if(a > b) {
            System.out.println("Первое");
        } else {
            System.out.println("Второе");
        }
    }
}
