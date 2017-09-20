package com.company.lab7;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = "abcdefwxyz";
        String ca = s.nextLine();
        String cb = s.nextLine();
        int a = str.indexOf(ca);
        int b = str.indexOf(cb);

        if(!str.contains(ca)) {
            System.out.println("Значение CA отсутствует в строке");
            return;
        }

        if(!str.contains(cb)) {
            System.out.println("Значение CB отсутствует в строке");
            return;
        }

        if(a < b) {
            System.out.println((b - 1) - a);
        } else {
            System.out.println((a - 1) - b);
        }
    }
}
