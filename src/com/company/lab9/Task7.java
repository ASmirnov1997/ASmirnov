package com.company.lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String filename = "res/files/task4769/test" + s.nextInt() + ".txt";
        s.nextLine();
        String a = s.nextLine();
        String b = s.nextLine();

        File file = new File(filename);
        if(!file.exists()) {
            System.out.println("Файл не существует");
            return;
        }

        try {
            Scanner fileReader = new Scanner(file);
            String string = fileReader.nextLine();

            if(!string.contains(a) || !string.contains(b)) {
                System.out.println("Одна из указанных букв не найдена");
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

            int ca = string.indexOf(a);
            int cb = string.indexOf(b);

            if(ca < cb) {
                System.out.println((cb - 1) - ca);
            } else {
                System.out.println((ca - 1) - cb);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
