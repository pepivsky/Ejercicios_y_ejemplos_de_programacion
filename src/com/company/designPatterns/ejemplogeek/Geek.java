package com.company.designPatterns.ejemplogeek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Builder
GeekDirector must provide the following geeks :

Admin with 10 years of experience and knowledge of PowerShell and Perl;

Backend with 5 years of experience and knowledge of Python and PHP;

Rockstar with 20 years of experience and knowledge of Java, Kotlin, Scala languages and Angular framework.

The first line or standard input is the geek's name. The second is the type of geek.

You must write the missing methods in GeekDirector class to output the correct geek.

Please do not change the provided code of the classes.


Sample Input:
Garry
Rockstar

Sample Output:
Geek Garry created.
Type : Rockstar
Languages : [Java, Kotlin, Scala, Angular]
Experience : 20 years

 */
/**
 * ConcreteComponent - Geek.
 **/
public class Geek {

    private String type;
    private List<String> languages;
    private int experience;

    public Geek(String type, List<String> languages, int experience) {
        this.type = type;
        this.languages = languages;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Type : " + type + "\n" +
                "Languages : " + languages + "\n" +
                "Experience : " + experience + " years";
    }

}

/**
 * Builder interface describe step of object creation.
 **/
interface Builder {
    void setType(String type);

    void setLanguages(List<String> languages);

    void setExperience(int experience);
}

/**
 * Concrete Builder build Geek component.
 **/
class GeekBuilder implements Builder {

    private String type;
    private List<String> languages;
    private int experience;

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    @Override
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Geek getResult() {
        // write your code here ...
        return new Geek(type, languages, experience);
    }
}

/**
 * Builder Director.
 */
class GeekDirector {
    public void buildAdmin(Builder builder) {
        builder.setType("Admin");
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Perl");
        languages.add("PowerShell");
        builder.setLanguages(languages);
        builder.setExperience(10);
    }

    // write your code here ...
    public void buildBackend(Builder builder) {
        builder.setType("Backend");
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Python");
        languages.add("PHP");
        builder.setLanguages(languages);
        builder.setExperience(5);
    }

    public void buildRockstar(Builder builder) {
        builder.setType("Rockstar");
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Kotlin");
        languages.add("Scala");
        languages.add("Angular");
        builder.setLanguages(languages);
        builder.setExperience(20);
    }

}

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String geekName = scanner.nextLine();
        final String geekType = scanner.nextLine();
        scanner.close();
        GeekDirector director = new GeekDirector();
        GeekBuilder builder = new GeekBuilder();
        Geek geek = null;
        if ("Rockstar".equals(geekType)) {
            director.buildRockstar(builder);
            geek = builder.getResult();
        } else if ("Backend".equals(geekType)) {
            director.buildBackend(builder);
            geek = builder.getResult();
        } else if ("Admin".equals(geekType)) {
            director.buildAdmin(builder);
            geek = builder.getResult();
        } else {
            System.out.println("Error");
            return;
        }
        System.out.println("Geek " + geekName + " created.");
        System.out.println(geek);

    }
}
