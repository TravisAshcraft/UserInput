package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int date = 2020;

        System.out.println("Please enter your name.");
        String name = scanner.nextLine();
        System.out.println("Hello, "+name);
        System.out.println("Enter your birth year.");
        int birthday = scanner.nextInt();
        int age = date - birthday;
        System.out.println(name + " is " + age + " years old.");

        if(age <= 21 ){
            System.out.println(name + " you are young.");
        }
        else if (age >= 22){
            System.out.println(name + " your getting old.");
        }

        scanner.close();
    }
}
