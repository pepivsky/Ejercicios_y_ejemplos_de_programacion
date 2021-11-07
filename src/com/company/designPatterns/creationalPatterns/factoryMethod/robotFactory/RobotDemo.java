package com.company.designPatterns.creationalPatterns.factoryMethod.robotFactory;

import java.util.Scanner;
/* Ejemplo de factory method
Robot factory
Let's expand our RobotFactory! We've added a new Robot type — the Guardian.

Provide the RobotGuardian class and implement a factory method in RobotFactory methods to create Robotinstances.

Please, do not change the provided code of the classes.


Sample Input:
TYU11
O13L3

Sample Output:
cleaner-robot: {
	name : TYU11
	description : Robot will clean my room and dry my socks
	power : 100
}
guardian-robot: {
	name : O13L3
	description : Knight will secure my daughter while she sleeping
	power : 200
}

 */
/** Product - Robot */
abstract class Robot {
    private int power;

    Robot(int power) {
        this.power = power;
    }

    public abstract String getName();

    public abstract String getDescription();

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "robot: {\n\t" +
                "name : " + getName() + "\n\t" +
                "description : " + getDescription() + "\n\t" +
                "power : " + getPower() + "\n}";
    }
}

/** Robot types */
enum RobotType {
    ROBOT_CLEANER,
    /**  write your code here ... */
    ROBOT_GUARDIAN
}

/** Concrete Product - Robot Cleaner */
class RobotCleaner extends Robot {
    private String name;
    private String description;

    public RobotCleaner(String name, String description, int power) {
        super(power);
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "cleaner-" + super.toString();
    }

}

/** Concrete Product - Robot Guardian */
class RobotGuardian extends Robot {
    /**  write your code here ... */
    private String name;
    private String description;

    public RobotGuardian(String name, String description, int power) {
        super(power);
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "guardian-" + super.toString();
    }
}

class RobotFactory {

    /** Factory method */
    public Robot getRobot(RobotType type, String name, String description, int power) {
        /**  write your code here ... */
        if (type == RobotType.ROBOT_CLEANER) {
            return new RobotCleaner(name, description, power);
        } else if (type == RobotType.ROBOT_GUARDIAN) {
            return new RobotGuardian(name, description, power);
        } else {
            return null;
        }
    }
}

class RobotDemo {
    private static final int CLEANER_POWER = 100;
    private static final int GUARDIAN_POWER = 200;

    public static void main(String[] args) {

        RobotFactory robotFactory = new RobotFactory();
        Scanner scanner = new Scanner(System.in);

        String nameCleaner = scanner.nextLine();
        Robot robotCleaner = robotFactory.getRobot(RobotType.ROBOT_CLEANER, nameCleaner,
                "Robot will clean my room and dry my socks",
                CLEANER_POWER);

        String nameGuardian = scanner.nextLine();
        Robot robotGuardian = robotFactory.getRobot(RobotType.ROBOT_GUARDIAN, nameGuardian,
                "Knight will secure my daughter while she sleeping",
                GUARDIAN_POWER);

        System.out.println(robotCleaner);
        System.out.println(robotGuardian);

        scanner.close();
    }
}