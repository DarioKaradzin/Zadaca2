package org.example;
import java.util.Objects;
import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x;
        int y;

        System.out.print("First: ");
        x = reader.nextInt();
        System.out.print("Last: ");
        y = reader.nextInt();

        if(x<y){
            for(int i=x ; i<y+1 ; i++){
                System.out.println(i);

            }
        }

    }
}