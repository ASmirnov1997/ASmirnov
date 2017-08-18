package com.company.lab2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int edge;
        Scanner s = new Scanner(System.in);
        edge = s.nextInt();
        int area;
        area = 6 * (int)Math.pow(edge, 2);
        System.out.println(area);
    }

}
