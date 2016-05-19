package io.veronicacrowe;

import java.util.Scanner;

/**
 * Created by veronicacrowe on 5/19/16.
 */
public class NumberSums {
    int sum = 0;


    public void askForNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a whole number (i.e. 4, 56, 75):");
        int userGuess = sc.nextInt();
        for (int i = 1; i <= userGuess; i++) {
            for (int j = 1; j <= i; j++) {
                sum = sum + j;
            }

        }
        System.out.println("The sum of your number is " + sum);
    }
}





