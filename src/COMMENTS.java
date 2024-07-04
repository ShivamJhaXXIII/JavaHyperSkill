/**

        * This Java program demonstrates the calculation of the sum of two numbers.
        * It includes a method to calculate the sum and a main method to showcase its usage.

        */

public class COMMENTS {
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        /*Declare and initialize two numbers
        Them call the calculateSum method to get the result*/

        int number1 = 5;
        int number2 = 10;
        int result = calculateSum(number1, number2);


       // Print the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + result);
    }
}