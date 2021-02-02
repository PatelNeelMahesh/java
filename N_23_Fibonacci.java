package com.company;

public class N_23_Fibonacci {


    public static void main(String[] args) {

        int num1=0, num2=1, num3, iterate, sum=num1+num2, count = 10;

        System.out.print(num1+" "+num2);

        for(iterate=2;iterate<count;iterate++)
        {
            num3 = num1+num2;
            System.out.print(" "+num3);
            sum = sum+num3;
            num1 = num2;
            num2 = num3;
        }
        System.out.println();
        System.out.println("Sum:" +sum);
    }
}
