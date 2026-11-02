
package com.pruralsight;

public class MathApp {
    public static void main(String[] args) {

        // High Num
        int bobSalary = 65000;
        int garySalary = 72000;

        // Used Math.max static method to get the max number/salary.
        int highestSalary = Math.max(bobSalary, garySalary);

        // Used System.out,println to ask system to print out newline, with (+)
        System.out.println("The highest salary is $" + highestSalary);


        // Low Num
        double carPrice = 25000;
        double truckPrice = 38000;

        // Used Math.min static method to get the max number/salary.
        double lowestPrice = Math.min(carPrice, truckPrice);

        // Used System.out,println to ask system to print out newline, with (+).
        System.out.println("The lowest vehicle price is $" + lowestPrice);


        // Question 3: Area of a circle
        double radius = 7.25;

        /*  As area = Pie * (Radius * Radius) Used Math class to Math.PI is
        (mathematical value of PI) * (Math.Pow to calculate the power of a number) */
        double circleArea = Math.PI * Math.pow(radius, 2);

        // Used System.out,println to ask system to print out newline, with (+)
        System.out.println("The area of the circle is " + circleArea);


        // Question 4: Square root of 5.0
        double number = 5.0;
        double squareRoot = Math.sqrt(number);

        // Built-in class function for finding the square root of number 5
        System.out.println("The square root is " + squareRoot);


        // Question 5: Distance between two points
        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;

        // Subtract X values
        double xDistance = x2 - x1;

        // Subtract Y values
        double yDistance = y2 - y1;

        // Square both differences
        double xSquare = xDistance * xDistance;
        double ySquare = yDistance * yDistance;

        // Add the squares
        double total = xSquare + ySquare;

        // Find the square root
        double distance = Math.sqrt(total);
        System.out.println("The distance is " + distance);


        // Question 6: Absolute value
        double negativeNumber = -3.8;
        // Got the Abs Value using Math.abs class of negativeNumber
        double absoluteValue = Math.abs(negativeNumber);

        // Used System.out,println to ask system to print out newline, with (+)
        System.out.println("The absolute value is " + absoluteValue);


        // Question 7: Random number
        // Used Math.random (class) to get the random number
        double randomNumber = Math.random();

        System.out.println("Random number: " + randomNumber);


        // Question 8: Minutes and milliseconds in 24 days
        long days = 24;
        long hoursPerDay = 24;
        long minutesPerHour = 60;
        long secondsPerMinute = 60;
        long millisecondsPerSecond = 1000;


        long totalMinutes = days * hoursPerDay * minutesPerHour;
        long totalMilliseconds = totalMinutes *
                secondsPerMinute * millisecondsPerSecond;

        System.out.println("Minutes in 24 days: " + totalMinutes);
        System.out.println("Milliseconds in 24 days: " + totalMilliseconds);

    }
}

