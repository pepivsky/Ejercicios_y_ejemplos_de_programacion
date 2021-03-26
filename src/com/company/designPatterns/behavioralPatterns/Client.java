package com.company.designPatterns.behavioralPatterns;

import java.util.Scanner;

/* ejemplo de un patron de comportamiento, comando, este patron encapsula el comportamiento de los objetos
Suppose you are building a remote controller application. It performs three commands. turning on the TV, changing the channel to a specific number, turning off the TV. Use the command pattern to implement this application.

Use the following guidelines.

Don't change the provided code.
The first command to execute is to turn on the TV. TurnOn command will print Turning on the TV.
Next change channels to the inputs given by the user. The user will give only three inputs. ChangeChannel command will print Channel was changed to X. X is the user given number.
The last command is to turn off the TV. TurnOff command will print Turning off the TV.
 Report a typo
Sample Input 1:

4 7 12
Sample Output 1:

Turning on the TV
Channel was changed to 4
Channel was changed to 7
Channel was changed to 12
Turning off the TV
 */
class Client {

    public static void main(String[] args) {

        Controller controller = new Controller();
        TV tv = new TV();

        Command changeChannel;
        int[] channelList = new int[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            channelList[i] = scanner.nextInt();
        }

        Command turnOnTV = new TurnOnCommand(tv);
        /* write your code here */
        controller.setCommand(turnOnTV);
        controller.executeCommand();

        for (int i = 0; i < 3; i++) {
            /* write your code here */
            Channel channel = new Channel(channelList[i]);
            changeChannel = new ChangeChannelCommand(channel);
            controller.setCommand(changeChannel);
            controller.executeCommand();
        }

        Command turnOffTV = new TurnOffCommand(tv);
        /* write your code here */
        controller.setCommand(turnOffTV);
        controller.executeCommand();
    }
}

class TV {

    void turnOn() {
        System.out.println("Turning on the TV");
    }

    void turnOff() {
        /* write your code here */
        System.out.println("Turning off the TV");
    }
}

class Channel {
    private int channelNumber;

    Channel(int channelNumber) {
        /* write your code here */
        this.channelNumber = channelNumber;
    }

    void changeChannel() {
        System.out.println("Channel was changed to " + channelNumber);
    }

}

interface Command {
    /* write your code here */
    void execute();
}

class TurnOnCommand implements Command {
    /* write your code here */
    private TV tv;

    TurnOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        /* write your code here */
        tv.turnOn();
    }
}

class TurnOffCommand implements Command {
    /* write your code here */
    private TV tv;

    TurnOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        /* write your code here */
        tv.turnOff();
    }
}

class ChangeChannelCommand implements Command {
    private Channel channel;

    ChangeChannelCommand(Channel channel) {
        this.channel = channel;
    }

    @Override
    public void execute() {
        /* write your code here */
        channel.changeChannel();
    }


}

class Controller {
    private Command command;
    void setCommand(Command command) {
        this.command = command;
    }
    void executeCommand() {
        /* write your code here */
        command.execute();
    }
}
