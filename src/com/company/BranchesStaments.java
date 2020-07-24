package com.company;

import java.util.Scanner;

public class BranchesStaments {
    public static void main(String[] args) {
/*
Write a program that reads a sequence of integer numbers in a loop and adds up all numbers. If a new number is equal to 0, the program must stop the loop and output the accumulated sum. When the sum is equal or exceeded 1000 (the barrier), the program should also stop and output the value equal to sum – 1000.

Note, the input can contain extra numbers. Just ignore them.

Sample Input 1:

800
101
102
300
0
Sample Output 1:

3
Sample Input 2:

103
105
109
0
1000
Sample Output 2:

317
**/
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;

        do {
            num = scanner.nextInt();
            if (sum >= 1000) {
                continue;
            }
            sum = sum + num;
        }while (num != 0);
        if(sum >= 1000){
            sum -= 1000;
        } else if (sum < 1000) {
            num = scanner.nextInt();
        }
        System.out.println(sum);






    }
}
