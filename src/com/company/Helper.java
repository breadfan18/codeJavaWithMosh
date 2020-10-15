package com.company;

import java.util.Scanner;

public class Helper {

    public int getIntFromScanner(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    public double getDoubleFromScanner(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextDouble();
    }

    public String getStringFromScanner(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.next();
    }

    public void underline(String text) {
        System.out.println(text);
        for (int i = 0; i < text.length(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
