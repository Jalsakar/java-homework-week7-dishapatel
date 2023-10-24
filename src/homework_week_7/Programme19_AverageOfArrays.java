package homework_week_7;

import java.util.Scanner;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Programme19_AverageOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of elements : ");// Reading total no. of elements
        int number = sc.nextInt();
        int[] myArray = new int[number];//creating an array
        System.out.println("Enter the elements of array one by one : ");
        for (int i = 0; i < number; i++) {
            myArray[i] = sc.nextInt();
        }
        double average = 0;
        for (int i = 0; i < number; i++) {
            average = average + myArray[i];
        }
        average = average / number;
        System.out.println("Average of given numbers of elements : " + average);
        sc.close();
    }
}
