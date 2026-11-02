
package com.pruralsight;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        // used built in class Scanner in scanner variable using new Scanner Object
        Scanner scanner = new Scanner(System.in);

        /* Asked users to provide first number and received the input and passed it to
        first number variable */
        System.out.println("Enter The First Number: ");
        int firstNumber = scanner.nextInt();

        /* Asked users to provide second number and received the input and passed it to
        first number variable */
        System.out.print("Enter The Second Number: ");
        int secondNumber = scanner.nextInt();

        // Printing out the options
        System.out.println();
        System.out.println("Possible calculations:");
        System.out.println("Add");
        System.out.println("Subtract");
        System.out.println("Multiply");
        System.out.println("Divide");

        System.out.print("Please select an option: ");

        /* Used the scanner next reads the next word or value typed by the user and store it to string
         store in option variable */
        String option = scanner.next();

        // creating a variable for storing the result of if else condition below.
        double result;

        // if condition is "A" it will add number and equalIgnoreCases for ignoring case sensation user input
        if (option.equalsIgnoreCase("A")) {
            result = firstNumber + secondNumber;

            // else if the condition is "S" it will subtrack number.
        } else if (option.equalsIgnoreCase("S")) {
            result = firstNumber - secondNumber ;

            // else if the condition is "M" it will Multiply number.
        } else if (option.equalsIgnoreCase("M")) {
            result = firstNumber * secondNumber;

            // else if the condition is "D" it will divide first number by second number.
        } else if (option.equalsIgnoreCase("D")) {

            /* This is if nested if statement for else if (for ignoring 0 as second number)
            if second num == 0 it will close scanner */
            if (secondNumber == 0) {
                System.out.println("Cannot Divide by zero");
                scanner.close();
                return;
            }

            // if second number isnt 0 it will divide first number by second number
            result = (double) firstNumber / secondNumber;

            // else it will provide the invalid option
        } else {
            System.out.println("Invalid option");
            scanner.close();
            return;
        }
        // printing out the result variable i created above.
        System.out.println("The answer is" + " " + result);

        scanner.close();

    }
}

