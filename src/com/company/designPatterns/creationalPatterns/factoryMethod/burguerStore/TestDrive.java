package com.company.designPatterns.creationalPatterns.factoryMethod.burguerStore;
/* Ejemplo de patron de diseno factory method

urger store
In this task, you'll be asked to write almost a full working code by yourself. However, you can find some tips in the correct output and in parts of the code.

Let's create the BurgerStore. We will stick to the good old classic and simply create a burger with Bun, Cutlet and Sauce. Do not forget that FactoryMethod does not include details, it only knows the general creation process.


Sample Input:

Sample Output:
Making a Chinese Burger
Putting bun
Putting cutlet
Putting sauce
Done a Chinese Burger

Making a American Burger
Putting bun
Putting cutlet
Putting sauce
Done a American Burger

Making a Russian Burger
Putting bun
Putting cutlet
Putting sauce
Done a Russian Burger
 */
class TestDrive {
    public static void main(String[] args) throws InterruptedException {
        /* write your code here */
        final String chineseName = "Chinese Burger";
        final String americanName = "American Burger";
        final String russianName = "Russian Burger";

        BurgerStore burgerStore = new BurgerStore();

        burgerStore.orderBurger(chineseName);
        burgerStore.orderBurger(americanName);
        burgerStore.orderBurger(russianName);


        /*Burger chineseBurger = burgerStore.orderBurger(chineseName);
        Burger americanBurger = burgerStore.orderBurger(americanName);
        Burger russianBurger = burgerStore.orderBurger(russianName);*/
    }
}

// creator
abstract class BurgerFactory {

    public static final Long SLEEP_TIME = 1500L;

    abstract Burger createBurger(String type);

    Burger orderBurger(String type) throws InterruptedException {
        Burger burger = createBurger(type);
        if (burger == null) {
            System.out.println("Sorry, we are not able to create this kind of burger\n");
            return null;
        }
        System.out.println("Making a " + burger.getName());
        /* write your code here */
        burger.putBun();
        burger.putCutlet();
        burger.putSauce();
        Thread.sleep(SLEEP_TIME);
        System.out.println("Done a " + burger.getName() + "\n");
        return burger;
    }
}

// concrete creator
class BurgerStore extends BurgerFactory {
    @Override
    Burger createBurger(String type) {
        /* write your code here */
        switch (type) {
            case "Chinese Burger":
                return new ChineseBurger(type);
            case "American Burger":
                return new AmericanBurger(type);
            case "Russian Burger":
                return new RussianBurger(type);
            default:
                return null;
        }
    }
}

// Product
abstract class Burger {
    private String name;

    Burger(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void putBun() {
        System.out.println("Putting bun");
    }

    void putCutlet() {
        System.out.println("Putting cutlet");
    }

    void putSauce() {
        System.out.println("Putting sauce");
    }

    abstract void doSomethingElse();
}

// concrete product
class ChineseBurger extends Burger {
    /* write your code here */
    public ChineseBurger(String name) {
        super(name);
    }

    @Override
    void doSomethingElse() {
        // do something
    }
}

// concrete product
class AmericanBurger extends Burger {
    /* write your code here */
    public AmericanBurger(String name) {
        super(name);
    }

    @Override
    void doSomethingElse() {
        // do something
    }
}

// concrete product
class RussianBurger extends Burger {
    /* write your code here */
    RussianBurger(String name) {
        super(name);
    }

    @Override
    void doSomethingElse() {
        // do something
    }
}