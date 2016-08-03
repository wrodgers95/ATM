package com.theironyard.charlotte;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static User User = new User();




    public static void main(String[] args) throws Exception {
    System.out.println("Welcome!");
    User.chooseName();
    User.chooseOption();
//    User.chooseAmount();

    }
}
