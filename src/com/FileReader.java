package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
Ejemplo de lectura de archivo en windows
 */
public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\Descargas\\dataset_91069.txt");
        Scanner scanner = new Scanner(file);

        System.out.println(file.exists());
        System.out.println(file.isFile());

        while (scanner.hasNext()) {
            String columnYear = scanner.next();
            String columnPopulation = scanner.next();

            if (columnYear.equals("year")) {
                continue;
            }

            //int = scanner.nextLong();
            System.out.println(columnYear + " " + columnPopulation);
            //if ()
        }
    }
}
