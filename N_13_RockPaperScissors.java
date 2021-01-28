package com.company;
import java.util.Scanner;
import java.util.Random;

public class N_13_RockPaperScissors {
    public static void main(String[] neel) {
        Random rand = new Random();
        Scanner var = new Scanner(System.in);

        System.out.println("Select any one of the following options: ");
        System.out.println("0.Rock");
        System.out.println("1.Paper");
        System.out.println("2.Scissors");

        int move = var.nextInt();
        int ans = rand.nextInt(3);

        System.out.printf("Player's move: %d \n",move);
        System.out.printf("Computer's move: %d\n",ans);

        if(move == ans)
        {
            System.out.println("It's a tie!");
        }
        else if(move==0 && ans==2 )
        {
            System.out.println("Player Wins.");
        }
        else if(move==0 && ans==1 )
        {
            System.out.println("Computer Wins.");
        }
        else if(move==1 && ans==0 )
        {
            System.out.println("Player Wins.");
        }
        else if(move==1 && ans==2 )
        {
            System.out.println("Computer Wins.");
        }
        else if(move==2 && ans==1 )
        {
            System.out.println("Player Wins.");
        }
        else if(move==2 && ans==0 )
        {
            System.out.println("Computer Wins.");
        }
        else
        {
            System.out.println("Try again.");
        }
    }
}
