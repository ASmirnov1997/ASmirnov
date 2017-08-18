package com.company.lab1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("INSERT INTO (x, y) VALUES ('$X', '$Y');");
        int a;
        int b;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        System.out.println("INSERT INTO (x, y) VALUES ('" + a +"', '" + b +"');");
    }

}
