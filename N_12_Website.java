package com.company;
import java.util.Scanner;

public class N_12_Website {
    public static void main(String[] neel) {

        Scanner var = new Scanner(System.in);
        System.out.println("Enter the website:");
        String website = var.next();

        if(website.endsWith(".com"))
        {
            System.out.println("This is a Commercial website.");
        }
        else if(website.endsWith(".org"))
        {
            System.out.println("This is an Organizational website.");
        }
        else if(website.endsWith(".in"))
        {
            System.out.println("This is an Indian website.");
        }
    }
}
