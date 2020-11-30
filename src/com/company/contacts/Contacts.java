package com.company.contacts;
/*
Stage 1/4: First contact
Description
Contacts is a handy app to have. It stores all of your saved contacts. In this project, you will write one yourself. It teaches you to understand and implement the basic principles of OOP.

In the first stage, you should write a program that creates an instance of a class that stores information about one record in the Contacts. One record should contain a name, a surname, and a phone number. You can type them from the keyboard.

You should also create a class representing this app. For now, it should store only one record: a record that you created from the input.

Output example
Below is an example of how your output might look. Lines which start with > represent the user input.

Enter the name of the person:
> John
Enter the surname of the person:
> Smith
Enter the number:
> 1-234-567-890

A record created!
A Phone Book with a single record created!
 */

import java.util.Scanner;

class Contacts {
    private String name;
    private String surname;
    private String phoneNumber;

    Contacts() {

    }
    Contacts(String name, String surname, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the person:");
        String name = scanner.nextLine();

        System.out.println("Enter the surname of the person:");
        String surname = scanner.nextLine();

        System.out.println("Enter the number:");
        String phoneNumber = scanner.nextLine();

        Contacts2 contact1 = new Contacts2(name, surname, phoneNumber);

        System.out.println("A record created!");
        System.out.println("A Phone Book with a single record created!");
    }
}

