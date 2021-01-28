package com.company;
import java.util.Scanner;

public class N_02_TakingInput {
    public static void main(String[] args)
    {
        Scanner var = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = var.nextInt();

        System.out.print("Enter num2: ");
        int num2 = var.nextInt();

        System.out.println("Enter your name: ");
        String name = var.next();
        System.out.println(name);

        int total = num1+num2;

        System.out.print("Total of num1 & num2 is : ");

        System.out.println(total);

    }
}
