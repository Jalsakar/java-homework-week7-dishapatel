package homework_week_7;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol(using if else)
 */
public class Programme10_Operator_Symbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter Second number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter the Operator you want(+,-,*,/) : ");
        char op = sc.next().charAt(0);
        operator(op, n1, n2);
        sc.close();
    }

    public static void operator(char op, int n1, int n2) {
        if (op == '+') {
            System.out.println("Addition of " + n1 + " + " + n2 + " = " + (n1 + n2));
        } else if (op == '-') {
            System.out.println("Subtraction of " + n1 + "-" + n2 + " = " + (n1 - n2));
        } else if (op == '*') {
            System.out.println("Multiplication of " + n1 + "X" + n2 + " = " + (n1 * n2));
        } else if (op == '/') {
            System.out.println("Division of " + n1 + "/" + n2 + " = " + (n1 / n2));
        } else {
            System.out.println("Operator is not available.");
        }
    }
}