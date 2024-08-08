/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.warrunnergame;


import java.util.Scanner;

public class WarRunnerGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter password with minimum length 7, Password with at least one uppercase, one special character");

        System.out.print("Enter Player 1 name: ");
        String playerName1 = scanner.nextLine();

        String password;
        boolean isValidPassword = false;

        while (!isValidPassword) {
            System.out.print("Enter Password: ");
            password = scanner.next();

            if (checkLength(password) && checkUpper(password) && checkSpecial(password)) {
                System.out.println("Valid Password");
                isValidPassword = true; // Exit the loop if the password is valid
            } else {
                System.out.println("Invalid Password. Please enter a valid password.");
            }
        }

        int maxRounds = 26; // Set the desired number of rounds here
        WarGame warGame = new WarGame(playerName1);
        warGame.playGame(maxRounds);
    }

    public static boolean checkLength(String password) {
        return password.length() > 7;
    }

    public static boolean checkUpper(String password) {
        for (char letter : password.toCharArray()) {
            if (Character.isUpperCase(letter)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkSpecial(String password) {
        for (char letter : password.toCharArray()) {
            if (!Character.isLetterOrDigit(letter)) {
                return true;
            }
        }
        return false;
    }
}


