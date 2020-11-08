import java.util.Scanner;
/*
Write a program that reads an unsorted array of integers and two numbers n and m. The program must check if n and m occur next to each other in the array (in any order).

Input data format

The first line contains the size of an array.
The second line contains elements of the array.
The third line contains two integer numbers n and m.
All numbers in the same line are separated by the space character.

Output data format

Only a single value: true or false.
 Report a typo
Sample Input 1:

3
1 3 2
2 3
Sample Output 1:

true
Sample Input 2:

3
2 1 2
2 3
Sample Output 2:

false
 */
public class ElementosConsecutivosEnArrray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];
        int n = 0;
        int m = 0;
        boolean isNextTo = false;

        //llenando el array
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        m = scanner.nextInt();

        //recorriendo el arreglo
        for (int i = 1; i < size; i++) {
            if ((array[i - 1] == n && array[i] == m) || (array[i - 1] == m && array[i] == n)) {
                isNextTo = true;
            }
        }
        System.out.println(isNextTo);
    }
}
