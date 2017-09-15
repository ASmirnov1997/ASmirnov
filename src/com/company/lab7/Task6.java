package com.company.lab7;

import java.util.Scanner;

/**
 * Created by pro-27 on 15.09.2017.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = "abcdefwxyz";
        String ca = s.nextLine();
        String cb = s.nextLine();

        if(!str.contains(ca)) {
            System.out.println("Значение CA отсутствует в строке");
            return;
        }

        if(!str.contains(cb)) {
            System.out.println("Значение CB отсутствует в строке");
            return;
        }

        int a = str.indexOf(ca);
        int b = str.indexOf(cb);

        if(a < b) {
            System.out.println(str.substring(a + 1, b));
        } else {
            System.out.println(str.substring(b + 1, a));
        }



    }
}
