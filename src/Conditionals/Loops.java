package Conditionals;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        double total = 0, percentage;
        String grade;

        System.out.println("Enter 5 subject marks (0-100):");

        for (int i = 0; i < 5; i++) {

            while (true) {
                marks[i] = sc.nextInt();

                if (marks[i] >= 0 && marks[i] <= 100) {
                    break; // valid mark → exit while loop
                } else {
                    System.out.println("Invalid marks! Enter again:");
                }
            }

            total += marks[i];
        }

        percentage = (total / 500) * 100;

        if (percentage >= 75)
            grade = "A";
        else if (percentage >= 50)
            grade = "B";
        else if (percentage >= 30)
            grade = "C";
        else
            grade = "Fail";

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}
