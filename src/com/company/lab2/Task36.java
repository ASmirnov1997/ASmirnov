package com.company.lab2;

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int xa = s.nextInt();
        int ya = s.nextInt();
        int xb = s.nextInt();
        int yb = s.nextInt();

        double ab = Math.sqrt((Math.pow((xb - xa), 2) + Math.pow((yb - ya), 2)));

        System.out.format("%.4f", ab);
    }
}
