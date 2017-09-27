package com.company.lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
                Pattern pattern = Pattern.compile("^([0-9a-zA-Z_.]+)@([a-z.]*)\\.([a-z.]*)$");
                Matcher matcher = pattern.matcher(string);

                if (matcher.find()) {
                    System.out.println(matcher.group(1));
                } else {
                    System.out.println("Некорректный почтовый адрес");
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
