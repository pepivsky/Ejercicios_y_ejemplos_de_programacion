package com.company.arrayListEjemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
/* Concat positive numbers
Implement a method to concatenate all positive numbers of two input ArrayLists to a single resulting list.

At first, elements from the first ArrayList should go, and then the elements from the second ArrayList.

 Report a typo
Sample Input 1:

8 11 -2 -3 14 15
-1 33 12 -3 -5
Sample Output 1:

8 11 14 15 33 12
 */
public class UsandoRemoveIf {
    public static ArrayList<Integer> concatPositiveNumbers(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        l1.addAll(l2); //agregar todos los elementos a l1
        l1.removeIf(n -> n < 0); //remover los elementos si son menores que cero
        return l1; // write your code here
    }

    /* Do not modify this method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list1 = readArrayList(scanner);
        ArrayList<Integer> list2 = readArrayList(scanner);

        ArrayList<Integer> result = concatPositiveNumbers(list1, list2);

        result.forEach(n -> System.out.print(n + " "));
    }

    /* leer de consola y agregar al ArrayList */
    private static ArrayList<Integer> readArrayList(Scanner scanner) { //leer los elemetos del scanner por linea y devolver un nuevo ArrayList con esos elementos
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
