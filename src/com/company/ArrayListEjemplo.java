package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEjemplo {
    public static void main(String[] args) {
        //otra manera de declarar un arrayList con elementos desde el inicio
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

        //imprimiendo los elementos
        for (String value: nameList) {
            System.out.println(value);
        }
    }
}