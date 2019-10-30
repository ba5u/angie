package chapter4;

import java.util.Scanner;

public class Cshier1 {
    public static void main(String[] args) {
//get number of items to scan
        System.out.println("Enter the numbers of items you would like to scan");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
       // scanner.close();

        double total =0;
        //create a loop to iterate through all of the items and acuumulate the costs
        for(int i=0 ; i<quantity; i++){
            System.out.println("Please enter the value of the item");
            double price = scanner.nextDouble();
            total=total+price;
        }
        scanner.close();
        System.out.println("The total value of the product is: " +total);
    }
}
