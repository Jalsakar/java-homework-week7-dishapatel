package homework_week_7;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class Programme20_FindSpecificValueInArray {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int toFind = 50;
        boolean found = false;
        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(toFind + " is found.");
        } else {
            System.out.println(toFind + " is not found.");
        }
    }
}