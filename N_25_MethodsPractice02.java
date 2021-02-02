package com.company;

public class N_25_MethodsPractice02 {

    //sum of first n natural numbers.
    static int recSum(int num)
    {
        if(num==1)
        {
            return 1;
        }
        else
        {
            return num+recSum(num-1);
        }
    }

    public static void main(String[] args) {
        int number = 10;
        System.out.printf("Sum of first %d natural number is : %d.",number,recSum(number));

    }
}
