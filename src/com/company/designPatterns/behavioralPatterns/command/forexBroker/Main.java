package com.company.designPatterns.behavioralPatterns.command.forexBroker;
/* ejemplo de patron de diseno command
Forex Broker
Suppose you are building a Forex Broker application. Forex broker has two commands which are buy and sell. The user gives an input sequence which is the amount of money(Option) to be bought and sold. If the user has given a positive number it is to be bought. If the user has given a negative number, that amount should be sold.

Use the following guidelines.

Don't change the provided code.
if the user amount is X> 0, the X amount should be bought. buy command will print X was bought.
if the user amount is X< 0, the X amount should be sold. sell command will print X was sold.
The user will give only three inputs.

Sample Input:
5 -8 10

Sample Output:
5 was bought
-8 was sold
10 was bought

 */
import java.util.Scanner;

public class Main {
    public static int SIZE = 3;
    public static void main(String[] args) {
        int[] amountList = new int[SIZE];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < SIZE; i++) {
            amountList[i] = scanner.nextInt();
        }

        Broker broker = new Broker();
        for (int i = 0; i < SIZE; i++) {
            Option option = new Option(amountList[i]);
            Command command;
            if (amountList[i] > 0) {
                /* write your code here */
                command = new BuyCommand(option);

            } else {
                /* write your code here */
                command = new SellCommand(option);
            }
            broker.setCommand(command);
            broker.executeCommand();
        }
    }
}

class Option {
    private int amount;

    Option(int amount) {
        this.amount = amount;
    }

    void buy() {
        System.out.println(amount + " was bought");
    }

    void sell() {
        /* write your code here */
        System.out.println(amount + " was sold");
    }
}

interface Command {
    /* write your code here */
    void execute();
}

class BuyCommand implements Command {
    private Option option;

    BuyCommand(Option option) {
        this.option = option;
    }

    /* write your code here */
    @Override
    public void execute() {
        option.buy();
    }

}

class SellCommand implements Command {
    private Option option;

    SellCommand(Option option) {
        this.option = option;
    }

    /* write your code here */
    @Override
    public void execute() {
        option.sell();
    }
}

class Broker {
    private Command command;

    void setCommand(Command command) {
        /* write your code here */
        this.command = command;
    }
    void executeCommand() {
        /* write your code here */
        command.execute();
    }
}