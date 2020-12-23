package com.company.RuntimeTipeChecking;

import java.util.List;

public class SortClasses {
    public static void sortShapes(Shape2[] array,
                                  List<Shape2> shapes,
                                  List<Polygon> polygons,
                                  List<Square> squares,
                                  List<Circle> circles) {
        // write your code here ordenando las clases, si es de algun tipo listado se inserta en su lista respectivaa
        for (Shape2 someShape : array) {
            if (someShape.getClass() == Shape2.class) {
                shapes.add(someShape);
            } else if (someShape.getClass() == Polygon.class) {
                polygons.add((Polygon) someShape);
            } else if (someShape.getClass() == Square.class) {
                squares.add((Square) someShape);
            } else if (someShape.getClass() == Circle.class) {
                circles.add((Circle) someShape);
            }
        }
    }
}

//Don't change classes below
class Shape { }
class Polygon extends Shape2 { }
class Square extends Polygon { }
class Circle extends Shape2 { }