package homework_week_7;
/**
 * Same as above program-8 using switch statement
 */

import java.util.Scanner;

public class Programme9_CityName_Switch_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first alphabet of any city : ");
        char city = sc.next().charAt(0);
        sc.close();
    }

    public static void switchStatement(char city) {
        switch (city) {
            case 'A':
            case 'a':
                System.out.println("City : Acton");
                break;
            case 'B':
            case 'b':
                System.out.println("City : Barking");
                break;
            case 'C':
            case 'c':
                System.out.println("City : Chelsea");
                break;
            case 'D':
            case 'd':
                System.out.println("City : Dalston");
                break;
            case 'E':
            case 'e':
                System.out.println("City : Edmonton");
                break;
            case 'F':
            case 'f':
                System.out.println("City : Fulham");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
