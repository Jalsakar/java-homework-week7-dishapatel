package homework_week_7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Programme8_CityName_If_Else {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first alphabet of any City Name : ");
        char city = in.next().charAt(0);
        cityName(city);
        in.close();
    }

    public static void cityName(char city) {
        if (city == 'A' || city == 'a') {
            System.out.println("City : Ahmedabad");
        } else if (city == 'B' || city == 'b') {
            System.out.println("City : Bombay");
        } else if (city == 'C' || city == 'c') {
            System.out.println("City : Chennai");
        } else if (city == 'D' || city == 'd') {
            System.out.println("City : Delhi");
        } else if (city == 'E' || city == 'e') {
            System.out.println("City : Eluru");
        } else if (city == 'F' || city == 'f') {
            System.out.println("City : Faridabad");
        } else {
            System.out.println("Invalid Entry");
        }
    }
}