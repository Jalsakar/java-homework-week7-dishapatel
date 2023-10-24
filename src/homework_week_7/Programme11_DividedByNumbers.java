package homework_week_7;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */
public class Programme11_DividedByNumbers {
    public static void main(String[] args) {
        //Print numbers divided by 3
        System.out.println("List of numbers divided by 3 from 1 to 100 : ");
        for (int n = 1; n < 100; n++) {
            if (n % 3 == 0) System.out.println(n);
        }
        System.out.println("================================================================");
        // Print numbers divided by 5
        System.out.println("List of numbers divided by 5 from 1 to 100 : ");
        for (int n = 1; n < 100; n++) {
            if (n % 5 == 0) System.out.println(n);
        }
    }
}