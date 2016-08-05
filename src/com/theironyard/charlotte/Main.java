package com.theironyard.charlotte;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    //initializing new Scanner labeled scanner
    private static Scanner scanner = new Scanner(System.in);

    //initializing new HashMap labeled person
    private static HashMap<String, Double> person = new HashMap<>();

    //main
    public static void main(String[] args) throws Exception {
        while (true) {

            /* HashMap = <key, value >
            adding to HashMap */
            person.put("Steve", 45.00);
            person.put("Lisa", 85.00);
            person.put("Gary", 145.00);
            person.put("Raymond", 120.00);

            // setting String labeled account to scanner
            System.out.println("Welcome! \n Please sign in...");
            String account = scanner.nextLine();

            /* waiting for input must contain valid key entry
            ... printing welcome message */

            person.putIfAbsent(account, Math.random() * 100.00);
            System.out.println("Hello, " + account);


            /* Showing three options
            looping options until user cancels
            HashMap should keep previously-set values when it loops */

            int check = 1;
            while (check == 1) {

                System.out.println("Please choose an option:");
                System.out.println(" [ 1 ] Check Balance \n [ 2 ] Withdraw \n [ 3 ] Cancel Transaction ");
                String option = scanner.nextLine();

                    // option 1
                if (option.equalsIgnoreCase("1")) {

                    System.out.println("Your balance is " + person.get(account));


                }

                    // option 2
                else if (option.equalsIgnoreCase("2")) {

                    System.out.println("Please enter withdraw amount");
                    String withdrawAmount = scanner.nextLine();
                    Integer.getInteger(withdrawAmount);

                    System.out.print("Printing... " + withdrawAmount + "\n");

                    // option 3
                }
                else if (option.equalsIgnoreCase("3")){
                    System.out.println("If you would like to delete you account, enter your name.");
                    String remove = scanner.nextLine();
                    person.remove(account);

                }

                // option 4
                else if (option.equalsIgnoreCase("4")) {
                    System.out.println("Transaction canceled.");
                    break;

                }
                return;
            }

            // returns to while statement
            return;

        }
    }
}