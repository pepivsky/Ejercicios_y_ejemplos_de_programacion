package com.company;

public class Metodos {

}
/*
You want to create a program that models the behavior of cars. For this purpose, you've created a class named Car containing three fields: the int field yearModel, the string field make, and the int field speed.

You want to add functionality to your cars, so you need methods. Add the following instance methods to your class:

void accelerate() that adds 5 to the speed each time it's called;
void brake() that subtracts 5 from the speed field each time it's called,
the speed cannot be less than zero.

* */
class Car {

    int yearModel;
    String make;
    int speed;

    public void accelerate() {
        this.speed += 5;
    }
    public void  brake() {
        this.speed = Math.max(this.speed -5, 0); //Le resta 5 a la velocidad y no puede
        //ser menor que cero
        /*if (this.speed >= 5) {
            this.speed -= 5;
        }*/
    }
}
