package Faizan;

public class Task1 {

    public static void main(String[] args) {
        int num = 12;

        for(int i = 0; i <= num; i++)
        if(i %2 == 0){
            System.out.println("identify(" + i +") -->    Even");
        }
        else {
            System.out.println("identify(" + i +") -->    Odd");
        }
    }

}
/*
     QUESTION 1 -Numbers  ---Odd & Even
      Write a method which can identify if a given number odd or even

      Ex:
      identify(5) -->"Odd"
      identify (6) --> "Even"
     */