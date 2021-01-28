package com.company;
import java.util.Scanner;

public class N_03_Percentage {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks : ");

        System.out.println("Subject 1: ");
        float subOne = sc.nextFloat();

        System.out.println("Subject 2: ");
        float subTwo = sc.nextFloat();

        System.out.println("Subject 3: ");
        float subThree = sc.nextFloat();

        System.out.println("Subject 4: ");
        float subFour = sc.nextFloat();

        System.out.println("Subject 5: ");
        float subFive = sc.nextFloat();

        float totalMarks = subOne + subTwo + subThree + subFour + subFive ;

        float studentPercentage = totalMarks/5.0f;

        System.out.println("Total marks out of 500 : ");
        System.out.println(totalMarks);

        System.out.println("Student's Percentage :");
        System.out.println(studentPercentage);
    }
}
