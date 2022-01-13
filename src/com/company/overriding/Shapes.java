package com.company.overriding;
/* Ejemplo de sobre escrotura de metodos
You have five classes: Shape, Triangle, Circle, Square, and Rectangle. The class Shape has a method area(). This method does nothing. Override the method in all subclasses. Overridden methods should return an area of a particular figure. Use class fields for this.

The area of a triangle is S = bh / 2S=bh/2 where hh is the height of the triangle, bb is the base of the triangle.

The area of a circle is S = \pi R^2S=πR
2
  where RR is the radius of the circle. For \piπ use the Math.PI constant.

The area of a square is S = s^2S=s
2
  where ss is the length of the side of the square.

The area of a rectangle is S = whS=wh where ww is the width of the rectangle and hh the height of the rectangle.


 */
public class Shapes {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.base = 2;
        triangle.height = 6;
        System.out.println(triangle.area()); // 6

        Circle circle = new Circle();
        circle.radius = 6;
        System.out.println(circle.area()); //113

        Square square = new Square();
        square.side = 4;
        System.out.println(square.area()); // 16

        Rectangle rectangle = new Rectangle();
        rectangle.height = 8;
        rectangle.width = 7;
        System.out.println(rectangle.area()); // 56.0

    }
}


class Shape {
    public double area() {
        return 0;
    }
}

class Triangle extends Shape {
    double height;
    double base;

    // override the method here

    @Override
    public double area() {
        return (base * height) / 2;
    }
}

class Circle extends Shape {
    double radius;

    // override the method here

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    double side;

    // override the method here

    @Override
    public double area() {
        return side * side;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    // override the method here

    @Override
    public double area() {
        return width * height;
    }
}