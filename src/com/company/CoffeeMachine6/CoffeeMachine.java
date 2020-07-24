package com.company.CoffeeMachine6;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        NewCoffeeMachine newCoffeeMachine = new NewCoffeeMachine();
        newCoffeeMachine.showMenu();
    }
}

class NewCoffeeMachine {

    private int water;
    private int milk;
    private int coffee;
    private int disposableC;
    private int money;

    StateOfMachine currentState;
    String input = "";

   NewCoffeeMachine() {
       this.water = 400;
       this.milk = 540;
       this.coffee = 120;
       this.disposableC = 9;
       this.money = 550;
       currentState  = StateOfMachine.CHOOSING_ACTION;
   }



    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        this.input = scanner.nextLine();
        return input;
    }

    public void showMenu() {
        switch (currentState) {
            case CHOOSING_ACTION:
                System.out.println("Write action (buy, fill, take, remaining, exit):");

                switch (getUserInput()) {
                    case "buy":
                        setBuytatus();
                        break;
                    case "fill":
                        setFillStatus();
                        break;
                    case "take":
                        setTakeStatus();
                        break;
                    case "remaining":
                        setRemainingStatus();
                        break;
                    case "exit":
                        setExitStatus();
                        break;
                }
                break;
            case BUYING_DRINK:
                //System.out.println("Buying drink");
                buyDrink();
                break;
            case FILLING_MACHINE:
                //System.out.println("Filling Machine");
                fillMachine();
                break;
            case TAKING_MONEY:
                //System.out.println("Taking Money");
                takeMoney();
                break;
            case SHOWING_REMAINING:
                //System.out.println("Showing Remaining");
                showRemaining();
                break;
            case EXITING:
                System.out.println("Exiting");
                System.exit(0);
                break;
        }
    }

    private void showRemaining() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffee + " of coffee beans");
        System.out.println(disposableC + " of disposable cups");
        System.out.println(money + " of money");

        currentState = StateOfMachine.CHOOSING_ACTION;
        showMenu();
    }

    private void takeMoney() {
        System.out.println("I gave you $" + money);
        money = 0;

        currentState = StateOfMachine.CHOOSING_ACTION;
        showMenu();
    }

    private void fillMachine() {
        System.out.println("Write how many ml of water do you want to add:");
        water +=  Integer.parseInt(getUserInput());
        System.out.println("Write how many ml of milk do you want to add:");
        milk += Integer.parseInt(getUserInput());
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        coffee += Integer.parseInt(getUserInput());
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        disposableC += Integer.parseInt(getUserInput());

        currentState = StateOfMachine.CHOOSING_ACTION;
        showMenu();

    }

    private void buyDrink() {
        System.out.println("What do you want to buy? 1 - espresso," +
                " 2 - latte, 3 - cappuccino, back - to main menu:");
        String coffeeType = getUserInput();
        switch (coffeeType) {
            case "1": //espresso
                //250 ml of water and 16 g of coffee beans. It costs $4.
                //System.out.println("espresso");
                if (water - Drink.ESPRESSO.water >= 0) {
                    if (coffee - Drink.ESPRESSO.coffee >= 0) {
                        if (disposableC -1 >= 0) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= Drink.ESPRESSO.water;
                            coffee -= Drink.ESPRESSO.coffee;
                            disposableC -= 1;
                            money += Drink.ESPRESSO.costs;
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
                if (water - Drink.LATTE.water >= 0) {
                    if (milk - Drink.LATTE.milk >= 0) {
                        if (coffee - Drink.LATTE.coffee >= 0) {
                            if (disposableC - 1 >= 0) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= Drink.LATTE.water;
                                milk -= Drink.LATTE.milk;
                                coffee -= Drink.LATTE.coffee;
                                disposableC -= 1;
                                money += Drink.LATTE.costs;
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
                if (water - Drink.CAPPUCCINO.water >= 0) {
                    if (milk - Drink.CAPPUCCINO.milk >= 0) {
                        if (coffee - Drink.CAPPUCCINO.coffee >= 0) {
                            if (disposableC - 1 >= 0) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= Drink.CAPPUCCINO.water;
                                milk -= Drink.CAPPUCCINO.milk;
                                coffee -= Drink.CAPPUCCINO.coffee;
                                disposableC -= 1;
                                money += Drink.CAPPUCCINO.costs;
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
        currentState = StateOfMachine.CHOOSING_ACTION;
        showMenu();

    }

    private void setExitStatus() {
        currentState = StateOfMachine.EXITING;
        showMenu();
    }

    private void setRemainingStatus() {
        currentState = StateOfMachine.SHOWING_REMAINING;
        showMenu();
    }

    private void setTakeStatus() {
        currentState = StateOfMachine.TAKING_MONEY;
        showMenu();
    }

    private void setFillStatus() {
        currentState = StateOfMachine.FILLING_MACHINE;
        showMenu();
    }

    public void setBuytatus() {
        currentState = StateOfMachine.BUYING_DRINK;
        showMenu();
    }

}

/**
 * For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
 * For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
 * And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.
 * */
enum Drink {
    ESPRESSO(250, 0 ,16, 4),
    LATTE(350, 75, 20, 7),
    CAPPUCCINO(200, 100, 12, 6);

    int water;
    int milk;
    int coffee;
    int costs;

    Drink(int water, int milk, int coffee, int costs){
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
        this.costs = costs;
    }

}

enum StateOfMachine {
    CHOOSING_ACTION,
    BUYING_DRINK,
    FILLING_MACHINE,
    TAKING_MONEY,
    SHOWING_REMAINING,
    EXITING;
}


