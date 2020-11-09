package com.company.designPatterns.ejemploRobot;

import java.util.Scanner;
/*
Robot Builder
The final task is about building your own Robot. Write the full code of RobotBuilder class and to build your robot in TestDrive class, and get the correct output.


Sample Input:
4
2
1

Sample Output:
CPU : Intel Core i5
Legs : 4
Hands : 2
Eyes : 1
 */
class Robot {

    private String CPU;
    private int legs;
    private int hands;
    private int eyes;

    Robot(String CPU, int legs, int hands, int eyes) {
        this.CPU = CPU;
        this.legs = legs;
        this.hands = hands;
        this.eyes = eyes;
    }

    public static class RobotBuilder {

        /* write your code here (fields) */
        private String cpu;
        private int legs;
        private int hands;
        private int eyes;


        /* write your code here (constructor) */
        /*private RobotBuilder(String cpu, int legs, int hands, int eyes) {
            this.cpu = cpu;
            this.legs = legs;
            this.hands = hands;
            this.eyes = eyes;
        }*/
        RobotBuilder() {} // constructor vacio

        RobotBuilder setCPU(String cpu) {
            /* write your code here */
            this.cpu = cpu;
            return this;
        }

        RobotBuilder setLegs(int legs) {
            /* write your code here */
            this.legs = legs;
            return this;
        }

        RobotBuilder setHands(int hands) {
            /* write your code here */
            this.hands = hands;
            return this;
        }

        RobotBuilder setEyes(int eyes) {
            /* write your code here */
            this.eyes = eyes;
            return this;
        }

        Robot build() {
            /* write your code here */
            return new Robot(cpu, legs, hands, eyes);
        }
    }

    @Override
    public String toString() {
        return "CPU : " + CPU + "\n" +
                "Legs : " + legs + "\n" +
                "Hands : " + hands + "\n" +
                "Eyes : " + eyes + "\n";
    }
}

class TestDrive {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final Robot.RobotBuilder robotBuilder = new Robot.RobotBuilder(); //instancia de RobotBuilder necesaria oara construir el objeto

        /* write your code here */
        /* Set CPU */
        robotBuilder.setCPU("Intel Core i5");
        /* Would like to set legs? */
        int legs = scanner.nextInt();
        robotBuilder.setLegs(legs);
        /* Would like to set hands? */
        int hands = scanner.nextInt();
        robotBuilder.setHands(hands);
        /* Would like to set eyes? */
        int eyes = scanner.nextInt();
        robotBuilder.setEyes(eyes);

        Robot robot = robotBuilder.build(); //se le pasa el robotBuilder que contiene los campos del constructor llenos
        /* write your code here */

        System.out.println(robot); //se imprime
        scanner.close(); //se cierra el scanner
    }
}
