package com.company;
import java.util.Scanner;

public class Percentage {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks : ");

        System.out.println("Subject 1: ");
        int subOne = sc.nextInt();

        System.out.println("Subject 2: ");
        int subTwo = sc.nextInt();

        System.out.println("Subject 3: ");
        int subThree = sc.nextInt();

        System.out.println("Subject 4: ");
        int subFour = sc.nextInt();

        System.out.println("Subject 5: ");
        int subFive = sc.nextInt();

        int totalMarks = subOne + subTwo + subThree + subFour + subFive ;

        float studentPercentage = totalMarks/5;

        System.out.println("Total marks out of 500 : ");
        System.out.println(totalMarks);

        System.out.println("Student's Percentage :");
        System.out.println(studentPercentage);
    }
}
