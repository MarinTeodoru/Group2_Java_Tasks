package teodoru;

/*
     QUESTION 1 -Numbers  ---Odd & Even
      Write a method which can identify if a given number odd or even

      Ex:
      identify(5) -->"Odd"
      identify (6) --> "Even"
     */


public class Task1 {
    public static void main(String[] args) {


        identify(5);
        identify(6);
        identify(157);

    }


    //  The method takes an integer input and doesn’t return anything (void), because it directly prints the result.
    public static void identify(int number) {

        if (number % 2 == 0) {  // If the number it's divisible by 2 with no reminder it's Even, otherwise it's Odd
            System.out.println(number + " = Even");
        } else {
            System.out.println(number + " = Odd");
        }

    }
}


