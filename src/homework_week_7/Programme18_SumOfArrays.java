package homework_week_7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a Java program to sum values of an array.
 */
public class Programme18_SumOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required size of the array : ");
        int size = sc.nextInt();
        int myArray[] = new int[size];
        int sum = 0;
        System.out.println("Enter the elements of array one by one : ");
        for (int n = 0; n < size; n++) {
            myArray[n] = sc.nextInt();
            sum = sum + myArray[n];
        }
        System.out.println("Elements of the array are : " + Arrays.toString(myArray));
        System.out.println("Sum of the elements of the array : : " + sum);
        sc.close();
    }
}