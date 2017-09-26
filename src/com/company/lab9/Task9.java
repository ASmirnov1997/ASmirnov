package com.company.lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String filename = "res/files/task6861/test" + s.nextInt() + ".txt";
        File file = new File(filename);

        if(!file.exists()) {
            System.out.println("Файл не существует");
            return;
        }

        try {
            Scanner fileReader = new Scanner(file);
            String dog = "@";

            while(fileReader.hasNext()) {
                String string = fileReader.nextLine();
                int a = string.indexOf(dog);
                System.out.println(string.substring(0, a));
            }

            //Не знаю, как вывести некорректный почтовый адрес, какое должно быть условие
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
