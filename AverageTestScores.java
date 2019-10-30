package chapter4;

import java.util.Scanner;

//nested Loops
public class AverageTestScores {
    public static void main(String[] args) {
        //itinialize what we know
        int numbersOfStudents = 24;
        int numberOfTests = 4;

        //Process all students
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<numbersOfStudents; i++){
            double total=0;
            for( int j=0; j<numberOfTests; j++){
                System.out.println("Please enter the score for Test # " + (j+1));
                double score =scanner.nextDouble();
            total=total+ score;

            }
            double average = total/numberOfTests;
            System.out.println("The test average for student # "+(i+1) + " is " + average);
        }
        scanner.close();
    }
}
