package org.example;
import java.util.Objects;
import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int r = 0;

        System.out.print("Type a number: ");
        int a = reader.nextInt();
        r = (int)Math.pow(2, a+1)-1;
        System.out.println("The result is " + r);
    }
}