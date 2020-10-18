import java.util.Scanner;

public class TensDigit {
    /**
     * Write a program that finds the tens digit in a non-negative integer N (0 ≤ N ≤ 1000000).
     *
     * Take a look at the examples:
     *
     * If N is 264, the tens digit is 6.
     *
     * If N is 4136, the tens digit is 3.
     *
     * If N is 101, the tens digit is 0.
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        char nTens = '0';

        if (number.length() == 6) {
            nTens = number.charAt(4);
        } else if (number.length() == 5) {
            nTens = number.charAt(3);
        } else if (number.length() == 4) {
            nTens = number.charAt(2);
        } else if (number.length() == 3) {
            nTens = number.charAt(1);
        } else if (number.length() == 2) {
            nTens = number.charAt(0);
        }
        System.out.println(nTens);

        //****************************
        //otra solucion
        /*int value = scanner.nextInt();
        System.out.println(value % 100 / 10);*/
    }
}
