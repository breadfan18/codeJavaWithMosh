package com.company;

public class Runner {

    public static void main(String[] args) {
        System.out.println(isFirst(110_000));
    }

    public static String isFirst(int income) {
        return (income > 100_000) ? "First" : "Economy";
    }
}
