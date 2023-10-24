package homework_week_7;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
// Main class
public class Programme1_OddOrEven_TernaryOperator {
    //Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Create an object of scanner class
        System.out.println("Enter a number : ");// Ask user to initialize the number
        int num = sc.nextInt();// Declare a variable to store the number
        String oddOrEven = (num % 2 == 0) ? "odd number." : "even number.";//Use ternary operator to check whether the entered number is even or odd
        System.out.println(num + " is " + oddOrEven);// Display the output in console
        sc.close();// closing scanner
    }
}// Run the program