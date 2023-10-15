package org.example;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String password = "password";

        while(true){
            System.out.print("Please enter the password: ");
            String a = reader.nextLine();
            if(Objects.equals(a, password)){
                System.out.println("Right!");
                break;
            }else{
                System.out.println("False!");
            }
        }

    }
}