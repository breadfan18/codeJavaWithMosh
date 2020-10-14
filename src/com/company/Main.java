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

        int principal, numberOfYears, numberOfMonths = 0;
        double yearlyRate, monthlyRate = 0;

        while (true) {
            principal =  helper.getIntFromScanner("Principal ($1K - $1M): ");
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000");
        }

        while (true) {
            yearlyRate = helper.getDoubleFromScanner("Annual Interest Rate: ");
            if (yearlyRate > 0 || yearlyRate <= 30){
                monthlyRate = (yearlyRate/PERCENT)/MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a number greater than 0 and less than or equal to 30");
        }

        while (true) {
            numberOfYears = helper.getIntFromScanner("Period (\"Years\"): ");
            if (numberOfYears >= 1 && numberOfYears <= 30) {
                numberOfMonths = numberOfYears * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        System.out.println("-----------------------------------");
        System.out.println("Mortgage: " + mortgageFormula(principal, monthlyRate, numberOfMonths));
        System.out.println("-----------------------------------");
    }

    public static String mortgageFormula(int principal, double monthlyRate, int numberOfMonths){
        double monthlyPayment;
        double formulaDenominator = (Math.pow(1+monthlyRate, numberOfMonths)) - 1;
        double formulaNumerator = monthlyRate * (Math.pow(1 + monthlyRate, numberOfMonths));

        monthlyPayment = principal * (formulaNumerator/formulaDenominator);

        String formattedMonthlyPayment = NumberFormat.getCurrencyInstance().format(monthlyPayment);
        return formattedMonthlyPayment;
    }

    public static doube validation (String userInput, String doubleOrInt, )
}
