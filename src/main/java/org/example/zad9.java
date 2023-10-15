package org.example;
import java.util.Objects;
import java.util.Scanner;

public class zad9 {

    public static void main(String[] args) {
        drawNumbersPyramid(5);
        System.out.println("----------------------------");
        drawNumbersPyramid(10);
        System.out.println("----------------------------");
        drawNumbersPyramidI(5);
        System.out.println("----------------------------");
        drawNumbersPyramidI(10);
    }
    public static void drawNumbersPyramid(int n){
        String t = "";
        for(int i=1; i<=n;i++){
            t = t + i;
            System.out.println(t);
        }
    }

    public static void drawNumbersPyramidI(int n){
        String t = "";
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                t=t + i;
            }
            System.out.println(t);
            t = "";
        }
    }
}