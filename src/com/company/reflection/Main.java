package com.company.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        try {
            String clazzName = new SecurityManager() {
                public String getClassName() {
                    return getClassContext()[1].getName();
                }
            }.getClassName();
            System.out.println(clazzName);

            Class student = Class.forName("com.company.reflection.Main$Student");
            Constructor[] declaredConstructors = student.getDeclaredConstructors();
            Constructor[] constructors = student.getConstructors();
            Field[] declaredFields = student.getDeclaredFields();
            Field[] fields = student.getFields();
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
        }catch (Exception e) {
            System.out.println("Sucedio una excepcion");
        }

    }

    public class Student {
        public String firstName;
        public String lastName;
        public int age;
        protected String phoneNumber;
        private String accountNumber;

        Student(){
            System.out.println("This is default Constructor");
        }

        public Student(String firstName, String lastName){
            this.firstName= firstName;
            this.lastName= lastName;
            System.out.println("This is public Constructor");
        }

        private String sanitizeAccountNumber(String accountNumber){
            System.out.println("This is a private method to sanitize account number");
            //code to sanitize accountNumber goes here.
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber){
            accountNumber = sanitizeAccountNumber(accountNumber);
            this.accountNumber = accountNumber;
        }

    }
}