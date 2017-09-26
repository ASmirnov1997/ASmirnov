package com.company.lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String filename = "res/files/task5847/test" + s.nextInt() + ".txt";

        File file = new File(filename);

        if(!file.exists()) {
            System.out.println("Файл не существует");
            return;
        }

        s.nextLine();
        String a = s.nextLine();

        try {
            Scanner fileReader = new Scanner(file);
            String string = fileReader.nextLine();
            if(!string.contains(a)) {
                System.out.println("Указанная буква не найдена");
                return;
            }


            int f = 0;
            int i;
            int count = 0;
            i = string.indexOf(a, f);
            while(i >= 0) {
                f = i + 1;
                i = string.indexOf(a, f);
                count++;
            }

            if(count > 1) {
                System.out.println("В данной строке несколько искомых букв");
                return;
            }

            int result = string.length() - string.indexOf(a) - 1;
            System.out.println(result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
