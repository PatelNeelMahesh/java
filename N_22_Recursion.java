package com.company;
import java.util.Scanner;

public class N_22_Recursion {

    static int factorial(int num)
    {
        //factorial(n) = n*(n-1)*...*1
        //return num;

        if(num==0 || num==1)
        {
            return 1;
        }

        else
        {
          return num * factorial(num-1);
        }
    }

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter a number to find it's factorial.");
        int number = var.nextInt();
        System.out.println("Factorial of number "+ number + " is: "+factorial(number));
    }

}
