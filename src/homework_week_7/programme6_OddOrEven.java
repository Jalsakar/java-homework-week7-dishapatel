package homework_week_7;
/**
 * Write a java program to input any number and find out if it’s odd or even.
 */

import java.util.Scanner;

public class programme6_OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Create an object of scanner class
        System.out.println("Enter a number : ");// Ask user to initialize the number
        int num = sc.nextInt();// Declare a variable to store the number
        // If user entered number is divisible by 2, then it is an even number else it is an odd number
        if (num % 2 == 0) {
            System.out.println(num + " is even number. ");
        } else {
            System.out.println(num + " is odd number. ");
        }
        sc.close();// Close the scanner
    }
}//Run the program