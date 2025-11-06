package busra;
/*
Numbers - Swap Numbers
Swap two variables values without using a third variable
 */
public class Task3 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 15;

        num1 = num1 + num2; // num1 is 25
        num2 = num1 - num2; // num2 is 10 now (num2 have num1 value )
        num1 = num1 - num2; // num1 is 15 now (num1 have num2 value )

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);




    }
}
