package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many people will be there?");

        int howManyPeople = scanner.nextInt();
        scanner.nextLine(); // to have an extra free line

        int[] ages = new int[howManyPeople];

        for (int i = 1; i <= howManyPeople  ; i++) {
            System.out.print("Insert person " + i + " name:");
            String name = scanner.nextLine();
            System.out.print("Insert person " + i + " age:");
            int age = scanner.nextInt();
            ages[i - 1] = age;
            scanner.nextLine();
            System.out.print("Insert person " + i + " hair color:");
            String hairColor = scanner.nextLine();

            new Person(name, age, hairColor);

        }
        System.out.println("Average age is: " + Average.averageAge(ages));


    }



    }
        // Write a program that create an object of a person. User can state how many people to create
        // Use the object to create multiple persons with the following attributes based on the user's input
        // - Name
        // -Age
        // - Hair color
        // add a method in a separate class called Average and put in a method
        // to collate the average of people based on the number of people entered.
        // Main, Average, Person





