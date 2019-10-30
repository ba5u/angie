package chapter3;

import java.util.Scanner;

public class DollarGame {
    public static void main(String[] args) {
        double pennies =0.01;
        double nickels =0.05;
        double dimes =0.10;
        double quarters= 0.25;
        System.out.println("Please enter how many pennies");
        Scanner scanner = new Scanner(System.in);
        double howmanypennies = scanner.nextDouble();
        System.out.println("Please enter how many nickels");
        double howmanynickels= scanner.nextDouble();
        System.out.println("Please enter how many dimes");
        double howmanydimes=scanner.nextDouble();
        System.out.println("Please enter how many quarters");
        double howmanyquarters=scanner.nextDouble();

        double total= pennies* howmanypennies + nickels* howmanynickels + dimes *howmanydimes + quarters*howmanyquarters;
        if (total<1 ) {
            System.out.println("You are less than 1 with " + (1 - total));
        }else if (total>1 ){
                System.out.println("You exceed 1 with "+  (total-1 ));
            }
            else System.out.println("Congrats");
        }
    }


