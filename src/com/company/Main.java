package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Given today's day of the week and some number of days in the future, this
                program will tell you the day of the week for the future day. Enter today's day of the
                week (0 for Sunday, 1 for Monday, etc):\s""");
        int userDay = sc.nextInt();

        if (userDay > 6){
            System.out.println("Input is too high. Please enter a number between 0 and 6.\nTerminating program...\nGoodbye.");
            System.exit(0);
        }
        if (userDay < 0){
            System.out.println(userDay + " is invalid. Please enter a positive number.\nTerminating program...\nGoodbye.");
            System.exit(0);
        }

        System.out.println("Enter the number of days in the future: ");
        int futureDays = sc.nextInt();

        if (futureDays < 0){
            System.out.println(userDay + " is invalid. Please enter a positive number.\nTerminating program...\nGoodbye.");
            System.exit(0);
        }

        // Translates the number value the user gave for the day into a string for the day of the week.
        String currentDay = null;
        switch (userDay) {
            case 0 -> currentDay = "Sunday";
            case 1 -> currentDay = "Monday";
            case 2 -> currentDay = "Tuesday";
            case 3 -> currentDay = "Wednesday";
            case 4 -> currentDay = "Thursday";
            case 5 -> currentDay = "Friday";
            case 6 -> currentDay = "Saturday";
            default -> {
                System.out.println("Error occurred. Terminating program...\nGoodbye.");
                System.exit(0);
            }
        }

        // Calculates number of days and stores result
        int nextDay = (userDay + futureDays) % 7;

        // Translates the stored result integer into a string that corresponds to the proper day of the week.
        String dayName = null;
        switch (nextDay) {
            case 0 -> dayName = "Sunday";
            case 1 -> dayName = "Monday";
            case 2 -> dayName = "Tuesday";
            case 3 -> dayName = "Wednesday";
            case 4 -> dayName = "Thursday";
            case 5 -> dayName = "Friday";
            case 6 -> dayName = "Saturday";
            default -> {
                System.out.println("Error occurred. Terminating Program...\nGoodbye.");
                System.exit(0);
            }
        }
        System.out.println("Today is " + currentDay + " and the future day is " + dayName + ".\nGoodbye.");
    }
}
