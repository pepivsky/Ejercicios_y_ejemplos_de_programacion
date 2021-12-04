package com.company.functionalProgramming;

public class UsandoForeach {

    static void run(String[] array) {
        // implement me
        for (String arg : array) {
            System.out.println(arg);
        }
        // solucion funcional
        // Arrays.stream(args).forEach(element -> System.out.println(element));

        // otra solucion funcional
        // Arrays.stream(args).forEach(System.out::println);
    }

    public static void main(String[] args) {
        run(new String[]{"blanquis", "pepe"});
    }
}
