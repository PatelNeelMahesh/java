package com.company;

public class N_19_Methods {

    static int addition(int num1, int num2){
        int num3 = num1+num2;
        return num3;
    }

    int subtraction(int num1, int num2){
        int num3 = num1-num2;
        return num3;
    }

    public static void main(String[] args) {
        int NumOne = 50;
        int NumTwo = 20;

        int NumThree = addition(NumOne,NumTwo);
        System.out.println("Addition : "+ NumThree);

        //Method invocation using Object Creation
        N_19_Methods obj = new N_19_Methods();

        int NumFour = obj.subtraction(NumOne,NumTwo);
        System.out.println("Subtraction : " + NumFour);
    }
}
