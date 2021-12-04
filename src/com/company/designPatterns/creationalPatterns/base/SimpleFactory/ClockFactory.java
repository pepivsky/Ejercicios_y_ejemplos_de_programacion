package com.company.SimpleFactory;
import java.util.Scanner;
/* Ejemplo de simpke factory, (una clase con un metodo para crear objetos)
Clock factory
There is a hierarchy of clocks with the base interface Clock and the class ClockFactory to produce instances.

Implement the method produce of the factory. It should return a clock according to the specified type string:

"SAND" is for SandClock;
"DIGITAL" is for DigitalClock;
"MECH" is for MechanicalClock.
The single constructor of the factory takes the boolean parameter produceToyClock. It determines what the factory does when an unsuitable type of clock is passed. If it is true, the factory should produce an instance of ToyClock, otherwise, return null.

Do not change the provided code of the clock classes.
 */
class ClockFactory {

    private boolean produceToyClock;

    public ClockFactory(boolean produceToyClock) {
        this.produceToyClock = produceToyClock;
    }

    /**
     * It produces a clock according to a specified type: SAND, DIGITAL or MECH.
     * If some other type is passed, the method produces ToyClock.
     */
    public Clock produce(String type) {
        // write your code here
        switch (type.toUpperCase()) {
            case "SAND":
                return new SandClock();
            case "DIGITAL":
                return new DigitalClock();
            case "MECH":
                return new MechanicalClock();
            default:
                return produceToyClock ? new ToyClock() : null; //revisa el booleano, si es true crea el objeto sino, regresa null
        }
    }
}

/* Do not change code below */
interface Clock {

    void tick();
}

class SandClock implements Clock {

    @Override
    public void tick() {
        System.out.println("...sand noise...");
    }
}

class DigitalClock implements Clock {

    @Override
    public void tick() {
        System.out.println("...pim...");
    }
}

class MechanicalClock implements Clock {

    @Override
    public void tick() {
        System.out.println("...clang mechanism...");
    }
}

class ToyClock implements Clock {

    @Override
    public void tick() {
        System.out.println("...tick...");
    }
}

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String type = scanner.next();
        final boolean produceToy = scanner.nextBoolean();
        final ClockFactory factory = new ClockFactory(produceToy);
        final Clock clock = factory.produce(type);
        if (clock == null) {
            System.out.println(clock);
        } else {
            clock.tick();
        }
    }
}