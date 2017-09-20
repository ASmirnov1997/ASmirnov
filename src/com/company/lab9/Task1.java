package com.company.lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by pro-27 on 20.09.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String filename = "res/files/task6175/test" + s.nextInt() + ".txt";
        File file = new File(filename);

        if(!file.exists()) { // проверка существования
            System.out.println("Файл " + file.getAbsolutePath() + " не существует");
            return;
        }

        try {
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNext()) {
                String line  = fileReader.nextLine() + ",";
                System.out.print(line + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
