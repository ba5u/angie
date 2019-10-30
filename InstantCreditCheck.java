package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        //initialize what we know

        //get what we don't know
        //getFormData();

        int creditScore = getCreditScore();
        double salary = getSalary();
        scanner.close();

        //check if user is qualified
        boolean qualified = isUserQualified(creditScore,salary);
        //Notify the user
        notifyUser(qualified);
    }
    public static int getCreditScore(){
        System.out.println("Please enter your salary");
        int creditScore = scanner.nextInt();
        return creditScore;
          }
    public static double getSalary(){
        System.out.println("Enter your credit score");
        double salary = scanner.nextDouble();
        return salary;
    }
    public static boolean isUserQualified(int creditScore, double salary){
        if (creditScore>= requiredCreditScore && salary >= requiredSalary){
        return true;
        }
        else{
            return false;
        }
    }
    public static void notifyUser(boolean isQualified){
        if (isQualified){
            System.out.println("Congrats! You've been aproved");
        }
        else {
            System.out.println("Sorry. You've been declined");
        }
    }
}
