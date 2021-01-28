package com.company;

public class N_14_Arrays {
    public static void main(String[] neel) {

        // There are three main ways to create an array in Java
        // 1. Declaration and memory allocation
        // int [] marks = new int[3];

        // 2. Declaration and then memory allocation
        // int [] marks;
        // marks = new int[3];
        // Initialization
        // marks[0] = 26;
        // marks[1] = 01;
        // marks[2] = 21;


        // 3. Declaration, memory allocation and initialization together
        //int [] marks = {21, 04, 20};

        int [] age = new int[10];
        char[] section = {'A','B','C'};
        String[] name = new String[10];
        name = new String[] {"patel","neel","mahesh"};

        age = new int[]{1, 2, 3};


        for(int i=0; i<3; i++)
        {
            System.out.print(age[i]);
            System.out.print('_'+name[i]);
            System.out.print("_"+section[i]);
            System.out.println();
        }
    }
}
