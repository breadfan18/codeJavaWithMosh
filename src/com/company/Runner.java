package com.company;

public class Runner {

    public static void main(String[] args) {
        fizzBuzz();
    }

    public static void fizzBuzz() {
        Helper help = new Helper();
        String input = "";
        while (true) {
            input = help.getStringFromScanner("Enter an input: ");
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }

    }
}
