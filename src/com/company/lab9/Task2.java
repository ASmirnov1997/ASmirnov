package com.company.lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by pro-27 on 20.09.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String filename = "res/files/task4488/test" + s.nextLine() + ".txt";
        File file = new File(filename);

        if(!file.exists()) {
            System.out.println("Файл не существует");
            return;
        }



        try {
            Scanner fileReader = new Scanner(file);
            if(!fileReader.hasNext()) {
                System.out.println("Файл пуст");
                return;
            }
            int count = 0;
            String first = fileReader.nextLine();
            System.out.print(first + " ");
            while(fileReader.hasNext()) {
                String line = fileReader.nextLine();
                count++;
            }

            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
