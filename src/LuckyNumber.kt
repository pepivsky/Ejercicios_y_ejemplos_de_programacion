/*
Lucky number

Typical task for a job interview.

Given the number N with an even number of digits. If the sum of the first half of the digits equals the sum of the second half of the digits, then this number is considered lucky. For a given number, output "YES" if this number is lucky, otherwise output "NO".
 Sample Input:
12344321
 Sample Output:
YES
  Sample Input:
125322
 Sample Output:
NO
 */

fun main() {
    val numbers = readLine()!!.toCharArray().map { Character.getNumericValue(it) } //convierte un String a un arreglo de chars y despues transforma cada elemento a numero entero
    val half1 = numbers.subList(0, numbers.size / 2) //obteniendo una subLista
    val half2 = numbers.subList(numbers.size / 2, numbers.size)

    println(if (half1.sum() == half2.sum()) "YES" else "NO")
}