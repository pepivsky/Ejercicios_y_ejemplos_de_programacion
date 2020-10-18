import java.util.Arrays;
import java.util.Scanner;
/**
 * Reversing
 * Write a program that reads a three-digit number, calculates the new number by reversing its digits, and outputs a new number.
 *
 *
 * Sample Input:
 * 320
 *
 * Sample Output:
 * 23
 *
 *
 * Sample Input:
 * 976
 *
 * Sample Output:
 * 679
 * */
public class ReversingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        char[] charArrayNumber = new char[3];
        charArrayNumber = number.toCharArray();

        char num1 = charArrayNumber[0];
        char num2 = charArrayNumber[1];
        char num3 = charArrayNumber[2];

        System.out.println(Arrays.toString(charArrayNumber));
        if (num3 == '0') {
            System.out.println(num2 + "" + num1);
        } else {
            System.out.println(num3 + "" + num2 + "" + num1);
        }
    }
}
