package com.company.designPatterns.behavioralPatterns.command.stockBroker;
/* ejemplo de parton de diseno command
Stock Broker
Suppose you are creating a stockbroker application. It performs two commands which are buy and sell. Use the command pattern to implement this application. Use the following guidelines.

Don't change the provided code.
Sell command will print Stock was sold
Buy command will print Stock was bought
First, it will perform a buy command then it will perform sell command.

 */
public class Main {

    public static void main(String[] args) {

        /* write your code here */
        Stock stock = new Stock();
        Broker broker = new Broker();

        Command buyCommand = new BuyCommand(stock);
        broker.setCommand(buyCommand);
        broker.executeCommand();

        Command sellCommand = new SellCommand(stock);
        broker.setCommand(sellCommand);
        broker.executeCommand();
    }
}


class Stock {

    public void buy() {
        System.out.println("Stock was bought");
    }

    public void sell() {
        System.out.println("Stock was sold");
    }
}

interface Command {
    /* write your code here */
    void execute();
}

class BuyCommand implements Command {
    private Stock stock;

    public BuyCommand(Stock stock) {
        this.stock = stock;
    }

    /* write your code here */
    @Override
    public void execute() {
        stock.buy();
    }
}

class SellCommand implements Command {
    private Stock stock;

    public SellCommand(Stock stock) {
        this.stock = stock;
    }

    /* write your code here */
    @Override
    public void execute() {
        stock.sell();
    }
}

class Broker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        /* write your code here */
        command.execute();
    }
}