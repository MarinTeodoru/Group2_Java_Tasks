package teodoru;

/*
    QUESTION 2- Write a function which prints out the numbers from 1 to 30 but
    for numbers which are a multiple of 3, print "FIN" instead of the number
    and for numbers which are a multiple of 5, print "RA" instead of the number.
    for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input;

        // Ask the user for input between 1 and 30
        while (true) {

            System.out.print("Enter a number between 1 and 30: ");

            input = scanner.nextInt();

            System.out.println("You entered: " + input);


            if (input >= 1 && input <= 30) {
                break; // if the statement it's true it will exit the loop and continue executing the code (if the input it's between 1 and 30)
            } else {
                System.err.println(input + ": INVALID INPUT! PLEASE ENTER A NUMBER BETWEEN 1 AND 30."); // will be executed if the statement it's false

            }
        }

        printFinRa(input);

        scanner.close();
    }
                    /* The loop will iterate from 1 to the maximum number entered by user
                         For each number will check if the given conditions are true
                    */

    public static void printFinRa(int max) {
        for (int i = 1; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {    // Checks if the number is divisible by both 3 and 5 ( Will print "FINRA" )
                System.out.println("FINRA");
            } else if (i % 3 == 0) {           // If the number it's divisible by 3 ( Will print "FIN" )
                System.out.println("FIN");
            } else if (i % 5 == 0) {           // If the number it's divisible by 5, (Will print "RA")
                System.out.println("RA");
            } else {
                System.out.println(i);         // If all the conditions are false will print the number itself.
            }
        }


    }
}


