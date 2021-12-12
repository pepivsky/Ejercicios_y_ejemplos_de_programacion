package com.company.reflection.ejemplo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
Ejemplo haciendo reflection a la clase student para obtener sus campos
 */
public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(Student.class.getName()); // devuelve el nombre completo de la clase
        System.out.println(Student.class.getSimpleName());
        System.out.println(Student.class.getPackageName());

        // obteniendo el objeto class a partir del metodo forName
        Class student = Class.forName(Student.class.getName());

        // obteniendo constructores, variables y metodos
        Constructor[] declaredConstructors = student.getDeclaredConstructors();
        Constructor[] constructors = student.getConstructors(); // devuelve solo los publicos
        Field[] declaredFields = student.getDeclaredFields(); // devuelve solo las variables declaradas en la clase
        Field[] fields = student.getFields(); // devuelve las variables declaradas publicas y tambien las heredados
        Method[] declaredMethods = student.getDeclaredMethods();
        Method[] methods = student.getMethods();

        for(Constructor dc : declaredConstructors) {
            System.out.println("Declared Constructor " + dc.getName());
        }
        for (Constructor c : constructors) {
            System.out.println("Constructor " + c.getName());
        }
        for (Field df : declaredFields) {
            System.out.println("Declared Field " + df.getName());
        }
        for (Field f : fields) {
            System.out.println("Field " + f.getName());
        }
        for (Method dm : declaredMethods) {
            System.out.println("Declared Method " + dm.getName());
        }
        for (Method m : methods) {
            System.out.println("Method " + m.getName());
        }
    }
}

