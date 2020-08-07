package com.company.challenge100Days;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * #26. Ordenando ando #2
 * Ordena tu set de nombres con cualquier algoritmo de ordenamiento que quieras, asegúrate de imprimir
 * cuánto tiempo se demoró tu equipo en ordenar.
 *
 * #27. Ordenando ando #3
 * Prueba otro algoritmo de ordenamiento con el mismo data set y compara el tiempo,
 * comparte en el foro cuál fue tu algoritmo con mejor rendimiento y por qué
 * */

public class OrdenandoAndo {
    public static void main(String[] args) {
        File archivo;
        FileReader fr = null;
        BufferedReader br;
        ArrayList<String> arrayNombres = new ArrayList<>();

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            //archivo = new File ("C:\\archivo.txt");
            archivo = new File("/home/pepivsky/Documentos/300NombresGenerados.csv");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;

            while ((linea = br.readLine()) != null) {
                arrayNombres.add(linea); //Agregando los nombres al arrayList
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            System.out.println("Array Orginal: ");
            System.out.println(arrayNombres);
            System.out.println();

            //#1 Usando Collections.sort
            System.out.println("Usando Collections.sort");
            long startTime = System.nanoTime();
            Collections.sort(arrayNombres);
            long endTime = System.nanoTime() - startTime;
            System.out.println(arrayNombres.toString());
            System.out.println("Tarda: " + endTime + " nanosegundos");

            //Algoritmo #2 Usando el método burbuja:
            String[] arrayn = new String[arrayNombres.size()];
            arrayn = arrayNombres.toArray(arrayn);

            String aux;
            long startTime2 = System.nanoTime(); //Inicio del tiempo
            for (int i = 1; i <= arrayn.length; i++) {
                for (int j = 0; j < arrayn.length - i; j++) {
                    if (arrayn[j].compareTo(arrayn[j + 1]) > 0) { //Si el elemento actual es mayor que el siguiente
                        aux = arrayn[j];
                        arrayn[j] = arrayn[j + 1];
                        arrayn[j + 1] = aux;
                    }
                }
            }
            long endTime2 = System.nanoTime() - startTime2; //fin del tiempo
            System.out.println();
            System.out.println("Ordenamiento burbuja");
            System.out.println(Arrays.toString(arrayn));
            System.out.println("Tarda: " + endTime2 + " nanosegundos");

            //Algoritmo #3 Usando el método de inserción directa
            String[] arrayI = new String[arrayNombres.size()];
            arrayI = arrayNombres.toArray(arrayI);
            int posicion;
            String elemento;

            long startTime3 = System.nanoTime();
            for (int i = 0; i < arrayI.length; i++) {
                posicion = i;
                elemento = arrayI[i];

                while ((posicion > 0) && (arrayI[posicion-1].compareTo(elemento) > 0)) {
                    arrayI[posicion] = arrayI[posicion-1];
                    posicion--;
                }
                arrayI[posicion] = elemento;
            }
            long endTime3 = System.nanoTime() - startTime3;
            System.out.println();
            System.out.println("Ordenamiento por inserción");
            System.out.println(Arrays.toString(arrayI));
            System.out.println("Tarda: " + endTime3 + " nanosegundos");


            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}