package com.company.designPatterns.creationalPatterns.abstractFactory.phoneFactory;

class TestDrive {
    public static void main(String[] args) throws InterruptedException {
        Phone phone;

        /* write your code here */
        PhoneFactory iphoneFactory = new IphoneFactory();
        /* write your code here */
        PhoneFactory samsungFactory = new SamsungFactory();

        System.out.println("-Hello, I need Android phone");
        System.out.println("-Okay! Please wait for a sec, - Calling to the SamsungFactory. -Bring me the Samsung Galaxy S10");
        Thread.sleep(1500);

        /* write your code here */
        phone = samsungFactory.createPhone();
        System.out.println(phone.getDescription());
        System.out.println("There it is!\n");

        System.out.println("-Hello, I need iOS phone");
        System.out.println("-Okay! Please wait for a sec, - Calling to the iPhoneFactory. -Bring me the iPhoneXS\"");
        Thread.sleep(1500);

        /* write your code here */
        phone = iphoneFactory.createPhone();
        System.out.println(phone.getDescription());
        System.out.println("There it is!");
    }
}

interface PhoneFactory {
    Phone createPhone();
}

class IphoneFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        /* write your code here */
        PhoneDetailsFactory detailsFactory = new IphoneDetailsFactory();
        /* write your code here */
        return new Iphone(detailsFactory);
    }
}

class SamsungFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        /* write your code here */
        PhoneDetailsFactory detailsFactory = new SamsungDetailsFactory();
        /* write your code here */
        return new Samsung(detailsFactory);
    }
}

interface PhoneDetailsFactory {
    Camera createCamera();
    Display createDisplay();
    Processor createProcessor();
    Security createSecurity();
}

class IphoneDetailsFactory implements PhoneDetailsFactory {
    @Override
    public Camera createCamera() {
        /* write your code here */
        return new IphoneCamera();
    }

    @Override
    public Display createDisplay() {
        /* write your code here */
        return new IphoneDisplay();
    }

    @Override
    public Processor createProcessor() {
        /* write your code here */
        return new IphoneProcessor();
    }

    @Override
    public Security createSecurity() {
        /* write your code here */
        return new IphoneSecurity();
    }
}

class SamsungDetailsFactory implements PhoneDetailsFactory {
    @Override
    public Camera createCamera() {
        /* write your code here */
        return new SamsungCamera();
    }

    @Override
    public Display createDisplay() {
        /* write your code here */
        return new SamsungDisplay();
    }

    @Override
    public Processor createProcessor() {
        /* write your code here */
        return new SamsungProcessor();
    }

    @Override
    public Security createSecurity() {
        /* write your code here */
        return new SamsungSecurity();
    }
}

abstract class Phone {
    Camera camera;
    Display display;
    Processor processor;
    Security security;

    public abstract String getDescription();

    public String toString() {
        return "Camera: " + camera.toString() + "\n"
                + "Display: " + display.toString() + "\n"
                + "Processor: " + processor.toString() + "\n"
                + "Security: " + security.toString();
    }
}

class Iphone extends Phone {
    Iphone(PhoneDetailsFactory detailsFactory) {
        /* write your code here */
        camera = detailsFactory.createCamera();
        /* write your code here */
        display = detailsFactory.createDisplay();
        /* write your code here */
        processor = detailsFactory.createProcessor();
        /* write your code here */
        security = detailsFactory.createSecurity();
    }

    @Override
    public String getDescription() {
        return "This is THE iPhoneXs\n" + super.toString();
    }
}

class Samsung extends Phone {
    Samsung(PhoneDetailsFactory detailsFactory) {
        /* write your code here */
        camera = detailsFactory.createCamera();
        /* write your code here */
        display = detailsFactory.createDisplay();
        /* write your code here */
        processor = detailsFactory.createProcessor();
        /* write your code here */
        security = detailsFactory.createSecurity();
    }

    @Override
    public String getDescription() {
        return "Samsung Galaxy S10\n" + super.toString();
    }
}

interface Camera {
    String toString();
}

class IphoneCamera implements Camera {
    @Override
    public String toString() {
        return "12MP";
    }
}

class SamsungCamera implements Camera {
    @Override
    public String toString() {
        return "16MP+12MP+12MP";
    }
}

interface Display {
    String toString();
}

class IphoneDisplay implements Display {
    @Override
    public String toString() {
        return "5.8\" OLED";
    }
}

class SamsungDisplay implements Display {
    @Override
    public String toString() {
        return "6.1\" Dynamic AMOLED";
    }
}

interface Processor {
    String toString();
}

class IphoneProcessor implements Processor {
    @Override
    public String toString() {
        return "A12";
    }
}

class SamsungProcessor implements Processor {
    @Override
    public String toString() {
        return "Exynos 9820";
    }
}

interface Security {
    String toString();
}

class IphoneSecurity implements Security {
    @Override
    public String toString() {
        return "FaceID";
    }
}

class SamsungSecurity implements Security {
    @Override
    public String toString() {
        return "FingerPrint";
    }
}