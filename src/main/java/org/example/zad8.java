package org.example;
import java.util.Objects;
import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        drawStarsPiramid(5);
        System.out.println("----------------------------");
        drawStarsPiramid(10);
        System.out.println("----------------------------");
        drawStarsPriamidI(5);
        System.out.println("----------------------------");
        drawStarsPriamidI(10);
    }

    public static void drawStarsPiramid(int n){
        String t = "";
        for(int i=1; i<n+1;i++){
            t = t + "*";
            System.out.println(t);
        }
    }

    public static void drawStarsPriamidI(int n){
        String t = "";
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                t=t + "*";
            }
            System.out.println(t);
            t = "";
        }
    }
}