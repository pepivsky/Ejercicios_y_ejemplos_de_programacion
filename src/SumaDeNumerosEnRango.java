import java.util.Scanner;
import java.util.stream.LongStream;

/*
mplement a method sumInRange for calculating the sum of numbers in the range from (inclusive), to (exclusive).

 Report a typo
Sample Input 1:

1 2
Sample Output 1:

1
Sample Input 2:

5 5
Sample Output 2:

0
Sample Input 3:

10 15
Sample Output 3:

60
 */
public class SumaDeNumerosEnRango {
    public static long sumInRange(int from, int to) {
        long sum = 0;
        for (int i = from; i < to; i++) {
            sum += i;
        }
        return sum;
    }
    //otra solucion
    public static long sumInRangeOtraSolucion(int from, int to) {
        // write your code here
        return LongStream.range(from, to).sum(); //suma los numeros en un rango
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int from = scanner.nextInt();
        int to = scanner.nextInt();

        System.out.println(sumInRange(from, to));
    }
}
