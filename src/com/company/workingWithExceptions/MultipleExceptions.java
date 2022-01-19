package com.company.workingWithExceptions;

public class MultipleExceptions {
    public static void main(String[] args) {
        // normal
        System.out.println(Converter.convertStringToDouble("23.0"));

        // con excepcion
        System.out.println(Converter.convertStringToDouble("hola")); // 0.0
    }
}
class Converter {

    /**
     * It returns a double value or 0 if an exception occurred
     */
    public static double convertStringToDouble(String input) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException | NullPointerException e) {
            return 0;
        }
        /* otra solucion
        try {
            return Double.parseDouble(input);
        } catch (Exception e) { // se puede manejar las dos excepciones con la clase excepcion ya que lo se devuelve es lo mismo en el caso de cualquier excepcion
            return 0;
        }
         */
    }
}
