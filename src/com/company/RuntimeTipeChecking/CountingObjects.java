package com.company.RuntimeTipeChecking;

public class CountingObjects {
    public static void main(String[] args) {

        MyShape[] shapes = new MyShape[]{  new MyShape(), new MyShape2D(), new MyCircle(), new MyShape2DSub1() };
        System.out.println(Counter.count2DShapes(shapes));
    }
}

class Counter {

    public static int count2DShapes(MyShape[] shapes) {
        int counterShapes2D = 0;
        for (MyShape shape : shapes) {
            // if que revisa que los objetos sean solo subclases de MyShape2D (pero no MyShape2D)
            if (shape.getClass() == MyCircle.class ||
                    shape.getClass() == MyShape2DSub1.class ||
                    shape.getClass() == MyShape2DSub2.class) {
                counterShapes2D++;
            }
            /* otra solucion
            // revisa que sea instancia de Shape2D y a la vez que sea diferente de Shape2D, es decir solo sus subclases
            if (s instanceof MyShape2D && s.getClass() != MyShape2D.class) {
                counter++;
            }
             */
        }
        return counterShapes2D;
    }
}

// Don't change the code below

class MyShape {
}

class MyShape2D extends MyShape {
}

class Shape3D extends MyShape {
}


class MyCircle extends MyShape2D {
}

class MyShape2DSub1 extends MyShape2D {
}

class MyShape2DSub2 extends MyShape2D {
}


class Cube extends Shape3D {
}

class Shape3DSub1 extends Shape3D {
}

class Shape3DSub2 extends Shape3D {
}
