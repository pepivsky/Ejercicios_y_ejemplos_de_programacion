package com.company.designPatterns.behavioralPatterns.command.undoCommand;

/* ejemplo de patron de disenio command
Undo command
Wow! This problem is kind of tricky. If you're ready to put your thinking cap on, brace yourself and good luck! Otherwise, you can skip it for now and return any time later
Write two classes which represent the Command pattern, CommandMove and CommandPutItem.

These classes should also support undo. They should implement the entity movement on the 2D and item putting. The x-axis on the map goes from left to right, the y-axis goes from bottom to top.

The inventory of the entity has getInventoryLength() slots starting from 0, and each slot can contain only one item. The entity should put an item into a slot with least possible index (slots with nothing inside is null). If all slots of an entity are filled with some item, then entity should not place this item in its inventory.

To undo, you should revert the changes made to the entity, so the coordinates and the inventory of the entity before execute() and after undo() should be the same.

Note that you need to implement CommandMove and CommandPutItem classes only. You are free to add any new fields and use them. No need to implement Movable and Storable interfaces and set entity fields of command classes. The testing system does it for you.

Command moveCommand = new CommandMove(); // Testing system creates instance of CommandMove
moveCommand.entity = new TestMovable(); // and initializes entity field by testing entity

// then tested methods are invoked
moveCommand.execute();
moveCommand.undo();
The same logic works for testing CommandPutItem class.

There is no input data in this problem. Downloading the tests will give you an empty file.
 */

interface Movable {

    int getX();

    int getY();

    void setX(int newX);

    void setY(int newY);
}

interface Storable {

    int getInventoryLength();

    String getInventoryItem(int index);

    void setInventoryItem(int index, String item);
}

interface Command {

    void execute();

    void undo();
}

class CommandMove implements Command {
    Movable entity;
    int xMovement;
    int yMovement;

    @Override
    public void execute() {
        entity.setX(entity.getX() + xMovement);
        entity.setY(entity.getY() + yMovement);
    }

    @Override
    public void undo() {
        entity.setX(entity.getX() - xMovement);
        entity.setY(entity.getY() - yMovement);
    }
}

class CommandPutItem implements Command {
    Storable entity;
    String item;
    int index;

    @Override
    public void execute() {
        for (int i = 0; i < entity.getInventoryLength(); i++) {
            if (entity.getInventoryItem(i) == null) {
                entity.setInventoryItem(i, item);
                index = i;
                break;
            }
        }
    }

    @Override
    public void undo() {
        entity.setInventoryItem(index, null);
    }
}

public class TestDrive {
    public static void main(String[] args) {
        Command commandMove = new CommandMove();
        //commandMove.
    }
}



