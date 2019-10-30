package chapter4;

import javax.swing.*;
import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        boolean again = false;
        do{
            System.out.println("Please enter the first number");
            Scanner scanner = new Scanner(System.in);
            double firstNumber= scanner.nextDouble();
            System.out.println("Please enter the second number");
            double secondNumber = scanner.nextDouble();
            double sum =firstNumber+secondNumber;
            System.out.println("The sum of the 2 numbers is: " + sum);
            System.out.println("Do you want to continue? Please enter Y or press any key if you don't");
            String yn = scanner.next();
            scanner.close();
            if (yn .equals("Y")) {again =true;

            }
           else again =false;
        }while (again);

    }
}
