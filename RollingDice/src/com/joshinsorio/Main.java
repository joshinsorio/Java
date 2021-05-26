package com.joshinsorio;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Initialize variables
	    Random rollValue = new Random();
	    Scanner scanner = new Scanner(System.in);

	    //Prompt user value of # of desired dice rolls
	    System.out.print("How many times would you like to roll?: ");
        int times = scanner.nextInt();

        //For loop to iterate # of times
        for(int i = 0; i < times; i++){
            int finValue = rollValue.nextInt(6) + 1;
            System.out.println("The value of your roll is: " + finValue + "!");
        }
    }
}
