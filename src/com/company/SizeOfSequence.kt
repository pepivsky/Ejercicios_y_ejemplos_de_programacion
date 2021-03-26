package com.company

//programa que pide numeros y para cuando un 0 es ingresado, muestra la longitud de la secuencia
/*
The length of the sequence
As the input, the program gets a sequence of non-negative integers; each integer is written in a separate line. The sequence contains an integer 0. After reading 0 the program is to end its work and output the length of the sequence (do not count the final 0).

Again: don’t read numbers after the number 0.

Sample Input:
3
2
1
0
1

Sample Output:
3
 */
/*
var array = emptyArray<Int>()
do {
    val number = readLine()!!.toInt()
    if (number == 0) {
        break
    }
    array += number
} while (number != 0)
println(array.size)
*/

//***************** Otra solucion ***********************

/*
var count = 0
while (readLine()!!.toInt() != 0) { //pide el numero directamente en la condicion y lo evalua
    count++
}
println(count)*/
