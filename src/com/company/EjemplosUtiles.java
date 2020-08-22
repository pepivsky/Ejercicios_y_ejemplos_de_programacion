package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EjemplosUtiles {


    public static void main(String[] args) {
        //Ordenar un arreglo de manera descendete
        /*Scanner scanner = new Scanner(System.in);
        int tamano = scanner.nextInt();
        Integer[] arreglo = new Integer[tamano];

        for (int i = 0; i < tamano; i++) {
            arreglo[i] = scanner.nextInt();
        }
        //normal
        System.out.println("Orden normal" +Arrays.toString(arreglo));
        //orden Ascendente
        Arrays.sort(arreglo);
        System.out.println("Orden Ascendente: " + Arrays.toString(arreglo));
        //orden descendente
        Arrays.sort(arreglo, Collections.reverseOrder());
        System.out.println("Descendente: " + Arrays.toString(arreglo));*/
/*****************************************************************************/
        //Imprimir la suma de A a B incluyendolos
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int resultado = 0;

        for (int i = a+1; i <=b; i++) {

            a = a + i;
            System.out.println(resultado);
        }

        System.out.println(a);*/
//Sumar los elementos de un arreglo
        /*Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }

        System.out.println(sum);*/

        //+++++++++Revisar si algún elemento está en el arreglo++++++++++
        //Arrays.asList(arrayPrimos).contains(elemento) //el array debe ser Integer

        //++++++++++Imprimir a decimales limitados+++++++++


        /*Usando DecimalFormat

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(number));
        Salida : 1.42
        Usando String.Format

        System.out.println(String.format("%.2f", number));
        Salida : 1.42
        Si solo desea a que la salida tenga ese formato aplicaría numberformat

        System.out.printf("Valor: %.2f", number );
        Salida : 1.42
        Mediante Math.Round() donde la cantidad de ceros es la cantidad de decimales a limitar

        System.out.println((double)Math.round(number * 100d) / 100d);
        Salida : 1.42
        Usando la clase BigDecimal , usando el método setScale que recibe dos parámetros la cantidad de decimales a limitar y el modo de redondeo

        BigDecimal bd = new BigDecimal(number);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        System.out.println(bd.doubleValue());
        Salida 1.42*/

        //++++++++++Revisar si un String contiene otro ignorando si esta en mayusculas o minusculas+++++++++
        //Revisar si un String contiene otro ignorando si esta en mayusculas o minusculas
        String country = "Mexico";
        if (country.toLowerCase().contains("XICO".toLowerCase())) {
            System.out.println("true"); // true
        } else {
            System.out.println("false");
        }
        //++++++++++Obetner valor menor y mayor de un array+++++++++
        //int min1 = Arrays.stream(box1).min().getAsInt();
        //int max1 = Arrays.stream(box1).max().getAsInt();

        //otra forma
        //int max = Collections.max(Arrays.asList(array)); // obtiene el valor mayor del arreglo
        //int indice = Arrays.asList(array).indexOf(max);// obtiene el indice del mayor

        //++++++++++Obetner valor menor y mayor de un ArrayList+++++++++
        //int max = Collections.max(numerosDivisibles);
        //int min = Collections.min(numerosDivisibles);


    }
}
