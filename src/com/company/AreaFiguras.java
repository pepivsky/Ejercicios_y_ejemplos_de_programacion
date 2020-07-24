package com.company;

import java.util.Scanner;

public class AreaFiguras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String roomType = scanner.next();
        double a = 0;
        double b = 0;
        double c = 0;
        double r = 0;

        switch (roomType) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                System.out.println((a + b + c) / 2);
                double result  = (a + b + c) / 2;
                System.out.println(Math.sqrt(result * (result - a) * (result - b) * (result - c)));
                //System.out.println((a * b) / 2);
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println(a * b);
                break;
            case "circle":
                r = scanner.nextDouble();
                System.out.println(Math.pow(r,2) * 3.14);
                break;
        }
    }
}
