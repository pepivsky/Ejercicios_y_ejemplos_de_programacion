package com.company.designPatterns.behavioralPatterns.command.example;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        Light light = new Light();

        LightOnCommand lightsOn = new LightOnCommand(light);
        LightOffCommand lightsOff = new LightOffCommand(light);

        controller.setCommand(lightsOn);
        controller.executeCommand();

        controller.setCommand(lightsOff);
        controller.executeCommand();
    }
}
