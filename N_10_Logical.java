package com.company;

public class N_10_Logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        System.out.println("For AND...");
        if(a && b)
        {
            System.out.println("1. A and B both are \"true\" ");
        }
        else if(a && c)
        {
            System.out.println("2. A and C both are \"true\" ");
        }

        System.out.println("For OR...");
        if(a || b)
        {
            System.out.println("1. One of them is true.");
        }
        else
        {
            System.out.println("2. Both of them are false.");
        }

        System.out.println("For NOT...");

        System.out.print("not(A) is: ");
        System.out.println(!a);

        System.out.print("bot(B) is: ");
        System.out.println(!b);
    }
}
