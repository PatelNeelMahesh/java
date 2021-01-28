package com.company;

public class N_16_ArrayPractice02 {
    public static void main(String[] args) {
        float [] marks = {95.2f,98.5f,92.6f,93.4f,91.6f};
        float total = marks.length;
        float sum = 0.f;
        for(float element:marks)
        {
            sum=sum+element;
        }
        float average = sum/total;

        System.out.println("Average marks of the class is: "+ average);
    }
}
