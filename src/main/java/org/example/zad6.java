package org.example;
import java.util.Objects;
import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many times do you want to print the \"Text\"?");
        int m = reader.nextInt();

        for(int i=0;i<m;i++){
            printText();
        }
    }

    public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}