package com.company.challenge100Days;

import java.security.SecureRandom;
//Crea un código que te muestre 4 caracteres entre los siguientes de forma aleatoria: "#$%()/&

public class Memory {
    public static void main(String[] args) {
        char[] allowedCharacters = "\"#$%()/&".toCharArray();
        StringBuffer cadena = new StringBuffer();
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < 4; i++) {
            cadena.append(allowedCharacters[ random.nextInt(allowedCharacters.length) ]);
        }
        System.out.println(cadena);
    }
}
