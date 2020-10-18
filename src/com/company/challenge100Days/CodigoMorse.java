package com.company.challenge100Days;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * Código Morse
 * El código morse te permite mandar señales mediante cualquier medio que pueda ser intermitente. Esto significa que puedes mandar señales a través de pulsos eléctricos (como en el telégrafo), audio, luz, etc. El reto del día de hoy es crear un decodificador de código morse. Por ejemplo:
 * hola mundo -> .... --- .-.. .- -- ..- -. -.. ---
 * ***/
public class CodigoMorse {
    public static void main(String[] args) {
        //Map clave y valor
        Map<Character, String> alphabetMorse = new HashMap<Character, String>();
        alphabetMorse.put('A', ".-");
        alphabetMorse.put('B', "-...");
        alphabetMorse.put('C', "-.-.");
        alphabetMorse.put('D', "-..");
        alphabetMorse.put('E', "-.");
        alphabetMorse.put('F', "..-.");
        alphabetMorse.put('G', "- -.");
        alphabetMorse.put('H', "....");
        alphabetMorse.put('I', "..");
        alphabetMorse.put('J', ".- - -");
        alphabetMorse.put('K', "-.-");
        alphabetMorse.put('L', ".-..");
        alphabetMorse.put('M', "- -");
        alphabetMorse.put('N', "-.");
        alphabetMorse.put('O', "- - -");
        alphabetMorse.put('P', ".- -.");
        alphabetMorse.put('Q', "- - .-");
        alphabetMorse.put('R', ".-.");
        alphabetMorse.put('S', "...");
        alphabetMorse.put('T', "-");
        alphabetMorse.put('U', "..-");
        alphabetMorse.put('V', "...-");
        alphabetMorse.put('W', ".- -");
        alphabetMorse.put('X', "-..-");
        alphabetMorse.put('Y', "-.- -");
        alphabetMorse.put('Z', "- -..");
        alphabetMorse.put(' ', "/");
        alphabetMorse.put('0', "- - - - -");
        alphabetMorse.put('1', ".- - - -");
        alphabetMorse.put('2', "..- - -");
        alphabetMorse.put('3', "...- -");
        alphabetMorse.put('4', "....-");
        alphabetMorse.put('5', ".....");
        alphabetMorse.put('6', "-....");
        alphabetMorse.put('7', "- -...");
        alphabetMorse.put('8', "- - -..");
        alphabetMorse.put('9', "- - - -.");

        System.out.println("Ingresa el texto a traducir :)");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        String textoMayus = texto.toUpperCase().trim(); // convierte el texto a mayusculas y le quita espacios final e inicial
        char[] arrayTexto = textoMayus.toCharArray();
        StringBuilder traduccion = new StringBuilder();

        System.out.println("Array nuevo : " + Arrays.toString(arrayTexto));


        for (int i = 0; i < arrayTexto.length; i++) {
            traduccion.append(alphabetMorse.get(arrayTexto[i])).append(" "); //se construye el string con cada resultado de la busqueda del caracter a morse y le agrega un punto al final
        }

        System.out.println(texto + " -> " + traduccion);

        //Obteniendo clave a partir del valor
        System.out.println(getKeyFromValue(alphabetMorse,".-"));    







    }
    //obtener clave a partir dek valor
    public static Object getKeyFromValue(Map hm, Object value) {
        for (Object o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    }
}
