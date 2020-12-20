package com.company;
/*
Declarando un enum con su constructor, una varible y metodos
 */
public class SistemaDeUnidadesEnum {
}

enum SI {
    //declarando las constantes
    M("length"),
    KG("mass"),
    S("time");

    public final String quantityName; //variable de la constante de cada enum

    SI(String quantityName) { //constructor del enum
        this.quantityName = quantityName;
    }

    // Metodo que devuelve el nombre de la unidad de medida
    String getQuantity() {
        return this.quantityName;
    }

}