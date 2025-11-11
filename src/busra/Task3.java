package busra;
/*
Numbers - Swap Numbers
Swap two variables values without using a third variable
 */
public class Task3 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 15;
        //Initially, num1 is 10 and num2 is 15.

        num1 = num1 + num2; // num1 becomes 25.
        //Now I subtract the current value of num2 (which is 15) from num1 (which is 25).
        num2 = num1 - num2; // The result is 10, and I assign it to num2,num2 holds the original value of num1.
        //Finally, I subtract the new num2 (which is 10) from num1 (which is 25).
        num1 = num1 - num2; // The result is 15, so num1 now holds the original value of num2.

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);




    }
}
