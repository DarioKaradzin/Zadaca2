package org.example;
import java.util.Objects;
import java.util.Scanner;

public class zad7 {
    public static void printStars(int a){
        String t = "";

        for(int i=0;i<a;i++){
            t = t + "*";
        }
        System.out.println(t);
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }

}