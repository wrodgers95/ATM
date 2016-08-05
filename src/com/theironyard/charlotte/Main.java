package com.theironyard.charlotte;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    //initializing new Scanner labeled scanner
    public static Scanner scanner = new Scanner(System.in);

    //initializing new HashMap labeled person
    private static HashMap<String, Double> person = new HashMap<>();

    //main
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome! \n Please sign in...");

        /* HashMap = <key, value >
        adding to HashMap
         */
        person.put("Steve", 45.00);
        person.put("Lisa", 85.00);
        person.put("Gary", 145.00);
        person.put("Raymond", 120.00);


        // setting String labeled account to scanner

        String account = scanner.nextLine();

        /* waiting for input must contain valid key entry
        ... printing welcome message
         */

        if (person.containsKey(account)) {
            System.out.println("Hello, " + account);
        }
        /* asking to create new account
        ... waiting for input
            setting String labeled newAccount to scanner
            adding newAccount to HashMap
          */
        else {
            System.out.println("No account found. \nIf Would yo  u like to make a new account, please enter your name.");
            String newAccount = scanner.nextLine();
            System.out.println("Hello, " + newAccount);
            person.put(newAccount, 100.00);
        }
        /*
        Showing screen listing three options
        looping options until user cancels
        HashMap should keep previously-set values when it loops
         */

        }

        }




    }
}

