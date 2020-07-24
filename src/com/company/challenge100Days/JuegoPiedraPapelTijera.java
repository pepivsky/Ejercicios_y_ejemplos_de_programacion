package com.company.challenge100Days;

import java.util.Scanner;

public class JuegoPiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Juego de piedra papel o tijeras");
        System.out.println("Escribe 1 si quieres jugar con un amigo o 2 para jugar con la computadora");
        int tipojuego = scanner.nextInt();
        String player1 = "";
        String player2 = "";
        int contador1 = 0;
        int contador2 = 0;
        String computer = "";

        int numAleatorio = 0;


        switch (tipojuego) {
            case 1:
                while (contador1 != 3 && contador2 != 3) {
                    System.out.println("Es turno del jugador 1");
                    player1 = scanner.next();
                    System.out.println("Es turno del jugador 2");
                    player2 = scanner.next();
                    if (player1.equals("piedra") && player2.equals("papel")) {
                        System.out.println("Ganó el jugador 2");
                        contador2 += 1;
                    } else if (player1.equals("piedra") && player2.equals("tijera")) {
                        System.out.println("Ganó el jugador 1");
                        contador1 += 1;
                    } else if (player2.equals("piedra") && player1.equals("papel")) {
                        System.out.println("Ganó el jugador 1");
                        contador1 += 1;
                    } else if (player2.equals("piedra") && player1.equals("tijera")) {
                        System.out.println("Ganó el jugador 2");
                        contador2 += 1;
                    } else if (player1.equals("tijera") && player2.equals("papel")) {
                        System.out.println("Ganó el jugador 1");
                        contador1 += 1;
                    } else if (player1.equals("papel") && player2.equals("tijera")) {
                        System.out.println("Ganó el jugador 2");
                        contador2 += 1;
                    } else {
                        System.out.println("Es un empate");
                    }
                }
                if (contador1 == 3) {
                    System.out.println("El ganador es  el jugador 1*******");
                } else {
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println("*******El ganador es el jugador 2*******");
                }
                break;

            case 2:
                while (contador1 != 3 && contador2 != 3) {
                    System.out.println("Tu turno");
                    player1 = scanner.next();
                    numAleatorio = (int) ((Math.random() * (3 - 1 + 1)) + 1);
                    switch (numAleatorio) {
                        case 1:
                            computer = "piedra";
                            break;
                        case 2:
                            computer = "papel";
                            break;
                        case 3:
                            computer = "tijera";
                            break;
                    }
                    if (player1.equals("piedra") && computer.equals("papel")) {
                        System.out.println("Ganó la computadora porque jugó papel");
                        contador2 += 1;
                    } else if (player1.equals("piedra") && computer.equals("tijera")) {
                        System.out.println("Ganó el jugador porque la computadora jugó tijera");
                        contador1 += 1;
                    }  else if (player1.equals("tijera") && computer.equals("papel")) {
                        System.out.println("Ganó el jugador porque la computadora jugó papel");
                        contador1 += 1;
                    } else if (player1.equals("papel") && computer.equals("tijera")) {
                        System.out.println("Ganó la computadora porque jugó tijera");
                        contador2 += 1;
                    } else if (player1.equals("papel") && computer.equals("piedra")){
                        System.out.println("Ganó el jugador porque la computadora jugó piedra ");
                        contador1 += 1;
                    } else if (player1.equals(computer)){
                        System.out.println("Es un empate");
                    } else if (player1.equals("tijera") && computer.equals("piedra")) {
                        System.out.println("Ganó la computadora porque jugó piedra");
                        contador2 += 1;
                    }
                }
                if (contador1 == 3) {
                    System.out.println("El ganador es  el jugador 1*******");
                } else {
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println("*******El ganador es la computadora*******");
                }
                break;
        }






    }
}
