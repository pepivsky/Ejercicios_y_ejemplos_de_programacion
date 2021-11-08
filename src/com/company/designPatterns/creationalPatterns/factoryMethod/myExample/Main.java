package com.company.designPatterns.creationalPatterns.factoryMethod.myExample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejemplo de factory method");
        System.out.println("Ingresa el nombre de la comida que deseas");
        String name = scanner.nextLine();
        System.out.println("Ingresa el precio");
        double price = scanner.nextDouble();

        FastFoodFactory fastFoodFactory = new FastFoodFactory();

        FastFood fastFood = fastFoodFactory.produce(name, price);

        System.out.println(fastFood);

    }
}

abstract class FastFood {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public FastFood(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract void putBun();

    abstract void putProtein();

    void puSauce() {
        System.out.println("Putting Sauce");
    }

    @Override
    public String toString() {
        return "Se ha producido lo siguiente: " + name;
    }
}

class Burguer extends FastFood {

    public Burguer(String name, double price) {
        super(name, price);
    }

    @Override
    void putBun() {
        System.out.println("Putting a burguer bun");
    }

    @Override
    void putProtein() {
        System.out.println("Putting burguer meat");
    }

}

class HotDog extends FastFood {

    HotDog(String name, double price) {
        super(name, price);
    }

    @Override
    void putBun() {
        System.out.println("Putting a hotdog bun");
    }

    @Override
    void putProtein() {
        System.out.println("Putting a hotdog meat");
    }
}

class Taco extends FastFood {

    Taco(String name, double price) {
        super(name, price);
    }

    @Override
    void putBun() {
        System.out.println("Putting a tortilla");
    }

    @Override
    void putProtein() {
        System.out.println("Putting a protein");
    }
}

class FastFoodFactory {

    public FastFood produce(String name, double price) {
        switch (name) {
            case "Taco":
                return new Taco(name, price);
            case "Burguer":
                return new Burguer(name, price);
            case "Hotdog":
                return new HotDog(name, price);
            default:
                return null;
        }
    }
}


