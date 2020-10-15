package com.company;

import java.text.NumberFormat;

public class Main {

    private static final Helper helper = new Helper();
    private static final byte MONTHS_IN_YEAR = 12;
    private static final byte PERCENT = 100;

    public static void main(String[] args) {
        mortgageCalculator();
    }

    public static void mortgageCalculator(){
        int principal = (int) readNumber("Principal ($1K - $1M): ", 1000, 1_000_000);
        double yearlyRate = readNumber("Annual Interest Rate: ", 0, 30);
        double monthlyRate = (yearlyRate/PERCENT)/MONTHS_IN_YEAR;
        byte numberOfYears = (byte) readNumber("Period (\"Years\"): ", 1, 30);
        int numberOfMonths = numberOfYears * MONTHS_IN_YEAR;

        helper.underline("MORTGAGE");
        System.out.println("Mortgage: " + mortgageFormula(principal, monthlyRate, numberOfMonths));
        System.out.println();
        helper.underline("PAYMENTS");
    }

    public static String mortgageFormula(int principal, double monthlyRate, int numberOfMonths){
        double monthlyPayment;
        double formulaDenominator = (Math.pow(1+monthlyRate, numberOfMonths)) - 1;
        double formulaNumerator = monthlyRate * (Math.pow(1 + monthlyRate, numberOfMonths));

        monthlyPayment = principal * (formulaNumerator/formulaDenominator);

        return NumberFormat.getCurrencyInstance().format(monthlyPayment);
    }

    public static void calculateBalances(int principal, double monthlyRate, int numberOfPayments) {
        int numberOfPaymentsAlreadyMade = 0;

        double firstExpression = principal * ((Math.pow(1 + monthlyRate, numberOfPayments)) - (Math.pow(1 + monthlyRate, numberOfPaymentsAlreadyMade)));
        double secondExpression = (Math.pow(1 + monthlyRate, numberOfPayments));

        for (int i = 0; i < numberOfPayments; i++) {



        }
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
