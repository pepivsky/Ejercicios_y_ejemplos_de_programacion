package com;

import java.util.Arrays;
import java.util.Scanner;

public class LeerStringPorPartes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split("\\s"); // divide el string por espacios
        System.out.println(Arrays.toString(parts));
    }
}
