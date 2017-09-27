package com.company.lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by pro-27 on 27.09.2017.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String filename = "res/files/task5537/test" + s.nextInt() + ".txt";
        File file = new File(filename);

        if(!file.exists()) {
            System.out.println("Файл не существует");
            return;
        }

        int count = 0;

        try {
            Scanner fileReader = new Scanner(file);

            if(!fileReader.hasNext()) {
                System.out.println("Файл пуст");
                return;
            }

            while(fileReader.hasNext()) {
                String string = fileReader.nextLine();

                if(string.length() < 4) {
                    System.out.println("Запись короче четырех символов");
                    return;
                }

                if(string.length() > 4) {
                    System.out.println("Запись длиннее четырех символов");
                    return;
                }

                char[] arr = string.toCharArray();
                if(arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[3]) {
                    count++;
                }

            }

            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
