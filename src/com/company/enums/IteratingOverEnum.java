package com.company.enums;
/* Programa que recore un enum con for y muestra el numero de elementos que empiezan con "STAR"
Hidden enumeration
You are given a hidden enum named Secret with some constants in uppercase.
Write a program that counts and prints how many constants in the enumeration start with "STAR".
The enum is accessible during testing.
 */
public class IteratingOverEnum {
    //recorrer un enum
    public static void main(String[] args) {
        int elements = 0;
        for (Secret secret : Secret.values()) {  //recorriendo el enum, Secret.values devuelve un arreglo iterable
            if (secret.name().startsWith("STAR")) { //si empieza con star
                elements++;
            }
        }
        System.out.println(elements); //imprimiendo el numero de elementos
    }

}

/* sample enum for inspiration*/
enum Secret {
    STAR, CRASH, START
}

