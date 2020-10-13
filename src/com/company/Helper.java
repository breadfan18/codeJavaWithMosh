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
}
