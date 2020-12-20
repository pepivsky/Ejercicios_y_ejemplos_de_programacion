package com.company;
/* Creando un enum con una variable asociada a cada constante, un metodo get y un constructor
Danger levels

You are given an enum named DangerLevel.

Add an integer field to store danger levels and match the number with each constant:

HIGH — 3
MEDIUM — 2
LOW — 1
You should also add the instance method getLevel that returns the associated integer number.

After your modifications, the following code should be compiled and work correctly:

DangerLevel high = DangerLevel.HIGH;
DangerLevel medium = DangerLevel.MEDIUM;

System.out.println(high.getLevel() > medium.getLevel()); // true
 */
public class DangerLevels {
}

enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    public final int level;

    DangerLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
