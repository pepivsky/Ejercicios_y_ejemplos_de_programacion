package com.company.designPatterns.sandwich;

import java.util.Scanner;

/*
Ejemplo de patron de diseno Builder


Subway Sandwich

It seems to be true that developers get inspiration from the real world, so let's consider a real-world example of the Builder Pattern: Subway sandwiches. A waiter in Subway is your Builder. You can build sandwiches step-by-step adding portions of an ingredient. We offer you to make a simple order: your task is to write some TestDrive code and get a correct output.

 Report a typo
Sample Input 1:

Italian
1
2
0
4
Sample Output 1:

Bun : Italian
Salad : 1
Cheese : 2
Cucumber : 0
Ham : 4
 */
class Sandwich {

    private String bun;
    private int salad;
    private int cheese;
    private int cucumber;
    private int ham;

    public Sandwich(String bun, int salad, int cheese, int cucumber, int ham) {
        this.bun = bun;
        this.salad = salad;
        this.cheese = cheese;
        this.cucumber = cucumber;
        this.ham = ham;
    }

    public static class Builder {

        private String bun;
        private int salad;
        private int cheese;
        private int cucumber;
        private int ham;

        public Builder addBun(String bun) {
            this.bun = bun;
            return this;
        }

        public Builder addSalad(int salad) {
            this.salad = salad;
            return this;
        }

        public Builder addCheese(int cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder addCucumber(int cucumber) {
            this.cucumber = cucumber;
            return this;
        }

        public Builder addHam(int ham) {
            this.ham = ham;
            return this;
        }

        public Sandwich build() {
            return new Sandwich(bun, salad, cheese, cucumber, ham);
        }
    }

    @Override
    public String toString() {
        return "Bun : " + bun + "\n" +
                "Salad : " + salad + "\n" +
                "Cheese : " + cheese + "\n" +
                "Cucumber : " + cucumber + "\n" +
                "Ham : " + ham;
    }
}

class TestDrive {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        /* Hello, which bun would like to? */
        String bun = scanner.nextLine();
        /* How much salad would like to add? */
        int salad = Integer.valueOf(scanner.nextLine());
        /* How much cheese would like to add? */
        int cheese = Integer.valueOf(scanner.nextLine());
        /* How much cucumber would like to add? */
        int cucumber = Integer.valueOf(scanner.nextLine());
        /* How much ham would like to add? */
        int ham = scanner.nextInt();

        /* write your code here  usando el builder para construir objetos con distintos parametros*/
        Sandwich sandwich = new Sandwich.Builder()
                .addBun(bun)
                .addSalad(salad)
                .addCheese(cheese)
                .addCucumber(cucumber)
                .addHam(ham)
                .build();

        System.out.println(sandwich);
        scanner.close();
    }
}
