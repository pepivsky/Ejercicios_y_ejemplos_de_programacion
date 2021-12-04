package com.company.designPatterns.creationalPatterns.abstractFactory.laptopFactory;
/* Ejemplo de patron diseno abstract factory
Laptop factory
In this task, you will be the owner of the LaptopFactory. You've got two customers who want to buy Windows and macOS laptops. You should provide these laptops by asking your factory to create them and writing some more code in your TestDrive class.

You need to fix lines marked by comments / write your code here /


Sample Input:

        Sample Output:
        -Hello, I need a Windows laptop
        -Okay! Please wait a sec, - Calling to the DellXPSFactory. -Bring me a Dell laptop
        This is a Dell XPS 9370
        Display: 13" FHD screen
        GraphicCard: Intel UHD 620 GPU
        Processor: Core i7
        SSD: 256Gb SSD
        There it is!

        -Hello, I need a macOS laptop
        -Okay! Please wait a sec, - Calling to the MacBookFactory. -Bring me a MacBook laptop
        This is a MacBook Pro 13"
        Display: 13" 4K display
        GraphicCard: Intel Iris Plus Graphics 640
        Processor: Dual-Core i5
        SSD: 256Gb SSD
        There it is!


 */
class TestDrive {
    public static void main(String[] args) throws InterruptedException {
        Laptop laptop;

        /* write your code here */
        LaptopFactory dellFactory = new DellXPSFactory();

        /* write your code here */
        LaptopFactory macbookFactory = new MacBookFactory();

        System.out.println("-Hello, I need a Windows laptop");
        System.out.println("-Okay! Please wait a sec, - Calling to the DellXPSFactory. " +
                "-Bring me a Dell laptop");

        /* write your code here */
        laptop = dellFactory.createComputer();
        System.out.println(laptop.getDescription());
        System.out.println("There it is!\n");

        System.out.println("-Hello, I need a macOS laptop");
        System.out.println("-Okay! Please wait a sec, - Calling to the MacBookFactory. " +
                "-Bring me a MacBook laptop");

        /* write your code here */
        laptop = macbookFactory.createComputer();
        System.out.println(laptop.getDescription());
        System.out.println("There it is!");
    }
}

interface LaptopFactory {
    Laptop createComputer();
}

class MacBookFactory implements LaptopFactory {
    @Override
    public Laptop createComputer() {
        LaptopDetailsFactory detailsFactory = new MacBookDetailsFactory();

        return new MacBook(detailsFactory);
    }
}

class DellXPSFactory implements LaptopFactory {
    @Override
    public Laptop createComputer() {
        LaptopDetailsFactory detailsFactory = new DellXPSDetailsFactory();

        return new DellXPS(detailsFactory);
    }
}

interface LaptopDetailsFactory {
    Display createDisplay();
    GraphicCard createGraphicCard();
    Processor createProcessor();
    SSD createSSD();
}

class MacBookDetailsFactory implements LaptopDetailsFactory {
    @Override
    public Display createDisplay() {
        return new MacBookDisplay();
    }

    @Override
    public GraphicCard createGraphicCard() {
        return new MacBookGraphicCard();
    }

    @Override
    public Processor createProcessor() {
        return new MacBookProcessor();
    }

    @Override
    public SSD createSSD() {
        return new MacBookSSD();
    }
}

class DellXPSDetailsFactory implements LaptopDetailsFactory {
    @Override
    public Display createDisplay() {
        return new DellXPSDisplay();
    }

    @Override
    public GraphicCard createGraphicCard() {
        return new DellXPSGraphicCard();
    }

    @Override
    public Processor createProcessor() {
        return new DellXPSProcessor();
    }

    @Override
    public SSD createSSD() {
        return new DellXPSSSD();
    }
}

abstract class Laptop {
    Display display;
    GraphicCard graphicCard;
    Processor processor;
    SSD ssd;

    abstract String getDescription();

    @Override
    public String toString() {
        return "Display: " + display.toString() + "\n"
                + "GraphicCard: " + graphicCard.toString() + "\n"
                + "Processor: " + processor.toString() + "\n"
                + "SSD: " + ssd.toString();
    }
}

class MacBook extends Laptop {

    MacBook(LaptopDetailsFactory detailsFactory) {
        display = detailsFactory.createDisplay();
        graphicCard = detailsFactory.createGraphicCard();
        processor = detailsFactory.createProcessor();
        ssd = detailsFactory.createSSD();
    }

    @Override
    public String getDescription() {
        return "This is a MacBook Pro 13\"\n" + super.toString();
    }
}

class DellXPS extends Laptop {

    DellXPS(LaptopDetailsFactory detailsFactory) {
        display = detailsFactory.createDisplay();
        graphicCard = detailsFactory.createGraphicCard();
        processor = detailsFactory.createProcessor();
        ssd = detailsFactory.createSSD();
    }

    @Override
    public String getDescription() {
        return "This is a Dell XPS 9370\n" + super.toString();
    }
}

interface Display {
    String toString();
}

class MacBookDisplay implements Display {

    @Override
    public String toString() {
        return "13\" 4K display";
    }
}

class DellXPSDisplay implements Display {
    @Override
    public String toString() {
        return "13\" FHD screen";
    }
}

interface GraphicCard {
    String toString();
}

class MacBookGraphicCard implements GraphicCard {
    @Override
    public String toString() {
        return "Intel Iris Plus Graphics 640";
    }
}

class DellXPSGraphicCard implements GraphicCard {
    @Override
    public String toString() {
        return "Intel UHD 620 GPU";
    }
}

interface Processor {
    String toString();
}

class MacBookProcessor implements Processor {

    @Override
    public String toString() {
        return "Dual-Core i5";
    }
}

class DellXPSProcessor implements Processor {
    @Override
    public String toString() {
        return "Core i7";
    }
}

interface SSD {
    String toString();
}

class MacBookSSD implements SSD {
    @Override
    public String toString() {
        return "256Gb SSD";
    }
}

class DellXPSSSD implements SSD {
    @Override
    public String toString() {
        return "256Gb SSD";
    }
}
