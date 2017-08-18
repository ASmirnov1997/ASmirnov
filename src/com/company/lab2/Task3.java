package com.company.lab2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int edge;
        Scanner s = new Scanner(System.in);
        edge = s.nextInt();
        int volume = (int)Math.pow(edge, 3);
        System.out.println(volume);
    }
}
