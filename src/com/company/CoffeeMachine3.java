package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CoffeeMachine3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = 0;
        int waterForCup = 200;
        int milkForCup = 50;
        int coffeeForCup = 15;
        int menor = 0;
        ArrayList<Integer> numbers = new ArrayList<>();

        int waterAmount = 0;
        int milkAmount = 0;
        int coffeeAmount = 0;
        System.out.println("Write how many ml of water the coffee machine has: ");
        waterAmount = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        milkAmount = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        coffeeAmount = scanner.nextInt();


        //Pedir las tazas de café
        System.out.println("Write how many cups of coffee you will need: ");
        cups = scanner.nextInt();
        waterAmount /= waterForCup;
        milkAmount /= milkForCup;
        coffeeAmount /= coffeeForCup;
        //System.out.println(waterAmount);
        //llenando el ArrayList
        numbers.add(waterAmount);
        numbers.add(milkAmount);
        numbers.add(coffeeAmount);

        if (cups <= waterAmount && cups <= milkAmount && cups <= coffeeAmount) {
            if (waterAmount > cups || milkAmount > cups || coffeeAmount > cups) {
                menor = (int)Collections.min(numbers) - cups;
                if (menor == 0) {
                    System.out.println("Yes, I can make that amount of coffee");
                } else {
                    System.out.println("Yes, I can make that amount of coffee (and even "+ menor + " more than that)");
                }


            } else {
                System.out.println("Yes, I can make that amount of coffee");
                //System.out.println(waterAmount);
            }


        } else {

            System.out.println("No, I can make only "+ Collections.min(numbers)+ " cup(s) of coffee"); //Se obtiene el menor del array
            //System.out.println("No, I can make: " + waterAmount);
        }
    }
}
