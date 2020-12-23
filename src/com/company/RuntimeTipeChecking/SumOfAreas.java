package com.company.RuntimeTipeChecking;

public class SumOfAreas {
   /* public static int sumOfAreas(Shape[] array) {
        int result = 0;
        for (Shape someShape : array) {
            if (someShape.getClass() == Square2.class) {
                result = result + (((Square2) someShape).getSide() * ((Square2) someShape).getSide());
            } else if (someShape.getClass() == Rectangle2.class) { //para poder obtener un atributo hay que castear primero el objeto para que funcione como tal
                result = result + ((Rectangle2) someShape).getWidth() * ((Rectangle2) someShape).getHeight();
            }
        }
        return result;
    }*/
}


//Don't change the code below
class Shape2 {
}

class Square2 extends Shape2 {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}

class Rectangle2 extends Shape2 {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
