package Ramil;

/*
     QUESTION 1 -Numbers  ---Odd & Even
      Write a method which can identify if a given number odd or even
      Ex:
      identify(5) -->"Odd"
      identify (6) --> "Even"
     */
public class Task1 {
    public static void main(String[] args) {
        OddOrEven(50);
    }

    public static void OddOrEven(int number) {
        if (number % 2 != 0) {
            System.out.println("Identify (" + number + ") ---> Odd");
        } else {
            System.out.println("Identify (" + number + ") ---> Even");
        }
    }
}
