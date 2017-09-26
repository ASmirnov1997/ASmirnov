package com.company.lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String filename = "res/files/task4954/test" + s.nextInt() + ".txt";
        File file = new File(filename);
        s.nextLine();
        String c = s.nextLine();


        if(!file.exists()) {
            System.out.println("Файл не существует");
            return;
        }

        try {
            Scanner fileReader = new Scanner(file);
            int count = 0;
            while(fileReader.hasNext()) {
                String a = fileReader.nextLine();
                if(a.contains(c)) {
                    count++;
                }
            }

            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
