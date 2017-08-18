package com.company.lab1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("<circle cx=\"$CX\" cy=\"$CY\" r=\"$R\" fill=\"$FILL\"/>");
        int cx;
        int cy;
        int r;
        String fill;
        Scanner s = new Scanner(System.in);
        cx = s.nextInt();
        cy = s.nextInt();
        r = s.nextInt();
        fill = s.next();
        System.out.println("<circle cx=\"" + cx +"\" cy=\"" + cy +"\" r=\"" + r + "\" fill=\"" + fill +"\"/>");
    }
}
