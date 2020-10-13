package com.company;

public class Runner {

    public static void main(String[] args) {
        System.out.println(fizzBuzz());
    }

    public static String fizzBuzz() {
        Helper help = new Helper();
        int number = help.getIntFromScanner("Enter a number: ");

        if (number % (5 * 3) == 0)
            return "FizzBuzz";
        else if (number % 5 == 0)
            return "Fizz";
        else if (number % 3 == 0)
            return "Buzz";

        return String.valueOf(number);
    }
}
