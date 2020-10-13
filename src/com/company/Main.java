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

        int principal = helper.getIntFromScanner("Principal: ");
        double monthlyRate = (helper.getDoubleFromScanner("Annual Interest Rate: ")/PERCENT)/MONTHS_IN_YEAR;
        int months = helper.getIntFromScanner("Period (\"Years\"): ")*MONTHS_IN_YEAR;

        System.out.println("-----------------------------------");
        System.out.println("Mortgage: " + mortgageFormula(principal, monthlyRate, months));
        System.out.println("-----------------------------------");
    }

    public static String mortgageFormula(int principal, double monthlyRate, int numberOfMonths){
        double monthlyPayment;
        double formulaNumerator = monthlyRate * (Math.pow(1 + monthlyRate, numberOfMonths));
        double formulaDenominator = (Math.pow(1+monthlyRate, numberOfMonths)) - 1;

        monthlyPayment = principal * (formulaNumerator/formulaDenominator);

        String formattedMonthlyPayment = NumberFormat.getCurrencyInstance().format(monthlyPayment);
        return formattedMonthlyPayment;
    }
}
