package com.company;

public class N_26_MethodsPractice03 {

    static int fib(int num)
    {
        if(num==1 || num==2)
        {
            return num-1;
        }
        else
        {
            return fib(num-1)+fib(num-2);
        }

    }

    public static void main(String[] args) {
        //print nth term of fibonacci series using recursion.
        int number = 5;
        System.out.println(fib(number));
    }
}
