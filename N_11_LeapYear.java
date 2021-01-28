package com.company;
import java.util.Scanner;

public class N_11_LeapYear {
    public static void main(String[] args) {

        Scanner var = new Scanner(System.in);
        System.out.print("Enter Year: ");

        int year = var.nextInt();

        if((year%4==0 && year%100!=0) || year%400==0)
        {
            System.out.println(year +" is a Leap Year.");
        }
        else
        {
            System.out.println(year +  " is not a Leap Year.");
        }

    }
}
