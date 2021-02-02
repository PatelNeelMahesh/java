package com.company;

public class N_24_MethodsPractice01 {

    static void pattern(int num)
    {
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern(5);
    }
}
