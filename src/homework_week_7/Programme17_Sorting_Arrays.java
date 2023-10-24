package homework_week_7;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Programme17_Sorting_Arrays {
    public static void main(String[] args) {
        int[] numeric_array = {20, 50, 80, 40, 60, 30, 70, 10, 100, 90};
        System.out.println("Original numeric array : " + Arrays.toString(numeric_array));
        Arrays.sort(numeric_array);
        System.out.println("Sorted numeric array in ascending order: " + Arrays.toString(numeric_array));
        System.out.println("==================================================================================");
        String[] string_array = {"Rose", "Lily", "Tulip", "Orchid", "Jasmin", "Daffodil", "Lavender"};
        System.out.println("Original string array : " + Arrays.toString(string_array));
        Arrays.sort(string_array);
        System.out.println("Sorted string array in alphabetical order : " + Arrays.toString(string_array));
    }
}