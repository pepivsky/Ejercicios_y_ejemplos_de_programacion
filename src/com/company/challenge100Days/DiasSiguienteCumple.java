package com.company.challenge100Days;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DiasSiguienteCumple {
    public static void main(String[] args) {
        LocalDate fechaActual =LocalDate.now();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu fecha de nacimiento");
        String birthDate = scanner.next();

        LocalDate birthDay = LocalDate.parse(birthDate);
        LocalDate nextBirthday = birthDay.withYear(fechaActual.getYear());
        long totalDias = 0;
        //Si la fecha ya pasó le sumamos un año para sacar la diferencia
        if (nextBirthday.isBefore(fechaActual)) {
            nextBirthday = nextBirthday.plusYears(1);
        }
        totalDias = ChronoUnit.DAYS.between(fechaActual, nextBirthday);
        System.out.println("Faltan " + totalDias + " días para tu siguiente cumpleaños! :)");
    }
}
