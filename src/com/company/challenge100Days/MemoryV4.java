package com.company.challenge100Days;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

/*Reto V3: Dale al usuario un menú para que elija en el orden correcto los caracteres

Reto V4: Crea el código para evaluar si el orden del usuario fue el mismo mostrado
 por el programa y decirle si ganó o en caso contrario si perdió
* */
public class MemoryV4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] allowedCharacters = "\"#$%()/&".toCharArray();
        StringBuffer cadena = new StringBuffer();
        SecureRandom random = new SecureRandom();
        ArrayList<String> arrayOrden = new ArrayList<>();
        int salir = 0;
        String cadenaUsuario;


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
        System.out.println("Ingresa la última cadena en el orden correcto");
        cadenaUsuario = scanner.next();
        if (arrayOrden.get(arrayOrden.size()-1).equals(cadenaUsuario)) {
            System.out.println("Ganaste! :)  el orden es el correcto");
        } else {
            System.out.println("Perdiste :(");
        }
        System.out.println();
        System.out.println("El orden fue: "+ arrayOrden.toString());
    }
}