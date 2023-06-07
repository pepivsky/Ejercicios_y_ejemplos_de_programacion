package com.company

/*
Programa que revisa si los elementos de un string ingresado son consecutivos
Piece of alphabet
Write a program that reads a string and output true only when the letters of this string form a substring of the ordered English alphabet, for example, "abc", "xy", "pqrst".

Otherwise, it should print out false.

Note: string can consist of a single character. Assume an empty string as an alphabet substring.


Sample Input:
abc

Sample Output:
true


Sample Input:
bce

Sample Output:
false
 */

fun main() {
    val alphabet = ('a'..'z').joinToString("")
    println(alphabet)
    println(alphabet.contains(readLine()!!))

    /* otra solucion
    val word = readLine()!!
    var isOrdered = false

    if (word.length > 1) {
        for (i in 1..word.lastIndex) {
            if (word[i - 1] == word[i] - 1) { //revisa si el elemento anterior es igual al que deberia ser
                isOrdered = true
            } else {
                isOrdered = false
                break
            }
        }
        println(isOrdered)
    } else {
        println(!isOrdered)
    }
     */
}