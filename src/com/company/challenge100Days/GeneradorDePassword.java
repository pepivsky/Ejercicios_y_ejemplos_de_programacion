package com.company.challenge100Days;

import java.security.SecureRandom;
import java.util.Scanner;

public class GeneradorDePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] allowedCharacters = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789".toCharArray();
        char[] specialCharacters = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ!\"#$%&'()*+,-./:;=?@ {|}~_".toCharArray();
        SecureRandom random = new SecureRandom();
        StringBuffer password = new StringBuffer();

        System.out.println("Generador de contraeñas");
        System.out.println("Ingresa la longitud que deseas que tenga tu contraseña");
        int length = scanner.nextInt();
        System.out.println("Ingresa 1 si quieres que la contraseña contenga " +
                "caracteres especiales o 2 para que no los contenga");
        int specials = scanner.nextInt();

        if (specials == 1) {
            for (int i = 0; i < length; i++) {
                password.append(specialCharacters[ random.nextInt(specialCharacters.length) ]);
            }
        } else {
            for (int i = 0; i < length; i++) {
                password.append(allowedCharacters[ random.nextInt(allowedCharacters.length) ]);
            }
        }
        System.out.println(password);
    }
}
