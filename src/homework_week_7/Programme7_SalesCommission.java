package homework_week_7;
/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

import java.util.Scanner;

public class Programme7_SalesCommission {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sales ID : ");
        int salesID = sc.nextInt();
        System.out.print("Enter Seller's Name : ");
        String sellerName = sc.next();
        System.out.print("Enter Sales Amount : ");
        double salesAmount = sc.nextDouble();
        System.out.print("Enter Basic Salary : ");
        double basicSalary = sc.nextDouble();
        commission(salesAmount);
        sc.close();
    }

    public static void commission(double salesAmount) {
        if (salesAmount >= 50000) {
            System.out.println("Commission : " + salesAmount * 35 / 100);
        } else if (salesAmount >= 30000) {
            System.out.println("Commission : " + salesAmount * 20 / 100);
        } else if (salesAmount >= 20000) {
            System.out.println("Commission : " + salesAmount * 10 / 100);
        } else if (salesAmount >= 10000) {
            System.out.println("Commission : " + salesAmount * 5 / 100);
        } else if (salesAmount < 10000) {
            System.out.println("Commission : " + salesAmount * 2 / 100);
        } else {
            System.out.println("Invalid Input" + salesAmount);
        }
    }
}