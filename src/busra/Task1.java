package busra;

/*
     QUESTION 1 -Numbers  ---Odd & Even
      Write a method which can identify if a given number odd or even

      Ex:
      identify(5) -->"Odd"
      identify (6) --> "Even"
     */

public class Task1 {
    public static void main(String[] args) {

        int num = 3;

        if (num % 2 == 0){
            System.out.println("Odd");
        }else {
            System.out.println("Even");
        }


    }
}
