package com.company;

public class N_21_Varargs {

    static int addition(int num1,int ...arr)
    {
        // it will be as int [] arr;
        int sum = 0;
        for(int num: arr)
        {
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Varargs: ");
        System.out.println("It will take at least "+ addition(1) +" argument.");
        System.out.println("Addition of 2 & 4 is: "+ addition(2,4) );
        System.out.println("Addition of 5, 4 & 6 is: " + addition(5,4,6));

    }
}
