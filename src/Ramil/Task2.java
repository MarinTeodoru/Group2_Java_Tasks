package Ramil;

/*
    QUESTION 2- Write a function which prints out the numbers from 1 to 30 but
    for numbers which are a multiple of 3, print "FIN" instead of the number
    and for numbers which are a multiple of 5, print "RA" instead of the number.
    for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */


public class Task2 {
    public static void main(String[] args) {
        printFinra();
    }

    public static void printFinra() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
            /* New QUESTION: Write a Java method that prints the numbers from 1 to 20.
            If the number is divisible by 2, print "A". If the number is
            divisible by 3, print "B". If the number is divisible by both 2 and 3, print "AB".
             Otherwise, print the number itself.*/

            int num = 20;
            for (int j = 1; j <= num; j++) {
                if (j % 2 == 0 && j % 3 == 0) {
                    System.out.println(j + "AB");
                } else if (j % 2 == 0) {
                    System.out.println(j + "A");
                } else if (j % 3 == 0) {
                    System.out.println(j + "B");
                } else {
                    System.out.println(j);
                }

            }

        }
    }
}


