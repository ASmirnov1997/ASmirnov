package com.company.lab2;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int x = s.nextInt();

        double r = Math.pow(Math.sqrt(a * Math.pow(x, 2) + b * x + c), -1);

        System.out.format("%.4f", r);
    }
}

// Я не знаю, как вывести запись на экран типа когда знаменатель не должен быть равен нулю.
// Только если самому сделать исключение...
// Точно так же и с Not a number. Или есть ещё варианты?