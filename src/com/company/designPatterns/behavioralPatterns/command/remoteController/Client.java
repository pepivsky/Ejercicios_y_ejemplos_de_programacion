package com.company.designPatterns.behavioralPatterns.command.remoteController;

import java.util.Scanner;
/* Ejmeplo de patron de diseno command

Remote Controller
Suppose you are building a remote controller application. It performs three commands. turning on the TV, changing the channel to a specific number, turning off the TV. Use the command pattern to implement this application.

Use the following guidelines.

Don't change the provided code.
The first command to execute is to turn on the TV. TurnOn command will print Turning on the TV.
Next change channels to the inputs given by the user. The user will give only three inputs. ChangeChannel command will print Channel was changed to X. X is the user given number.
The last command is to turn off the TV. TurnOff command will print Turning off the TV.

Sample Input:
4 7 12

Sample Output:
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

        int[] channelList = new int[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            channelList[i] = scanner.nextInt();
        }

        Command turnOnTV = new TurnOnCommand(tv);
        /* write your code here */
        controller.setCommand(turnOnTV);
        controller.executeCommand();

        Command changeChannel;
        for (int i = 0; i < 3; i++) {
            /* write your code here */
            changeChannel = new ChangeChannelCommand(new Channel(tv, channelList[i]));
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

    Channel channel;

    void turnOn() {
        System.out.println("Turning on the TV");
        setChannel(new Channel(this, 0));
    }

    void turnOff() {
        /* write your code here */
        System.out.println("Turning off the TV");
    }

    void setChannel(Channel channel) {
        this.channel = channel;
    }
}

class Channel {
    private TV tv;
    private int channelNumber;

    Channel(TV tv, int channelNumber) {
        /* write your code here */
        this.tv = tv;
        this.channelNumber = channelNumber;
    }

    void changeChannel() {
        tv.setChannel(this);
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

    /* write your code here */
    @Override
    public void execute() {
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