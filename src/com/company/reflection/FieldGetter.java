package com.company.reflection;

import java.lang.reflect.Field;

/* Ejemplo programa que obtiene el numero de variables declaradas de una clase

Implement getNumberOfFieldsClassDeclares method to count the number
 of fields declared in a class. You should count public, protected,
 default (package) access, and private fields, excluding inherited fields.


 */
public class FieldGetter {
    public int getNumberOfFieldsClassDeclares(Class<?> clazz) {
        // Add implementation here
        Field[] fields = clazz.getDeclaredFields();
        return fields.length;
    }
}
