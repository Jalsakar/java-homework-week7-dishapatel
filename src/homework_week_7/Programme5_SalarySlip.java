package homework_week_7;
/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 */

import java.util.Scanner;

public class Programme5_SalarySlip {
    public static void main(String[] args) {
        int empID;
        String empName;
        double basicSalary, HRA, TA, DA, PF, GrossSalary;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id : ");
        empID = sc.nextInt();
        System.out.println("Enter Employee Name : ");
        empName = sc.next();
        System.out.println("Enter Basic Salary : ");
        basicSalary = sc.nextDouble();

        sc.close();

        HRA = 0.10 * basicSalary;
        TA = 0.08 * basicSalary;
        DA = 0.09 * basicSalary;
        PF = 0.20 * basicSalary;
        GrossSalary = basicSalary + HRA + TA + DA - PF;

        System.out.println("|----------------------------------------------------|");
        System.out.println("|                 Salary Slip                        |");
        System.out.println("|----------------------------------------------------|");
        System.out.println("|  Employee ID                :       " + empID + "           |");
        System.out.println("|  Employee Name              :       " + empName + "            |");
        System.out.println("|----------------------------------------------------|");
        System.out.println("|  Basic Salary               :      " + basicSalary + "         |");
        System.out.println("|  HRA 10 %                   :      " + HRA + "          |");
        System.out.println("|  TA  8  %                   :      " + TA + "          |");
        System.out.println("|  DA  9  %                   :      " + DA + "          |");
        System.out.println("|  PF 20  &                   :      " + PF + "          |");
        System.out.println("|----------------------------------------------------|");
        System.out.println("|  Gross Salary               :      " + GrossSalary + "         |");
        System.out.println("|====================================================|");
    }
}