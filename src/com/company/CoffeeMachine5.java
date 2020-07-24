package com.company;

import java.util.Scanner;

public class CoffeeMachine5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String action = "";
        String coffeeType = "";
        int water = 400;
        int milk = 540;
        int coffee = 120;
        int disposableC = 9;
        int money = 550;



        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.next();

            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    coffeeType = scanner.next();
                    coffeeType = coffeeType.trim();
                    switch (coffeeType) {
                        case "1": //espresso
                            //250 ml of water and 16 g of coffee beans. It costs $4.
                            //System.out.println("espresso");
                            if (water - 250 >= 0) {
                                if (coffee - 16 >= 0) {
                                    if (disposableC -1 >= 0) {
                                        System.out.println("I have enough resources, making you a coffee!");
                                        water -= 250;
                                        coffee -= 16;
                                        disposableC -= 1;
                                        money += 4;
                                    } else {
                                        System.out.println("Sorry, not enough disposable cups!");
                                    }
                                } else {
                                    System.out.println("Sorry, not enough coffee!");
                                }
                            } else {
                                System.out.println("Sorry, not enough water!");
                            }

                            break;
                        case "2": //latte
                            //350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
                            if (water - 350 >= 0) {
                                if (milk - 75 >= 0) {
                                    if (coffee - 20 >= 0) {
                                        if (disposableC - 1 >= 0) {
                                            System.out.println("I have enough resources, making you a coffee!");
                                            water -= 350;
                                            milk -= 75;
                                            coffee -= 20;
                                            disposableC -= 1;
                                            money += 7;
                                        } else {
                                            System.out.println("Sorry, not enough disposable cups!");
                                        }
                                    } else {
                                        System.out.println("Sorry, not enough coffee!");
                                    }
                                } else {
                                    System.out.println("Sorry, not enough milk!");
                                }
                            } else {
                                System.out.println("Sorry, not enough water!");
                            }
                            break;
                        case "3": //cappuccino
                            //200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.
                            if (water - 200 >= 0) {
                                if (milk - 100 >= 0) {
                                    if (coffee - 12 >= 0) {
                                        if (disposableC - 1 >= 0) {
                                            System.out.println("I have enough resources, making you a coffee!");
                                            water -= 200;
                                            milk -= 100;
                                            coffee -= 12;
                                            disposableC -= 1;
                                            money += 6;
                                        } else {
                                            System.out.println("Sorry, not enough disposable cups!");
                                        }
                                    } else {
                                        System.out.println("Sorry, not enough coffee!");
                                    }
                                } else {
                                    System.out.println("Sorry, not enough milk!");
                                }
                            } else {
                                System.out.println("Sorry, not enough water!");
                            }
                            break;
                        case "back":
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add: ");
                    coffee += scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add: ");
                    disposableC += scanner.nextInt();
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(coffee + " of coffee beans");
                    System.out.println(disposableC + " of disposable cups");
                    System.out.println(money + " of money");
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Error");
            }

        } while (!action.equals("exit"));


    }
}

