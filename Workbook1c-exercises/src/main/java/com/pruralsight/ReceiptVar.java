
package com.pruralsight;

public class ReceiptVar {
    public static void main(String[] args) {

        String itemName = "apples";
        double itemPrice = 7.10;
        int quantity = 3;

        System.out.printf("You bought %d %s for $%.2f%n",
                quantity, itemName, itemPrice);

    }
}

