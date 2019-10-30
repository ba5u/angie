package chapter4;

import javax.swing.*;
import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        //what we know
        int rate = 15;
        int maxHours =40;
        //get what we don't
        System.out.println("How many hours did you worked this week ");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //validate input
        while (hoursWorked>maxHours|| hoursWorked <1 ){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again");
            hoursWorked =scanner.nextDouble();
        }
        scanner.close();
        //calculate the gross
        double gross = rate * hoursWorked;
        System.out.println("Gross pay: $ "+ gross);

        }
    }
