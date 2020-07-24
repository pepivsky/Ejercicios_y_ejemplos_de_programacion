package com.company;

public class Practica {

    public static void main(String[] args) {


        /*int mystery = 'z';
        System.out.println(mystery);/*

        /*int z = 'z';
        char mystery = z - 10;
        System.out.println(mystery);*/

        /*System.out.println("Hola mundo!\rJose");
        System.out.println("\tPepe");
        System.out.println("123" + ' ' + "456");*/

        /*
        \n' is the newline character;
        '\t' is the tab character;
        '\r' is the carriage return character;
        '\\' is the backslash character itself;
        '\'' is the single quote mark;
        '\"' is the double quote mark.*/


        /*char ch = '\u0040'; // it represents '@'
        System.out.println(ch); // @*/

        /*char ch = 'b';
        ch += 1; // 'c'
        ch -= 2; // 'a'

        System.out.println(ch);*/

        /*Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        System.out.println(--num1 + " " + --num2 + " " + --num3 + " " + --num4);*/



        /*Scanner scanner = new Scanner(System.in);
        //char n1 = scanner.next().charAt(0);
        String cadena = scanner.next();
        Integer n1 = Integer.parseInt(cadena.substring(0,1));
        Integer n2 = Integer.parseInt(cadena.substring(1,2));
        Integer n3 = Integer.parseInt(cadena.substring(2,3));

        int suma = n1 + n2 + n3;
        //System.out.println(n1 + " " + n2 + " " + n3 + " ");
        System.out.println(suma);*/

        /*Scanner scanner = new Scanner(System.in);
        int clasroom1 = scanner.nextInt();
        int clasroom2 = scanner.nextInt();
        int clasroom3 = scanner.nextInt();

        double resultC1 = clasroom1 / 2.0;
        int r1 = (int) Math.ceil(resultC1);

        double resultC2 = clasroom2 / 2.0;
        int r2 = (int) Math.ceil(resultC2);

        double resultC3 = clasroom3 / 2.0;
        int r3 = (int) Math.ceil(resultC3);

        int suma = r1 + r2 + r3;

        System.out.println(suma);*/



        //import java.util.Scanner;


        /*final Scanner sc = new Scanner(System.in);
        final int st1 = sc.nextInt();
        final int st2 = sc.nextInt();
        final int st3 = sc.nextInt();

        final int results = st1 / 2 + st1 % 2 + st2 / 2 + st2 % 2 + st3 / 2 + st3 % 2;

        System.out.println(results);*/




        //System.out.println(21/2);

        //Problema del chcocolate
        /*Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        if (k > n * m) {
            System.out.println("NO");

        } else if (k % n == 0) {
            System.out.println("YES");

        } else if (k % m == 0) {
            System.out.println("YES");

        } else {
            System.out.println("NO");
        }*/



        //Programa
        //Given a four-digit number. Determine whether its decimal notation is symmetric.
        // If the number is symmetric, output 1;
        // otherwise output any other integer. The number may have less than four digits;
        // in this case you should assume that its decimal notation is complemented by insignificant zeros on the left.

        /*Scanner scanner = new Scanner(System.in);


        int number = scanner.nextInt();
        String numberInString = String.valueOf(number);

        if (numberInString.length() == 4){
            int cuartoN = number % 10;

            number = number / 10;
            int tercerN = number % 10;

            number = number / 10;
            int segundoN = number % 10;

            number = number / 10;
            int primerN = number % 10;

            if (primerN == cuartoN && segundoN == tercerN){
                System.out.println("1");
            } else {
                System.out.println("31");
            }

        } else if (numberInString.length() == 3){

            int tercerN = number % 10;

            number = number / 10;
            int segundoN = number % 10;

            number = number / 10;
            int primerN = number % 10;

            if (primerN == tercerN){
                System.out.println("1");
            } else {
                System.out.println("31");
            }

        } else {
            System.out.println("El número debe ser de 3 o 4 digitos");
        }*/

        //Programa
        //Find the number of D, C, B and A grades for the last test on informatics, where n students from a class have successfully passed the test.
        //
        //In this task, we use a 5-point grading system and are interested only in passing grades: from 2 to 5. They correspond to the letter grades in the following way: 5 is for A, 4 is for B, 3 is for C and 2 is for D. The program gets number n as input and then gets the grades themselves: one by one.
        //
        //The program should output four numbers in a single line: the number of D, C, B, and A grades respectively.


        //D=2 c=3 b=4 a=5
        /*Scanner scanner = new Scanner(System.in);

        int numberOfCalifications = scanner.nextInt();
        int contadorA = 0;
        int contadorB = 0;
        int contadorC = 0;
        int contadorD = 0;


        for (int i = 1; i <= numberOfCalifications; i++) {
            int cont = scanner.nextInt();

            if (cont == 5) {
                contadorA += 1;

            } else if (cont == 4) {
                contadorB += 1;

            } else if (cont == 3) {
                contadorC += 1;

            } else if (cont == 2) {
                contadorD += 1;
            }


        }

        System.out.println(contadorD + " " + contadorC + " " + contadorB + " " + contadorA);*/

        /*
        Given the sequence of natural numbers. Find the sum of numbers divisible by 6.
        The input is the number of elements in the sequence, and then the elements themselves.
        In this sequence, there is always a number divisible by 6.
        * */

        /*Scanner scanner = new Scanner(System.in);
        int elements  = scanner.nextInt();
        int numbersSum = 0;

        for (int i = 1; i <= elements; i++) {
            int number = scanner.nextInt();

            //Es divisible entre 6
            if ((number % 6) == 0) {
                numbersSum += number;
            } else {

            }
        }
        System.out.println(numbersSum);*/


        /*Write a program that reads two numbers aa and bb from the keyboard and calculates and outputs to the console the arithmetic average
        *of all numbers from the interval [a; b][a;b], which are divisible by 33.
        *In the example below, the arithmetic average is calculated for the numbers on the interval [-5; 12][−5;12].
        *Total numbers divisible by 33 on this interval 66: -3, 0, 3, 6, 9, 12−3,0,3,6,9,12. Their arithmetic average equals to 4.54.5
        *The program input contains intervals, which always contain at least one number, which is divisible by 33.
        *
        * */

        /*Scanner scanner = new Scanner(System.in);

        int startInterval = scanner.nextInt();
        int endInterval = scanner.nextInt();
        double result = 0.0;
        int contador = 0;

        for (int i = startInterval; i <= endInterval; i++){
            //Es divisible entre 3
            if (i % 3 == 0){
                contador +=1;
                result += i;


            }


        }
        System.out.print(result / contador);*/

//Proyecto de simplyChatyBot
        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();

        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");

        int number  = scanner.nextInt();
        for (int i = 0; i <= number; i++){
            System.out.println(i + "!");
        }

        System.out.println("Completed, have a nice day!");*/


        /*int q = 'q';  // 1
        char ch2 = q; // 2

        int s = 1;  // 3
        char ch3 = s; // 4

        int i = 3; // 3
        float f = i; // 4
        char a = '2';
        int b = a;

        System.out.println(q);

         */


        //Ejemplo ciclo while
        /*char letter = 'A';

        while (letter <= 'Z') {
            System.out.print(letter + " ");
            letter++;
        }*/

        //Ejemplo ciclo DoWhile
        /*Scanner scanner = new Scanner(System.in);

        int value;
        do {
            value = scanner.nextInt();
            System.out.println(value);
        } while (value != 0);*/

        //Ejemplo de un prgrama usando hasNext
        /*Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (scanner.hasNext()) {
            int elem = scanner.nextInt();
            sum += elem;
        }

        System.out.println(sum);*/
        
        /*
        Given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible by 4. As input,
        the program gets the number of elements in the sequence, and then the elements themselves. In the sequence,
        there is always an element divisible by 4. The number of elements does not exceed 1000. The program should print a single number:
        the maximum element of the sequence divisible by 4.

        Try to solve this problem by using a while-loop.
         */

        /*Scanner scanner = new Scanner(System.in);
        int numberIterations = scanner.nextInt();
        int contador = 0;
        int serieNumber = 0;
        ArrayList<Integer> numerosDivisibles = new ArrayList<>();

        while (contador < numberIterations) {
            serieNumber = scanner.nextInt();

            if (serieNumber % 4 == 0) {
                //System.out.println("Es divisible entre 4");
                numerosDivisibles.add(serieNumber);
            }
            contador++;
        }
        System.out.println(Collections.max(numerosDivisibles)); //Se obtiene el mayor del array*/

        //Programa la conjetura de Collatz
        /*
        * Given natural number n. Generate a sequence of integers, described in the Collatz conjecture:
        * If n is an even number, divide it in half, if it is odd, multiply it by 3 and add 1.
        * Repeat this operation until we get the number 1 as a result.
        * For example, if the number n = 17, then the sequence looks as the following:
        * 17 52 26 13 40 20 10 5 16 8 4 2 1
        * Such a sequence will stop at number 1 for any primary natural number n.
        * Output format:
        * Sequence of integers in a single line, separated by spaces.
        * */

        /*Scanner scanner = new Scanner(System.in);
        int naturalNumber = scanner.nextInt();
        int nResult = 0;

        if (naturalNumber == 1) { //Si el número es 1
            System.out.println(1);
        } else {

            if (naturalNumber % 2 == 0) { // si es par
                nResult = naturalNumber / 2;
                System.out.print(naturalNumber + " " + nResult + " ");

                while (nResult != 1) {
                    if (nResult % 2 == 0) {
                        nResult = nResult / 2;
                        System.out.print(nResult + " ");
                    } else {
                        nResult = nResult * 3 + 1;
                        System.out.println(nResult + " ");
                    }

                }
            } else { //si es impar
                nResult = naturalNumber * 3 + 1;
                System.out.print(naturalNumber + " " + nResult + " ");

                while (nResult != 1) {
                    if (nResult % 2 == 0) {
                        nResult = nResult / 2;
                        System.out.print(nResult + " ");
                    } else {
                        nResult = nResult * 3 + 1;
                        System.out.print(nResult + " ");
                    }

                }

            }
        }*/

        //Otra solución
        /*
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        while (n != 1) {
            System.out.print(n + " ");

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
        }

        System.out.print(n);
    }*/
        /*Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();

        long n = 1;
        while (m > 0) {
            m = m / n++;
            System.out.println(m + "/" + n);

        }
        System.out.println(--n);*/
        /*
        * Ann put MM money in the bank. The bank increases Ann's deposit by PP percent every year.
        * Ann wants to know how many years should pass until her deposit in the bank reaches KK money. Can you help her to answer this question?
        * Input contains three integers - M, P, KM,P,K. It is guaranteed that all numbers are positive and K \geq MK≥M.
        * Output the answer to Ann's question.

        * Sample Input 1:

        *   1 100 8
        * Sample Output 1:

        *   3
        * */


        /*Scanner scanner = new Scanner(System.in);
        double moneyM = scanner.nextDouble();
        double porcentajeAnio = scanner.nextDouble();
        double yearsAlcanceK  = scanner.nextDouble();

        double resultado = 0;
        int contador = 0;

        while (moneyM < yearsAlcanceK) {
            resultado = moneyM * porcentajeAnio / 100;
            moneyM = moneyM + resultado;
            contador++;
        }
        System.out.println(contador);

         */


        //Los números se deben ingresar en una sola línea separados por un espacio

        /*Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int bridgesNumber = scanner.nextInt();
        int bridgeHeight = 0;
        boolean crash = false;
        int bridgeCrash = 0;
        int contador = 0;

        for (int i = 1; i <=  bridgesNumber; i++){
            bridgeHeight = scanner.nextInt();

            if (busHeight >= bridgeHeight){
                crash = true;
                contador ++;

                if (contador <= 1){
                    bridgeCrash = i;

                }
            }

        }
        if (crash == true){
            System.out.println("Will crash on bridge " + bridgeCrash);
        } else {
            System.out.println("Will not crash");
        } */

        /*
        *Write a program that reads a sequence of integer numbers and outputs true if the sequence is
        * ordered (in ascending or descending order), otherwise, false. Keep in mind,
        * if a number has the same value as the following number, it does not break the order.
        *The sequence ends with 0. Do not consider this number as a part of the sequence.
        * The sequence always has at least one number (excluding 0).
        *Sample Input 1:
        *9 8 7 6 5 4 3 2 1 0
        *Sample Output 1:
        * false
        * */

        /*Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> numAsc;
        ArrayList<Integer> numDesc;
        int number = 0;

        do {
            number = scanner.nextInt();
            if (number == 0){
                continue;
            }
            numeros.add(number);
        }while (number != 0);

        //Orden ascendente
        numAsc = new ArrayList<>(numeros);
        Collections.sort(numAsc);

        //Orden descendente
        numDesc = new ArrayList<>(numeros);
        Collections.sort(numDesc, Collections.reverseOrder());

        if (numeros.equals(numAsc)) {
            //System.out.println("Están en orden Ascendente");
            System.out.println("true");

        } else if (numeros.equals(numDesc)){
            //System.out.println("Estan en orden Descendente");
            System.out.println("true");
        } else {
            System.out.println(false);
        }*/

        /*
        * Write a program, which reads the number of the shape (1 – square, 2 – circle, 3 – triangle, 4 – rhombus)
        * and prints the text "You have chosen a square" (or circle, or triangle, or rhombus, depending on the number).
        * If it is a number that doesn't correspond to any of the listed shapes, the program should output: "There is no such shape!".
        Note: output text should exactly match the sample, including letters' case and location of spaces.

        Sample Input 1:

        1
        Sample Output 1:

        You have chosen a square
        * */

        /*Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("You have choosen a square");
                break;
            case 2:
                System.out.println("You have choosen a cricle");
                break;
            case 3:
                System.out.println("You have choosen a triangle");
                break;
            case 4:
                System.out.println("You have choosen a rhombus");
                break;
            default:
                System.out.println("There is no such shape!");
                break;

        }*/


        /**Write a program, which reads the number of direction (1 – up, 2 – down, 3 – left, 4 – right, 0 – do not move)
         * and outputs the text «move up» (or «move down», or «move left», or «move right», or «do not move» depending on the entered number).
         * If it is a number that does not belong to any of the listed directions, the program should output: «error!»

         Note: the output text should exactly match the sample, including the letters’ case and location of spaces.

         Sample Input 1:

         1
         Sample Output 1:

         move up
         *
         */
        /*Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 0:
                System.out.println("do not move");
                break;
            case 1:
                System.out.println("move up");
                break;
            case 2:
                System.out.println("move down");
                break;
            case 3:
                System.out.println("move left");
                break;
            case 4:
                System.out.println("move right");
                break;
            default:
                System.out.println("error!");
                break;
        }*/


        /*Write a simple calculator that reads the three values from the line: the first number, the operation, and the second number.
The program should apply the operation to the numbers entered ("first number" "operation" "second number") and output the result to the screen. Note that the numbers are long.

The calculator should support:

addition: "+"
subtraction: "-"
integer division: "/"
multiplication: "*"
If a user performs division and the second number is 0, it is necessary to output the line "Division by 0!".

If the input operator is not one from the list, the program should output "Unknown operator".

Note: it's recommended to use the switch statement in your solution.
        *
        * */

        /*Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        char operation = scanner.next().charAt(0); //scanner.next también funciona
        long num2 = scanner.nextLong();


        switch (operation) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(num1 / num2);
                }
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }*/

        //Coffee machine
        /*Scanner scanner = new Scanner(System.in);
        int cups = 0;
        int waterForCup = 200;
        int milkForCup = 50;
        int coffeeForCup = 15;

        int waterAmount = 0;
        int milkAmount = 0;
        int coffeeAmount = 0;

        System.out.println("Write how many cups of coffee you will need: ");
        cups = scanner.nextInt();
        //calcular
        waterAmount = waterForCup * cups;
        milkAmount = milkForCup * cups;
        coffeeAmount = coffeeForCup * cups;

        System.out.println("For " + cups + " cups of coffee you will need:");
        System.out.println(waterAmount + " ml of water");
        System.out.println(milkAmount + " ml of milk");
        System.out.println(coffeeAmount + " g of coffee beans");




        /*System.out.println("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!");*/
        /*
        * Description
A real coffee machine never has an infinite supply of water, milk, or coffee beans. And if you input a really big number, it’s almost certain that a real coffee machine wouldn't have the supplies needed to make all that coffee.

In this stage, you need to improve the previous program. Now you need to input amounts of water, milk, and coffee beans that your coffee machine has at the moment.

If the coffee machine has enough supplies to make the specified amount of coffee, the program should print "Yes, I can make that amount of coffee". If the coffee machine can make more than that, the program should output "Yes, I can make that amount of coffee (and even N more than that)", where N is the number of additional cups of coffee that the coffee machine can make. If the amount of resources is not enough to make the specified amount of coffee, the program should output "No, I can make only N cup(s) of coffee".

Like in the previous stage, the coffee machine needs 200 ml of water, 50 ml of milk, and 15 g of coffee beans to make one cup of coffee.

Instruction
Write a program that calculates whether it will be able to make the required amount of coffee from the specified amount of ingredients.

Examples
The program should firstly request for water, then milk, then beans, then amount of cups.
The symbol > represents the user input. Notice that it's not the part of the input.

Example 1

Write how many ml of water the coffee machine has:
> 300
Write how many ml of milk the coffee machine has:
> 65
Write how many grams of coffee beans the coffee machine has:
> 100
Write how many cups of coffee you will need:
> 1
Yes, I can make that amount of coffee
Example 2

Write how many ml of water the coffee machine has:
> 500
Write how many ml of milk the coffee machine has:
> 250
Write how many grams of coffee beans the coffee machine has:
> 200
Write how many cups of coffee you will need:
> 10
No, I can make only 2 cup(s) of coffee
Example 3

Write how many ml of water the coffee machine has:
> 1550
Write how many ml of milk the coffee machine has:
> 299
Write how many grams of coffee beans the coffee machine has:
> 300
Write how many cups of coffee you will need:
> 3
Yes, I can make that amount of coffee (and even 2 more than that)
Example 4

Write how many ml of water the coffee machine has:
> 0
Write how many ml of milk the coffee machine has:
> 0
Write how many grams of coffee beans the coffee machine has:
> 0
Write how many cups of coffee you will need:
> 1
No, I can make only 0 cup(s) of coffee
Example 5

Write how many ml of water the coffee machine has:
> 0
Write how many ml of milk the coffee machine has:
> 0
Write how many grams of coffee beans the coffee machine has:
> 0
Write how many cups of coffee you will need:
> 0
Yes, I can make that amount of coffee
Example 6

Write how many ml of water the coffee machine has:
> 200
Write how many ml of milk the coffee machine has:
> 50
Write how many grams of coffee beans the coffee machine has:
> 15
Write how many cups of coffee you will need:
> 0
Yes, I can make that amount of coffee (and even 1 more than that)
        * */
//Solucion:
        /*Scanner scanner = new Scanner(System.in);
        int cups = 0;
        int waterForCup = 200;
        int milkForCup = 50;
        int coffeeForCup = 15;
        int menor = 0;
        ArrayList<Integer> numbers = new ArrayList<>();

        int waterAmount = 0;
        int milkAmount = 0;
        int coffeeAmount = 0;
        System.out.println("Write how many ml of water the coffee machine has: ");
        waterAmount = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        milkAmount = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        coffeeAmount = scanner.nextInt();


        //Pedir las tazas de café
        System.out.println("Write how many cups of coffee you will need: ");
        cups = scanner.nextInt();
        waterAmount /= waterForCup;
        milkAmount /= milkForCup;
        coffeeAmount /= coffeeForCup;
        //System.out.println(waterAmount);
        //llenando el ArrayList
        numbers.add(waterAmount);
        numbers.add(milkAmount);
        numbers.add(coffeeAmount);

        if (cups <= waterAmount && cups <= milkAmount && cups <= coffeeAmount) {
            if (waterAmount > cups || milkAmount > cups || coffeeAmount > cups) {
                menor = (int)Collections.min(numbers) - cups;
                if (menor == 0) {
                    System.out.println("Yes, I can make that amount of coffee");
                } else {
                    System.out.println("Yes, I can make that amount of coffee (and even "+ menor + " more than that)");
                }


            } else {
                System.out.println("Yes, I can make that amount of coffee");
                //System.out.println(waterAmount);
            }


        } else {

            System.out.println("No, I can make only "+ Collections.min(numbers)+ " cup(s) of coffee"); //Se obtiene el menor del array
            //System.out.println("No, I can make: " + waterAmount);
        }*/

        //Otra solución
        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int n = scanner.nextInt();

        water /= 200;
        milk /= 50;
        beans /= 15;

        int min = Math.min(water, milk);
        min = Math.min(beans, min);

        if (n == min) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (n < min) {
            System.out.println("Yes, I can make that amount of coffee (and even " +
                    (min - n) + " more than that)");
        } else {
            System.out.println("No, I can make only " + min + " cup(s) of coffee");
        }*/
        




    }
}

