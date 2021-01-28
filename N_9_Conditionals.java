package com.company;
import java.util.Scanner;

public class N_9_Conditionals {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your name: ");
        String name = sc.next();

        if(age>=18){
            System.out.println(name+" you can drive.");
        }
        else{
            System.out.println(name+" you can't drive.");
        }
    }
}
