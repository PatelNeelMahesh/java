package com.company;

public class N_18_ArrayPractice04 {
    public static void main(String[] args) {
        int [] arr = {21,5,4,75,65,-84,-775,121};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int element:arr)
        {
            if(element>max)
            {
                max=element;
            }
        }
        for(int element_min:arr)
        {
            if(element_min<min)
            {
                min=element_min;
            }
        }

        System.out.println("Maximum element of the array is: "+ max);
        System.out.println("Minimum element of the arra is: "+ min);

    }
}
