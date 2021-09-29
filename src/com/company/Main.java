package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        int number = readNumber();
        States state = checkForState(number);

        printStringsStates(state);

    }

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        try {
            System.out.print("Enter a number suitable for the task condition: ");
            number = scanner.nextInt();
        } catch (Exception e) {
            System.out.print("Invalid data");
            System.exit(1);
        }

        return number;
    }

    private static States checkForState(int num) {
        if ((num % 2) != 0 && num < 0 && num > -10 && num <= -1) {
            return (States.NEGATIVE_ODD_SINGLE_DIGIT_NUMBER);

        } else if ((num % 2) == 0 && num > 0 && num >= 100 && num < 1000) {
            return (States.POSITIVE_EVEN_THREE_DIGIT_NUMBER);

        } else if (num == 0) {
            return (States.ZERO_NUMBER);

        } else {
            return (States.WRONG_NUMBER);
        }

    }

    private static void printStringsStates(States state) {
        switch (state) {
            case NEGATIVE_ODD_SINGLE_DIGIT_NUMBER:
                System.out.println("negative odd single digit number ");
                break;
            case POSITIVE_EVEN_THREE_DIGIT_NUMBER:
                System.out.println("positive even three-digit number ");
                break;
            case ZERO_NUMBER:
                System.out.println("zero number");
                break;
        }

    }

}
