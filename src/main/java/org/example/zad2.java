package org.example;
import java.util.Objects;
import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int zbir = 0;

        System.out.print("Type the first number: ");
        zbir = zbir + Integer.parseInt(reader.nextLine());
        System.out.print("Type the second number: ");
        zbir = zbir + Integer.parseInt(reader.nextLine());
        System.out.print("Type the third number: ");
        zbir = zbir + Integer.parseInt(reader.nextLine());

        System.out.println("Sum: " + zbir);
    }
}