package com.company.lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String filename = "res/files/task3226/test" + s.nextInt() + ".txt";
        File file = new File(filename);

        if(!file.exists()) {
            System.out.println("Файл не существует");
            return;
        }

        try {
            Scanner fileReader = new Scanner(file);

            int count1 = 0;
            int count2 = 0;



            while(fileReader.hasNext()) {
                String string = fileReader.nextLine();
                if(string.contains("{")) {
                        int f = 0;
                        int i;
                        i = string.indexOf("{", f);
                        while(i >= 0) {
                            f = i + 1;
                            i = string.indexOf("{", f);
                            count1++;
                        }
                }

                if(string.contains("}")) {
                    int f = 0;
                    int i;
                    i = string.indexOf("}", f);
                    while(i >= 0) {
                        f = i + 1;
                        i = string.indexOf("}", f);
                        count2++;
                    }
                }
            }

            if(count1 > count2) {
                System.out.println("Неожиданный конец файла");
                return;
            }

            if(count2 > count1) {
                System.out.println("Неожиданная закрывающаяся скобочка");
                return;
            }

            if(count1 == count2) {
                System.out.println((count1 + count2) / 2);
            }

            //проблемы с тестом 9, выдаёт 13
            //и я не предусмотрел одного: если сначала идут закрывающие скобки, а потом открывающие, то программа будет работать, что неверно.

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
