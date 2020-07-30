package com.company.challenge100Days;

import java.security.SecureRandom;
import java.util.ArrayList;

import java.util.Scanner;

/*Reto:
* Lleva un registro del orden en el que aparecieron los caracteres
* */
public class MemoryV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] allowedCharacters = "\"#$%()/&".toCharArray();
        StringBuffer cadena = new StringBuffer();
        SecureRandom random = new SecureRandom();
        ArrayList<String> arrayOrden = new ArrayList<>();
        int salir = 0;

        while (salir != 1) {
            for (int i = 0; i < 4; i++) {
                cadena.append(allowedCharacters[ random.nextInt(allowedCharacters.length) ]);
            }
            arrayOrden.add(cadena.toString());
            System.out.println(cadena);
            cadena.delete(0, cadena.length()); // reiniciar el StringBuffer
            System.out.println("Desea generar otra cadena de texto? (ingrese 1 para salir o 2 para seguir con el programa)");
            salir = scanner.nextInt();
        }
        System.out.println("El orden fue: "+ arrayOrden.toString());


    }
}