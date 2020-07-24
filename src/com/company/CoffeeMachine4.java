package com.company;

import java.util.Scanner;

public class CoffeeMachine4 {
    public static void takeMoney(int w, int m, int c, int d, int mon) {
        System.out.println("I gave you $" + m);

        System.out.println("The coffee machine has:");
        System.out.println(w + " of water");
        System.out.println(m + " of milk");
        System.out.println(c + " of coffee beans");
        System.out.println(d + " of disposable cups");
        System.out.println(0 + " of money");

    }
    public static void fillMachine(int w, int m, int c, int d, int mon) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        int coffee = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        int diposaC = scanner.nextInt();

        System.out.println("The coffee machine has:");
        System.out.println(w + water + " of water");
        System.out.println(m + milk + " of milk");
        System.out.println(c + coffee + " of coffee beans");
        System.out.println(d + diposaC + " of disposable cups");
        System.out.println(mon + " of money");
    }
    public static void buyCoffee(int w, int m, int c, int d, int mon, int coffeeType) {
        switch (coffeeType) {
            case 1:
                //250 ml of water and 16 g of coffee beans. It costs $4.
                //System.out.println("espresso");
                System.out.println("The coffee machine has:");
                System.out.println(w - 250 + " of water");
                System.out.println(m + " of milk");
                System.out.println(c - 16 + " of coffee beans");
                System.out.println(d - 1 + " of disposable cups");
                System.out.println(mon + 4 + " of money");
                break;
            case 2:
                //350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
                //System.out.println("latte");
                System.out.println("The coffee machine has:");
                System.out.println(w - 350 + " of water");
                System.out.println(m - 75 + " of milk");
                System.out.println(c - 20 + " of coffee beans");
                System.out.println(d - 1 + " of disposable cups");
                System.out.println(mon + 7 + " of money");
                break;
            case 3:
                //200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.
                //System.out.println("cappuccino");
                System.out.println("The coffee machine has:");
                System.out.println(w - 200 + " of water");
                System.out.println(m - 100 + " of milk");
                System.out.println(c - 12 + " of coffee beans");
                System.out.println(d - 1 + " of disposable cups");
                System.out.println(mon + 6 + " of money");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String action = "";
        int coffeeType = 0;
        int water = 400;
        int milk = 540;
        int coffee = 120;
        int  disposableC = 9;
        int money = 550;

        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffee + " of coffee beans");
        System.out.println(disposableC + " of disposable cups");
        System.out.println(money + " of money");

        System.out.println("Write action (buy, fill, take):");
        action = scanner.next();

        switch (action) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                coffeeType = scanner.nextInt();
                buyCoffee(water, milk, coffee, disposableC, money, coffeeType);
                break;
            case "fill":
                fillMachine(water, milk, coffee, disposableC,money);
                break;
            case "take":
                takeMoney(water, milk, coffee, disposableC, money);
                break;
            default:
                System.out.println("Error");

        }

    }
}
