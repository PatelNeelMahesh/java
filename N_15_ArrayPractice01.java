package com.company;

public class N_15_ArrayPractice01 {
    public static void main(String[] neel) {

        float [] marks = {10.5f,12.1f,13.5f,10.0f,11.0f};
        float num = 10.01f;

        boolean available = false;

        for(float element:marks)
        {
            if(num==element)
            {
                available = true;
                break;
            }
        }
        if(available)
        {
            System.out.println("The value is available in the array.");
        }
        else
        {
            System.out.println("The value is not available in the array.");
        }
    }
}
