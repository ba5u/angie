package chapter5;

import javax.print.DocFlavor;
import java.util.Scanner;

//write a method that asks a user for their name, and greets them by name.
public class Greetings {
    public static void main(String[] args) {
      System.out.println("Please enter your name:");
        Scanner scanner= new Scanner(System.in);
        String name = scanner.next();
        greetUse(name);
    }
    public static void greetUse(String name){
        System.out.println("Hi there, " + name);
    }
}
