package org.example;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class zad10 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Random rand = new Random();
        int n = rand.nextInt(101);

        int G = 0;
        int X = 0;

        while(true){
            System.out.print("Guess the number:");
            G = reader.nextInt();

            if(G>n) {
                X+=1;
                System.out.println("The number is lesser, guesses made : " + X);
            }
            else if (G<n) {
                X+=1;
                System.out.println("The number is greater, guesses made : " + X);
            }
            else {
                System.out.println("Congratulations, Your guess is correct!");
                break;
            }
        }
    }
}