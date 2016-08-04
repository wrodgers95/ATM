package com.theironyard.charlotte;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

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
        if (person.containsKey(account));{
            System.out.println("Hello, " + account + " \n Choose an option...");
        }

        System.out.println("[1] Check Balance \n[2] Withdraw \n[3] Cancel");

        String option = scanner.nextLine();
        if (option == "1") {
            System.out.println("Your balance is 100.00");
        }





        // Choosing options

    }
}
