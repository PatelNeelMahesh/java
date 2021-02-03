package com.company;
import java.util.Scanner;
import java.util.Random;


/*
    Create a class Game, which allows a user to play
    "Guess the Number" game once. Game should have the
    following methods:

    1. Constructor to generate the random number
    2. takeUserInput() to take a user input of number
    3. isCorrectNumber() to detect whether the number entered by the user is true
    4. getter and setter for noOfGuesses

    use properties such as noOfGuesses(int), etc to get this task done!

*/
class GuessTheNumber
{
    int r_number;
    int u_number;

    public GuessTheNumber()
    {
        Random rand = new Random();
        r_number = rand.nextInt(100);
    }

    public void takeUserInput()
    {
        System.out.println("Enter a number:");
        Scanner var = new Scanner(System.in);
        u_number = var.nextInt();
    }

    public void isCorrect()
    {
        if(r_number==u_number){
            System.out.println("Correct Guess.");
        }
        else if(r_number<u_number){
            System.out.println("Entered Number is bigger.");
        }
        else{
            System.out.println("Entered Number is smaller.");
        }
    }
}

public class N_27_GuessTheNumber {
    public static void main(String[] args) {

        GuessTheNumber num = new GuessTheNumber();

        num.takeUserInput();
        num.isCorrect();
        System.out.printf("Random number is %d and you entered %d.",num.r_number,num.u_number);
    }
}
