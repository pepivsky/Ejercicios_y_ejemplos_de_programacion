package com.company.designPatterns.creationalPatterns.factoryMethod.motorsFactory;

import java.util.Scanner;
/* Ejemplo de patron de diseno factory method
Motors
A lovely idea befalls you: you decide to automate the production of motors.

You have 4 types of motors: electric, hydraulic, pneumatic and warp drive.

You must implement MotorFactory and the specified classes of motors.

Please, do not change the provided code of the motor classes.


Sample Input:
E
R-45
1000

Sample Output:
Electric motor={model:R-45,power:1000}
 */


/* Product - Motor */
abstract class Motor { // esta clase puede ser no abstracta ya que no tiene ningun metodo abstracto

    String model;
    long power;

    public Motor(String model, long power) {
        this.model = model;
        this.power = power;
    }

    @Override
    public String toString() {
        return "motor={model:" + model + ",power:" + power + "}";
    }
}

class PneumaticMotor extends Motor {
    // write your code here ...
    public PneumaticMotor(String model, long power) {
        super(model, power);
    }


}

class HydraulicMotor extends Motor {
    // write your code here ...
    public HydraulicMotor(String model, long power) {
        super(model, power);
    }

    @Override
    public String toString() {
        return "Hydraulic " + super.toString();
    }
}

class ElectricMotor extends Motor {
    // write your code here ...
    public ElectricMotor(String model, long power) {
        super(model, power);
    }

    @Override
    public String toString() {
        return "Electric " + super.toString();
    }
}

class WarpDrive extends Motor {
    // write your code here ...
    public WarpDrive(String model, long power) {
        super(model, power);
    }

    @Override
    public String toString() {
        return "Warp drive " + super.toString();
    }
}

class MotorFactory {

    /**
     * It returns an initialized motor according to the specified type by the first character:
     * 'P' or 'p' - pneumatic, 'H' or 'h' - hydraulic, 'E' or 'e' - electric, 'W' or 'w' - warp.
     */
    public static Motor make(char type, String model, long power) {
        // write your code here ...
        switch (type) {
            case 'e':
            case 'E':
                return new ElectricMotor(model, power);
            case 'W':
                return new WarpDrive(model, power);
            case 'H':
                return new HydraulicMotor(model, power);
            case 'P':
                return new PneumaticMotor(model, power);
            default:
                return null;
        }
    }
}

public class TestDrive {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final char type = scanner.next().charAt(0);
        final String model = scanner.next();
        final long power = scanner.nextLong();
        // write your code here ...
        scanner.close();
        Motor motor = MotorFactory.make(type, model, power);

        System.out.println(motor);
    }
}
