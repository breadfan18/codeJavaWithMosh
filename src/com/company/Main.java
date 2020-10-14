package com.company;

import java.text.NumberFormat;

public class Main {

    public static Helper helper = new Helper();

    public static void main(String[] args) {
        mortgageCalculator();
    }

    public static void mortgageCalculator(){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = (int) readNumber("Principal ($1K - $1M): ", 1000, 1_000_000);
        double yearlyRate = readNumber("Annual Interest Rate: ", 0, 30);
        double monthlyRate = (yearlyRate/PERCENT)/MONTHS_IN_YEAR;
        int numberOfYears = (int) readNumber("Period (\"Years\"): ", 1, 30);
        int numberOfMonths = numberOfYears * MONTHS_IN_YEAR;

        System.out.println("-----------------------------------");
        System.out.println("Mortgage: " + mortgageFormula(principal, monthlyRate, numberOfMonths));
        System.out.println("-----------------------------------");
    }

    public static String mortgageFormula(int principal, double monthlyRate, int numberOfMonths){
        double monthlyPayment;
        double formulaDenominator = (Math.pow(1+monthlyRate, numberOfMonths)) - 1;
        double formulaNumerator = monthlyRate * (Math.pow(1 + monthlyRate, numberOfMonths));

        monthlyPayment = principal * (formulaNumerator/formulaDenominator);

        return NumberFormat.getCurrencyInstance().format(monthlyPayment);
    }

    public static double readNumber(String prompt, double min, double max) {
        double value;

        while (true) {
            value =  helper.getDoubleFromScanner(prompt);
            if (value > min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
}
