package com.company.contacts;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*

Description
Sometimes we need to restrict the ability to change the instance fields. For example, the phone number can't just be any string; it should follow some rules. As you can see here, phone number format is different for every country, but they all have some elements in common.

So, you should set the field with a phone number to be private and create a getter and setter to this field. The setter should check the value using a regular expression and should set the value to the field only if the value satisfies all the rules below:

The phone number should be split into groups using a space or dash. One group is also possible.
Before the first group, there may or may not be a plus symbol.
The first group or the second group can be wrapped in parentheses, but there should be no more than one group which is wrapped in parentheses. There may be no groups wrapped in parentheses.
A group can contain numbers, uppercase, and lowercase English letters. A group should be at least 2 symbols in length. But the first group may be only one symbol in length.
If you are struggling with a regular expression that checks all of these, you might check the phone number with only String methods.
Also, create getters and setters for the name and surname of the person. Also, there should be a method hasNumber() that checks if the user has a number. Initially, set the number to be an empty string.

Create a separate method to check the validity of the phone number. This is standalone logic and potentially can be used in multiple places of a class. But this is also a method for internal use. Therefore, mark the method as private.

This concept of restricting the usage of a class called encapsulation. This is a self-documented solution for how to use a class.

In this stage, you should write a program that keeps all the records in a list. You should be able to add, remove, edit the records, and get the number of records. If the user inputs an incorrect phone number, you should reset it as empty. If the number is empty, you should write the string [no number] instead of it.

Output examples
Below is an example of how your output might look. The symbol > represents the user input.

Example 1
Enter action (add, remove, edit, count, list, exit): > count
The Phone Book has 0 records.
Enter action (add, remove, edit, count, list, exit): > edit
No records to edit!
Enter action (add, remove, edit, count, list, exit): > remove
No records to remove!
Enter action (add, remove, edit, count, list, exit): > add
Enter the name: > John
Enter the surname: > Smith
Enter the number: > +0 (123) 456-789-ABcd
The record added.
Enter action (add, remove, edit, count, list, exit): > add
Enter the name: > Adam
Enter the surname: > Jones
Enter the number: > +0(123)456-789-9999
Wrong number format!
The record added.
Enter action (add, remove, edit, count, list, exit): > list
1. John Smith, +0 (123) 456-789-ABcd
2. Adam Jones, [no number]
Enter action (add, remove, edit, count, list, exit): > edit
1. John Smith, +0 (123) 456-789-ABcd
2. Adam Jones, [no number]
Select a record: > 2
Select a field (name, surname, number): > number
Enter number: > (123) 234 345-456
The record updated!
Enter action (add, remove, edit, count, list, exit): > list
1. John Smith, +0 (123) 456-789-ABcd
2. Adam Jones, (123) 234 345-456
Enter action (add, remove, edit, count, list, exit): > remove
1. John Smith, +0 (123) 456-789-ABcd
2. Adam Jones, (123) 234 345-456
Select a record: > 1
The record removed!
Enter action (add, remove, edit, count, list, exit): > list
1. Adam Jones, (123) 234 345-456
Enter action (add, remove, edit, count, list, exit): > exit
Example 2
Enter action (add, remove, edit, count, list, exit): > add
Enter the name: > John
Enter the surname: > Smith
Enter the number: > +0 (123) 456-789-ABcd
The record added.
Enter action (add, remove, edit, count, list, exit): > edit
1. John Smith, +0 (123) 456-789-ABcd
Select a record: > 1
Select a field (name, surname, number): > number
Enter number: > ()()
Wrong number format!
The record updated!
Enter action (add, remove, edit, count, list, exit): > list
1. John Smith, [no number]
Enter action (add, remove, edit, count, list, exit): > exit

 */
public class Stage2 {
    private static ArrayList<Contacts2> contacts2ArrayList = new ArrayList<>();

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);

        String menuInput = "";

        Contacts2 contact;
        String name = "";
        String surName = "";
        String phoneNumber = "";

        while (!menuInput.equals("exit")) {
            System.out.println("Enter action (add, remove, edit, count, list, exit): >");
            menuInput = scanner.nextLine();

            //menu de opciones
            switch (menuInput) {
                case "add":
                    addNewContact();
                    break;
                case "remove":
                    removeContact();
                    break;
                case "edit":
                    editContact();
                    break;
                case "count":
                    System.out.println("The Phone Book has " + contacts2ArrayList.size() + " records.");
                    break;
                case "list":
                    listMyContacts();
                    break;
                case "exit":
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + menuInput);
            }

        }

    }

    private static void addNewContact() {
        Contacts2 contact = new Contacts2();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: >");
        String newName = scanner.nextLine();
        contact.setName(newName);

        System.out.println("Enter surname: >");
        String newSurname = scanner.nextLine();
        contact.setSurname(newSurname);

        //scanner.nextLine();//consumiendo el \n

        System.out.println("Enter number: >");
        String number = scanner.nextLine();
        contact.setPhoneNumber(number);
        //agregar a la lista
        contacts2ArrayList.add(contact);

        System.out.println("The record added.");


    }

    private static void editContact() {
        if (contacts2ArrayList.isEmpty()) {
            System.out.println("No records to edit!");
        } else {
            listMyContacts();
            String field;
            String newName;
            String newSurname;
            String newNumber;
            System.out.println("Select a record: >");
            Scanner scanner = new Scanner(System.in);
            int indexContact = Integer.parseInt(scanner.nextLine()) - 1;
            //scanner.nextLine();//consumiendo el \n

            //obteniendo el objeto
            Contacts2 contactSelected = contacts2ArrayList.get(indexContact);

            System.out.println("Select a field (name, surname, number): >");
            field = scanner.nextLine();
            switch (field) {
                case "name":
                    System.out.println("Enter name: >");
                    newName = scanner.nextLine();
                    contactSelected.setName(newName);
                    System.out.println("The record updated!");
                    break;
                case "surname":
                    System.out.println("Enter surname: >");
                    newSurname = scanner.nextLine();
                    contactSelected.setSurname(newSurname);
                    System.out.println("The record updated!");
                    break;
                case "number":
                    System.out.println("Enter number: >");
                    newNumber = scanner.nextLine();
                    contactSelected.setPhoneNumber(newNumber);
                    System.out.println("The record updated!");

                    break;
                default:
                    System.out.println("Invalid Option");
                    break;


            }
        }

    }

    private static void removeContact() {
        if (contacts2ArrayList.isEmpty()) {
            System.out.println("No records to remove!");
        } else {
            listMyContacts();
            System.out.println("Select a record: >");
            Scanner scanner = new Scanner(System.in);
            int indexContact = scanner.nextInt() - 1;
            contacts2ArrayList.remove(indexContact);
            System.out.println("The record removed!");
        }


    }

    private static void listMyContacts() {
        if (contacts2ArrayList.isEmpty()) {
            System.out.println("No records to list!");
        } else {
            //System.out.println("listando");
            int index = 1;
            for (Contacts2 contact : contacts2ArrayList) {
                System.out.println(index + ". " + contact.getName() + " " + contact.getSurname() + ", " + contact.getPhoneNumber());
                index++;
            }
        }

    }
}

class Contacts2 {
    private String name;
    private String surname;
    private String phoneNumber;

    Contacts2() {

    }

    Contacts2(String name, String surname, String phoneNumber) {
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

    public void setPhoneNumber(String phoneNumber) { //check number
        Pattern pattern = Pattern.compile("^(^((\\+\\d )|(\\+))?\\(?\\w+\\)?(-| )?(\\w{2,})?(-| )?(\\w{2,})?(-| )?(\\w{2,})?$)|(^((\\+\\d )|(\\+))?\\w+(-| )?\\(?(\\w{2,})\\)?(-| )?(\\w{2,})?(-| )?(\\w{2,})?$)$");

        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.find()) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Wrong number format!");
            this.phoneNumber = "[no number]";
        }

    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

