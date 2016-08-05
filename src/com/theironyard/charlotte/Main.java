package com.theironyard.charlotte;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    private static HashMap<String, Double> person = new HashMap<>();


    public static void main(String[] args) throws Exception {
        System.out.println("Welcome! \n Please sign in...");

        // HashMap = <key, value >
        person.put("Steve", 45.00);
        person.put("Lisa", 85.00);
        person.put("Gary", 145.00);
        person.put("Raymond", 120.00);


        // setting scanner to String account

        String account = scanner.nextLine();

        // waiting for in. must contain valid key

        if (person.containsKey(account)) {
            System.out.println("Hello, " + account);
        }
        // asking to create new account
        else {
            System.out.println("No account found. \nIf Would yo  u like to make a new account, please enter your name.");
            String newAccount = scanner.nextLine();
            System.out.println("Hello, " + newAccount);
            person.put(newAccount, 100.00);
        }



    }
}

