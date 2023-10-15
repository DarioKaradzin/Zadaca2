package org.example;
import java.util.Objects;
import java.util.Scanner;


public class zad3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int zbir = 0;

        while(true){
            int read = Integer.parseInt(reader.nextLine());

            if(read==0){
                break;
            }
            zbir = zbir + read;

            System.out.println("Sum: " + zbir);
        }

        System.out.println("Sum in the end: " + zbir);
    }
}