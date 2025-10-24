package Furkan;
/*
     QUESTION 1 -Numbers  ---Odd & Even
      Write a method which can identify if a given number odd or even

      Ex:
      identify(5) -->"Odd"
      identify (6) --> "Even"
     */
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Hello World Furkan");


        int identify = 6;

        if (identify % 2 == 0) {
            System.out.println(identify + " it is even number.");
        } else {
            System.out.println(identify + " it is odd number.");
        }
    }
}

