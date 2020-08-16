package com.company.challenge100Days;

import java.util.Arrays;
import java.util.Collections;

public class Risk {
    public static void main(String[] args) {
        Integer[] arrayAtacante = new Integer[3];
        Integer[] arrayDefensor = new Integer[2];
        int numMayorA, numA;
        int numMayorD, numD;

        int defensor, atacante;



        //Llenar el array del atacante
        for (int i = 0; i < arrayAtacante.length; i++) {
            arrayAtacante[i] = (int) ((Math.random() * (6 - 1 + 1)) + 1);//generar numeros del 1 al 6
        }
        //Llenar el array del defensor
        for (int i = 0; i < arrayDefensor.length; i++) {
            arrayDefensor[i] = (int) ((Math.random() * (6 - 1 + 1)) + 1);
        }
        //Ordenarlos de mayor a menor
        Arrays.sort(arrayAtacante, Collections.reverseOrder());
        Arrays.sort(arrayDefensor, Collections.reverseOrder());

        numMayorA = arrayAtacante[0]; //obetener el mayor y el segundo mayor de los arreglos
        numA = arrayAtacante[1];

        numMayorD = arrayDefensor[0];
        numD = arrayDefensor[1];

        System.out.println("Atacante" + Arrays.toString(arrayAtacante));
        System.out.println("Defensor" + Arrays.toString(arrayDefensor));


        //Hacer las validaciones
        if (numMayorA > numMayorD && numA > numD) {
            defensor = numMayorA - numMayorD;
            defensor += numA - numD;
            System.out.println("El defensor pierde: " + defensor);
        } else if (numMayorA > numMayorD && numA < numD) {
            defensor = numMayorA - numMayorD;
            atacante = numD - numA;
            System.out.println("El atacante pierde:" + atacante + " y el defensor:" + defensor);
        } else if (numMayorA < numMayorD && numA > numD) {
            atacante = numMayorD - numMayorA;
            defensor = numA - numD;
            System.out.println("El defensor pierde:" + defensor + " y el atacante:" + atacante);
        } else if (numMayorA < numMayorD && numA < numD){
            atacante = numMayorD - numMayorA;
            atacante += numD - numA;
            System.out.println("El atacante pierde:" + atacante);
        } else if (numMayorA == numMayorD && numA > numD) {
            defensor = numA - numD;
            System.out.println("El defensor pierde:" + defensor);
        } else if (numMayorA == numMayorD && numA < numD) {
            atacante = numD - numA;
            System.out.println("El atacante pierde:" + atacante);
        } else if (numMayorA == numMayorD) {
            System.out.println("Los números son iguales, la regla dice que gana el defensor");
        }

        //System.out.println("El defensor pierde:" + (defensor));
        //System.out.println("El atacante pierde");
    }
}
