package chapter3;

import java.util.Scanner;

//Logical operators
public class LogicalOperatorLoanQualifier {
    public static void main(String args[]) {
        // what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;
        //get
        System.out.println("Please enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        System.out.println("Please enter the number of  years with your current emplyer");
        double years = scanner.nextDouble();
        scanner.close();

        //Make decision
        if (salary >= requiredSalary && years >= requiredYearsEmployed) {
            System.out.println("Congrats, you qualify for the loan");
        } else System.out.println("Sorry, you must earn at least " + requiredSalary + " to qualify for the loan");


    }
}
