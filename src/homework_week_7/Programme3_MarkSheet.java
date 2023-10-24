package homework_week_7;
/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format.
 */

import java.util.Scanner;

//Main class
public class Programme3_MarkSheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String studentName = sc.nextLine();
        System.out.println("Roll Number: ");
        int rollNumber = sc.nextInt();
        System.out.println("Maths:   ");
        double maths = sc.nextDouble();
        System.out.println("Science: ");
        double science = sc.nextDouble();
        System.out.println("English: ");
        double english = sc.nextDouble();
        if (maths < 0 || maths > 100 || science < 0 || science > 100 || english < 0 || english > 100) {
            System.out.println("Invalid input, Marks should between 0 to 100");
        }
        double totalMarks = maths + science + english;
        double percentage = (totalMarks / 300) * 100;

        System.out.println("Percentage" + percentage);
        String result = (percentage >= 35 && maths >= 35 && science >= 35 && english >= 35) ? "Pass" : "Fail";
        String grade = " ";
        if (percentage <= 100 && percentage >= 80) {
            grade = "A+";
        } else if (percentage <= 80 && percentage >= 60) {
            grade = "A";
        } else if (percentage <= 60 && percentage >= 50) {
            grade = "B";
        } else if (percentage <= 50 && percentage >= 35) {
            grade = "C";
        }
        sc.close();

        System.out.println("|-----------------------------------------------|");
        System.out.println("|            MARK SHEET                         |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|   Name           :  " + studentName + "                       |");
        System.out.println("|   Roll Number    :  " + rollNumber + "                         |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|   Subjects       :           Marks            |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|   Maths          :       " + maths + "                 |");
        System.out.println("|   Science        :      " + science + "                  |");
        System.out.println("|   English        :      " + english + "                  |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|    Total         :     " + totalMarks + "                  |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|   Percentage     :    " + percentage + "                    |");
        System.out.println("|   Result         :     " + result + "                   |");
        System.out.println("|   Grade          :      " + grade + "                    |");
        System.out.println("|-----------------------------------------------|");
    }
}