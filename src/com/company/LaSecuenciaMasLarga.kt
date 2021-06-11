package com.company

/* Programa que cuenta la secuencia mas larga de numero consecutivos en un array
Write a program that reads N numbers and outputs the length of the longest sequence in non-descending order. By non-descending, we mean that the next element is either equal or greater than the previous one (A<=B). Elements of the sequence are to follow one another.

Input format

The first line contains the positive integer number N (N>0).
The other lines contain N numbers.

Example

The input array is 1 2 4 1 2 2 5 7 4 3. In this case, the length of the longest sequence in non-descending order is 5. It includes these elements: 1 2 2 5 7.
 */

fun main() {
    val size = readLine()!!.toInt()
    val array = IntArray(size)
    var counter = 0
    var max = 0

    for (i in array.indices) {
        array[i] = readLine()!!.toInt()
    }

    if (array.size == 1) {
        println(1)
        return // si la lista es de size 1 imprime 1 y omite el siguiente bloque de codigo
    }
    for (i in 0 until array.lastIndex) { // desde 0 hasta el penultimo
        if (array[i] <= array[i + 1]) { // si el numero siguiente es mayor incrementa el contador
            counter++
        } else { // sino lo reinicia
            max = if (counter + 1 > max) counter + 1 else max // si el contador es mayor que el max actual entonces es el nuevo max
            counter = 0
        }
        max = if (counter > max) counter + 1 else max

    }
    println(max)
}
