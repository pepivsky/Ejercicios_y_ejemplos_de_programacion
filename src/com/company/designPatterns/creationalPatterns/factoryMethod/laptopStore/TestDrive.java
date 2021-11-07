package com.company.designPatterns.creationalPatterns.factoryMethod.laptopStore;
/* Ejemplo de patron de diseno factory method

Laptop store
The first part of the task is to imagine you are the boss of a LaptopStore. The real task though is the code: your engineer should be able to create 17'', 15'' or 13'' laptops without any concrete details.


Sample Input:

Sample Output:
Making a 13 inch Laptop
Attaching keyboard
Attaching trackpad
Attaching display
Done a 13 inch Laptop

Making a 15 inch Laptop
Attaching keyboard
Attaching trackpad
Attaching display
Done a 15 inch Laptop

Making a 17 inch Laptop
Attaching keyboard
Attaching trackpad
Attaching display
Done a 17 inch Laptop

Available laptops in the store:
13 inch Laptop
15 inch Laptop
17 inch Laptop


 */
class TestDrive {
    public static final String LAPTOP = " Laptop";

    public static void main(String[] args) throws InterruptedException {
        /* write your code here */
        LaptopStore laptopStore = new LaptopStore();

        Laptop laptop13 = laptopStore.orderLaptop("13 inch");
        Laptop laptop15 = laptopStore.orderLaptop("15 inch");
        Laptop laptop17 = laptopStore.orderLaptop("17 inch");

        System.out.println("Available laptops in the store:");
        System.out.println(laptop13 + LAPTOP);
        System.out.println(laptop15 + LAPTOP);
        System.out.println(laptop17 + LAPTOP);
    }
}

// creator
abstract class LaptopFactory {
    public static final Long SLEEP_TIME = 1500L;

    abstract Laptop createLaptop(String type);

    Laptop orderLaptop(String type) throws InterruptedException {
        Laptop laptop = createLaptop(type);
        if (laptop == null) {
            System.out.println("Sorry, we are not able to create this kind of laptop\n");
            return null;
        }
        System.out.println("Making a " + laptop.getName() + TestDrive.LAPTOP);
        laptop.attachKeyboard();
        laptop.attachTrackpad();
        laptop.attachDisplay();
        Thread.sleep(SLEEP_TIME);
        System.out.println("Done a " + laptop.getName() + TestDrive.LAPTOP + "\n");
        return laptop;
    }
}

// concrete creator
class LaptopStore extends LaptopFactory {
    @Override
    Laptop createLaptop(String type) {
        /* write your code here */
        switch (type) {
            case "13 inch":
                return new Laptop13(type);
            case "15 inch":
                return new Laptop15(type);
            case "17 inch":
                return new Laptop17(type);
            default:
                return null;
        }
    }
}

// product
class Laptop {
    private String name;

    Laptop(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void attachKeyboard() {
        System.out.println("Attaching keyboard");
    }

    void attachTrackpad() {
        System.out.println("Attaching trackpad");
    }

    void attachDisplay() {
        System.out.println("Attaching display");
    }

    @Override
    public String toString() {
        return name;
    }
}

// concrete product
class Laptop13 extends Laptop {
    Laptop13(String name) {
        super(name);
    }
}

// concrete product
class Laptop15 extends Laptop {
    Laptop15(String name) {
        super(name);
    }
}

// concrete product
class Laptop17 extends Laptop {
    Laptop17(String name) {
        super(name);
    }
}
