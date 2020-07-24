package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        /*int[] numbers = { 1, 2, 3, 4 }; // instantiating and initializing an array of 1, 2, 3, 4
        //int[] numbers2 = [3];

        int[] serie = new int[4];

        float[] floatNumbers = new float[] { 1.02f, 0.03f, 4f }; // instantiation and initialization

        byte[] famousNumbers = { 0, 1, 2, 4, 8, 16, 32, 64 };
        String arrayAsString = Arrays.toString(famousNumbers); // [0, 1, 2, 4, 8, 16, 32, 64]
        System.out.println(arrayAsString);
        System.out.println(arrayAsString.replace(" ", "a"));
        //System.out.println(Integer.MAX_VALUE);

        long[] bigNumbers = { 200000000L, 400000000L, 100000000L, 300000000L }; // it's unsorted
        System.out.println(Arrays.toString(bigNumbers));
        Arrays.sort(bigNumbers); // sorting whole array
        System.out.println(Arrays.toString(bigNumbers)); // [100000000, 200000000, 300000000, 400000000]

        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = 1;
        System.out.println(arr[n]);
        n = arr[arr[n]];
        System.out.println(n);

        char[] characters = {'a', 'z', 'e', 'd'};
        System.out.println(Arrays.toString(characters));
        //Array de longs
        long[] longNumbers = {100_000_000_001L, 100_000_000_002L, 100_000_000_003L};//hay que ponerle "L" al final
        System.out.println(Arrays.toString(longNumbers));
        /*
long/ Long numbers end with capital L
float/ Float numbers end with capital F
double/ Double numbers end with capital D
Remember these 3 and remember to apply the first letter of the number type you're referencing and apply it to the end of the number with that
* */
        //Programa que revisa si el los elementos del array están en orden ascendente
        /*int[] numbers = { 1, 2, 3, 4, 5, 10, 6 }; // the order is broken

        boolean broken = false; // suppose the array is well-ordered
        int j = 1;
        System.out.println(numbers[j] + " " + numbers[j - 1]);
        //iterating over the array
        for (int i = 1; i < numbers.length; i++) {
            // if the order is broken
            if (numbers[i] < numbers[i - 1]) { //2 < 1
                broken = true; // write a result
                break;         // terminate the loop
            }
        }

        if (broken) {
            System.out.println("BROKEN");
        } else {
            System.out.println("OK");
        }*/

        //Programa que lee un array desde la entrada del usuario y lo llena
        /*Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt(); // reading a length
        int[] array = new int[len];  // creating an array with the specified length

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt(); // read the next number of the array
        }

        System.out.println(Arrays.toString(array)); // output the array*/

        /*
        //Programa que suma el cudrado de los indices
        int [] numbers = { 1, 2, 3 };
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        //foreach
        /*
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);*/

        /**The product of numbers from a to b Open on JetBrains Academy

         Write a program that prints the product of all integer numbers from a to b ( a < b).
         Include a and exclude b from the product.


         Sample Input:
         1 2
         Sample Output:
         1

         Sample Input:
         100 105
         Sample Output:
         11035502400

         */

        //Producto de los números entre los rangos dados
        /*Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        for (long i = a + 1; i < b; i++) {
            a = a * i;
        }
        System.out.println(a);*/

        //Largo de un arreglo
/***
 * For its input, the program gets a sequence of non-negative integers; each integer is written in a separate line. The sequence ends with an integer 0; when the program reads 0, it should end its work and output the length of the sequence (not counting the final 0).
 *
 * Don’t read numbers following the number 0.
 *
 * Sample Input 1:
 *
 * 1
 * 7
 * 9
 * 0
 * 5
 * Sample Output 1:
 *
 * 3
 * ***/
        /*Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int number = 1;

        while (number != 0) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            } else {
                arrayList.add(number);
            }
        }
        System.out.println(arrayList.size());*/
        /********************************************/
        //Comparar dos arreglos
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int [] array = new int[length];
        int [] orderedArray;

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        //System.arraycopy(array ,array[0], orderedArray, orderedArray[0], length);
        //Arrays.sort(orderedArray);
        orderedArray = array.clone(); //copiar un array en otro
        Arrays.sort(orderedArray);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(orderedArray));
        System.out.println(array);
        System.out.println(orderedArray);


        if (Arrays.equals(array, orderedArray)) { //Comparar dos arrays
            System.out.println("true");
        } else {
            System.out.println("false");
        }



    }
}
