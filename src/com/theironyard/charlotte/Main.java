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

            /* waiting for input, if no valid key entry add new <key,value>
            ... printing welcome message */

            person.putIfAbsent(account, Math.random() * 100.00);
            System.out.println("Hello, " + account);

            /* Showing three options
            looping options until user cancels
            HashMap should keep previously-set values when it loops */


            // initializing int t

            int t = 1;
            while (t == 1) {

                System.out.println("Choose an option:");
                System.out.println(" [ 1 ] Check Balance \n [ 2 ] Withdraw \n [ 3 ] Remove Account \n" +
                        " [ 4 ] Cancel Transaction");

                String option = scanner.nextLine();

                // using switch

                switch (option) {

                    case "1":

                        System.out.println( "Your balance is " + person.get(account)) ;
                        break;

                    case "2":
                        System.out.println( "Please enter withdraw amount" ) ;

                        double withdrawAmount = scanner.nextDouble() ;
                        double currentAmount = person.get(account);
                        double total = Double.valueOf(currentAmount - withdrawAmount) ;
                        person.replace( account, total, withdrawAmount ) ;

                        System.out.print( "Printing... " + withdrawAmount + " \n Please Remove cash... \n" ) ;
                        System.out.println( "You have $" + total + " left in your account." ) ;
                        break;

                    case "3":

                        System.out.println("To delete you account, enter your name.");
                        String remove = scanner.nextLine();
                        person.remove(remove);
                        break;

                    case "4":

                        System.out.println("\n Transaction canceled. \n \n");
                        t = 2;
                        break;
                }
            } break;
        }
    }
}