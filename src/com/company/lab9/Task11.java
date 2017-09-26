package com.company.lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String filename = "res/files/task4372/test" + s.nextInt() + ".css";
        File file = new File(filename);

        try {
            Scanner fileReader = new Scanner(file);

            while(fileReader.hasNext()) {
                String string = fileReader.nextLine();
                if(string.contains("{")) {
                    int a = string.indexOf("{");
                    System.out.println(string.substring(0, a));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
