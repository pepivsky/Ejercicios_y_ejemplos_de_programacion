package com.company.regexExamples;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
exercise link:
https://www.hackerrank.com/challenges/detect-html-tags/problem
 */
public class CountHtmlTags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> arrayList = new ArrayList<>();

        String[] arrayLines = new String[lines];

        for (int i = 0; i < lines; i++) {
            arrayLines[i] = scanner.nextLine();
        }

        System.out.println(Arrays.toString(arrayLines));

        Pattern pattern = Pattern.compile("<.*?>"); //regex que detecta los tags de html, una linea puede tener mas de un tag
        Matcher matcher;

        for (int i = 0; i < lines; i++) { //llenando el arrayList de resultados
            matcher = pattern.matcher(arrayLines[i]);
            while (matcher.find()) {
                if (matcher.group().contains("<a>") || matcher.group().contains("/a>")) {
                    arrayList.add("a");
                } else if (matcher.group().contains("<div") || matcher.group().contains("/div>")) {
                    arrayList.add("div");
                } else if (matcher.group().contains("<p") || matcher.group().contains("/p>")) {
                    arrayList.add("p");
                } else if (matcher.group().contains("<br") || matcher.group().contains("/br>")) {
                    arrayList.add("br");
                } else if (matcher.group().contains("<i>") || matcher.group().contains("/i>")) {
                    arrayList.add("i");
                } else if (matcher.group().contains("<li") || matcher.group().contains("/li>")) {
                    arrayList.add("li");
                } else if (matcher.group().contains("<b") || matcher.group().contains("/b>")) {
                    arrayList.add("b");
                } else if (matcher.group().contains("<span") || matcher.group().contains("/span>")) {
                    arrayList.add("span");
                } else if (matcher.group().contains("<ul") || matcher.group().contains("/ul>")) {
                    arrayList.add("ul");
                } else if (matcher.group().contains("<center") || matcher.group().contains("/center>")) {
                    arrayList.add("center");
                } else if (matcher.group().contains("<img") || matcher.group().contains("/img>")) {
                    arrayList.add("img");
                } else if (matcher.group().contains("<map") || matcher.group().contains("/map>")) {
                    arrayList.add("map");
                } else if (matcher.group().contains("<area") || matcher.group().contains("/area>")) {
                    arrayList.add("area");
                } else if (matcher.group().contains("<h2") || matcher.group().contains("/h2>")) {
                    arrayList.add("h2");
                } else if (matcher.group().contains("<h3") || matcher.group().contains("/h3>")) {
                    arrayList.add("h3");
                }
            }
        }
        String result = "";
        //System.out.println("resultado \n" + arrayList);
        Set<String> conjunto = new TreeSet<String>(arrayList);// ordena alfabeticamente y quita los repetidos
        //System.out.println("sin repeticiones y ordenado alfabeticamente\n" + conjunto);
        for (String tag: conjunto) {
            result = result + tag + ";";

        }

        System.out.println(result.replaceAll(";$", ""));//quita el ; del final

    }
}

/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = scanner.nextInt();
        scanner.nextLine();
        String result = "";

        //arreglo de Strings
        String[] arrayInput = new String[lines];

        //usando regex
        //link
        Pattern patternLink = Pattern.compile("(?<=\\bhref=\").+?\"");
        Matcher matcherLink;
        //name
        Pattern patternName = Pattern.compile("[a-z A-Z\\.0-9]+(?=<\\/a><\\/(p|li|div|b)>)|[a-z A-Z\\.]+(?=<\\/a>)");
        Matcher matcherName;

        //llenar el arreglo
        for (int i = 0; i < lines; i++) {
            arrayInput[i] = scanner.nextLine();
        }

        //evaluar el arreglo y mostrar por pantalla
        for (int i = 0; i < lines; i++) {
            //evaluar con regex
            matcherLink = patternLink.matcher(arrayInput[i]);
            matcherName = patternName.matcher(arrayInput[i]);

            while (matcherLink.find() && matcherName.find()) {
                //construyendo el formato de salida
                result = matcherLink.group().replaceFirst("\"", "");//quitando las comillas del final
                result += "," + matcherName.group().trim();
                System.out.println(result);
            }
        }

    }
}

 */
