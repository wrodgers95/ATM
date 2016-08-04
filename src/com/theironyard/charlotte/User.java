package com.theironyard.charlotte;

public class User {

    String option;
    String amount;

    public void chooseOption() throws Exception {
        System.out.println("Please choose an option. \n To choose an option, type: \n [ Check Balance ] \n [ Withdraw ] \n [ Cancel ]");
        option = Main.scanner.nextLine();

        if (option.equalsIgnoreCase("check balance")) {
            System.out.println("Your balance is $100 ... \n Thank you, please come again.");

        } else if (option.equalsIgnoreCase("cancel")) {
            System.out.println("Transaction canceled... \n Thank you, please come again.");

            // WITHDRAWING
        } else if (option.equalsIgnoreCase("withdraw")) {
            System.out.println("Enter withdraw amount:");
            amount = Main.scanner.nextLine();
            int x = Integer.valueOf(amount);

            if (x > 0 && x < 100) {
                System.out.println("Printing... $" + x + " \n Please remove cash...");
                System.out.println("\n You have $" + (100 - x) + " left in your account. \n Thank you, please come again.");

            } else {
                System.err.println("Please enter a valid amount.");

            }

            // NO VALID COMMANDS
        } else {
            throw new Exception("Please enter a valid command.");
        }

    }
}