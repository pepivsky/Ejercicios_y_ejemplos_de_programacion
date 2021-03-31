package com.company
/*
Handle number format exception
Imagine you implement a web service to pay for video games. There is a text field where a user inputs their card number.
A card number is a string like "AAAA AAAA AAAA AAAA", where A is any digit. Please note that a correct card number contains three spaces as in the template.
Create a function that returns the card number as a Long or produces any exception when the card number is incorrect.


Sample Input:
1234 5678 9012 3456

Sample Output:
1234567890123456
 */
fun main() {
    println(parseCardNumber("1234 3123 1232 1233"))
}

fun parseCardNumber(cardNumber: String): Long {
    val count = cardNumber.split(" ").size  //divide el string por los espacios y cuenta los elementos, si hay 4 conjuntos de numeros, entonces esta bien

    if (count == 4) {
        return cardNumber.replace(" ", "").toLong()
    } else {
        throw Exception("Invalid cardNumber")
    }
}