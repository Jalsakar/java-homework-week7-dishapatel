package homework_week_7;
/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */

import java.util.Scanner;

public class Programme16_Number_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double number = sc.nextDouble();
        if (number > 0) {
            System.out.println(number + "is POSITIVE number.");
        } else if (number < 0) {
            System.out.println(number + "is NEGATIVE number.");
        } else {
            System.out.println("This is Zero number.");
        }
        sc.close();
    }
}