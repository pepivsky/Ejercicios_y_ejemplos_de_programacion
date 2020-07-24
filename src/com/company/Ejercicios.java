package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios {
    public static boolean checkArrayContains(int[] array, int number) {
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }

    public static int findPosition(int[] array, int number) {
        int index = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == number) {
                index = i;
                //return index;
            }
        }
        return index;
    }
    public static boolean nextTo(int[] array, int pos, int val) {
        int length = array.length-1;
        int nextPosition = pos+1;
        if (nextPosition <= length) {
            if (array[pos+1] == val) {
                return true;
            }
        } else if (array[pos-1] == val){

            return true;
        } else {
            return false;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int element = 0;
        int[] array = new int[size];
        int n1;
        int n2;
        int indice = 1;
        boolean containsN1;
        boolean containsN2;
        int indexN1 = 0;
        int indexN2 = 0;
        //int position = 0;
        boolean flag;

        for (int i = 0; i < size ; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        //System.out.println(array[indice+1]); //imprimir el valor siguiente del array

        containsN1 = checkArrayContains(array,n1);
        containsN2 = checkArrayContains(array,n2);
        if (containsN1 && containsN2) {
            System.out.println("contiene los dos elementos");
            indexN1 = findPosition(array, n1);
            indexN2 = findPosition(array, n2);
            System.out.println(indexN1);
            System.out.println(indexN2);
            if (nextTo(array,indexN1,n2) || nextTo(array,indexN2,n1)) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
            /*if (nextTo(array,indexN1) || nextTo(array,indexN2)) {
                System.out.println("if");
                flag = false;
            } else {
                flag = true;
                System.out.println(true);
            }*/

        } else if (!containsN1) {
            System.out.println("No contiene el primer elemento");
        } else if (!containsN2) {
            System.out.println("No contiene el segundo elemento");
            System.out.println("true");

        }

        /*Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        String num = "";

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt(); // read the next number of the array
        }
        num = scanner.next();
        if (Arrays.toString(numbers).contains(num)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }*/


    }
}
