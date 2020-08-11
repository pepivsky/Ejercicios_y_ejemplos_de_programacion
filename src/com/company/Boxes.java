package com.company;

import java.util.Arrays;
import java.util.Scanner;
/**
 * There are two boxes on the table. The first box has a size of X1 x Y1 x Z1, and the second box has a size of X2 x Y2 x Z2. You need to determine which box can be put inside another box. You can rotate both boxes as you want.
 *
 *
 * Input contains two lines.
 * The first line contains numbers X1, Y1, Z1, the second line contains numbers X2, Y2, Z2. All numbers are integers and greater than 0.
 *
 * If the sizes of the boxes are equal, output "Box 1 = Box 2".
 *
 * If the first box can be put inside the second box, output "Box 1 < Box 2".
 *
 * If the second box can be put inside the first box, output "Box 1 > Box 2".
 *
 * If none of the boxes can be put inside the other box, output "Incomparable".
 *
 * Sample Input 1:
 *
 * 1 1 1
 * 2 2 2
 * Sample Output 1:
 *
 * Box 1 < Box 2
 * Sample Input 2:
 *
 * 2 2 2
 * 1 2 2
 * Sample Output 2:
 *
 * Box 1 > Box 2
 * Sample Input 3:
 *
 * 1 2 3
 * 2 3 1
 * Sample Output 3:
 *
 * Box 1 = Box 2
 * Sample Input 4:
 *
 * 2 3 4
 * 1 3 5
 * Sample Output 4:
 *
 * Incomparable
 *
 *
 * **/
public class Boxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] box1 = new int[3];
        int[] box2 = new int[3];

        for (int i = 0; i < box1.length; i++) {//llenar el primer arreglo
            box1[i] = scanner.nextInt();
        }
        for (int i = 0; i < box2.length; i++) {//llenar segundo arreglo
            box2[i] = scanner.nextInt();
        }

        int min1 = Arrays.stream(box1).min().getAsInt();//obtener valor minimo y maxmimo del array
        int max1 = Arrays.stream(box1).max().getAsInt();

        int min2 = Arrays.stream(box2).min().getAsInt();
        int max2 = Arrays.stream(box2).max().getAsInt();


        if ((min1 > min2 && max1 < max2) || (min2 > min1 && max2 < max1)) {//una caja no cabe en la otra
            System.out.println("Incomparable");
        } else {
            if (min1 < min2 || max1 < max2) {//se evaluan los valores minimos y maximos apra saber si una caja cabe dentro de otra
                System.out.println("Box 1 < Box 2");
            } else if (min1 == min2 && max1 == max2) {
                System.out.println("Box 1 = Box 2");
                //System.out.println("Box 1 > Box 2");
            } else if (min1 > min2 || max1 > max2) {
                System.out.println("Box 1 > Box 2");
            }
        }


        /*System.out.println(Arrays.toString(box1));
        System.out.println("min:" + min1 + " max:" + max1);
        System.out.println(Arrays.toString(box2));*/

    }
}
