package com.company.lab1;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String user = s.next();
        String pass = s.next();
        String host = s.next();
        String port = s.next();
        String db = s.next();

        String result = "User ID=" + user + ";Password=" +
                pass + ";Host=" + host + ";Port=" + port + ";Database=" + db + ";";

        System.out.println(result);
    }
}
