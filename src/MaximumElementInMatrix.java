import java.util.Scanner;
/**
 * Maximum element in a matrix
 * Find the indexes of the initial appearance of the maximum element in a matrix.
 *
 * Input data format
 *
 * On the input, the program receives the size of matrix n and m, and then n lines having m integer numbers in each. n and m do not exceed 100.
 *
 * Output data format
 *
 * Output two numbers: the row index and the column index, in which the greatest item in the two-dimensional array (matrix) is located. If there are several such elements, output the one, which has the smaller row index; and if row indexes are the same, output the one having the smaller column index.
 *
 *
 * Sample Input:
 * 3 4
 * 0 3 2 4
 * 2 3 5 5
 * 5 1 2 3
 *
 * Sample Output:
 * 1 2
 *
 *
 * Sample Input:
 * 2 2
 * -3 -2
 * -2 -1
 *
 * Sample Output:
 * 1 1
 * */
public class MaximumElementInMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int max = Integer.MIN_VALUE; //comparar contra el valor menor de un entero para que pueda encontrar el mayor entre numeros negativos
        int indexF = 0;
        int indexC = 0;

        Integer[][] matrix = new Integer[n][m];

        //llenando la matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        //imprimiendo
        int aux = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
                if (matrix[i][j] > max) { //si el elemento actual es mayor que max entonces se convierte en el mayor
                    max = matrix[i][j];
                    indexF = i;
                    indexC = j;
                }
            }
            System.out.println();
        }

        System.out.println(max);
        System.out.println(indexF + " " + indexC);
    }
}
