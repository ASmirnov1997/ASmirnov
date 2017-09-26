package com.company.lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String filename = "res/files/task4642/test" + s.nextInt() + ".txt";
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

            while(fileReader.hasNext()) {
                String string = fileReader.nextLine();
                int a = string.split(" +").length;
                count = count + a;
            }

            System.out.println(count);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Всё работает, но в последнем тесте выдаёт 940, а не 933

    }
}
