package com.company;

public class N_20_Method_Overloading {

    static void Num() //void : return type
    {
        System.out.println("Good evening...");
    }

    static void Num(int num1) //parameters
    {
        System.out.println("Num is : " + num1);
    }
    static void Num(float num1) //parameters
    {
        System.out.println("Num is : " + num1);
    }

    public static void main(String[] args) {
        Num();
        Num(1);
        Num(5.5f);
        //Arguments are actual!
    }
}
