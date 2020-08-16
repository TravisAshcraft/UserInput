package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int date = 2020;

        System.out.println("Please enter your name.");
        String name = scanner.nextLine();
        System.out.printf("Hello %s!%n", name);
        System.out.println("Enter your birth year.");
        int birthday = scanner.nextInt();
        int age = date - birthday;
        System.out.printf("%s is %d years old%n", name,age);

        if(age <= 21 ){
            System.out.printf("%s you are to young!%n", name);
        }
        else if (age >= 22){
            System.out.printf("%s you are old!%n", name);
        }

        scanner.close();
    }
}
