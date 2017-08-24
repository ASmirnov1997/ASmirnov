package com.company.lab1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        String a;
        Scanner s = new Scanner(System.in);
        a = s.nextLine();
        System.out.println("SELECT first_name, group FROM students WHERE student_id = " + "\'" + a + "\'");
    }
}
