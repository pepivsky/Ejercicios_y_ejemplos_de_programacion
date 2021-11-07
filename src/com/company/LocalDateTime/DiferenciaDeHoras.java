package com.company.LocalDateTime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DiferenciaDeHoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dateTime1 = LocalDateTime.parse(scanner.next());
        LocalDateTime dateTime2 = LocalDateTime.parse(scanner.next());

        System.out.println(dateTime1.until(dateTime2, ChronoUnit.HOURS)); // devuelve la diferencia entre dos objetos localdateTime, en el tiempo especificado, ej. horas, minutos, segundos
        // otra solucion
        //System.out.println(ChronoUnit.HOURS.between(dateTime1, dateTime2));
    }

}
