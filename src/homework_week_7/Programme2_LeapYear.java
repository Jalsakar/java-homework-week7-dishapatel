package homework_week_7;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */
// Main class
public class Programme2_LeapYear {
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Create an object of scanner class
        System.out.println("Enter a year : ");//Ask user to initialize the year
        int year = sc.nextInt();//Declare a variable to store the number
        //Use if-else statement to divide year by 4, not by 100, or divide by 400
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }//Display the output in console
        sc.close();//closing scanner
    }
}//Run the program