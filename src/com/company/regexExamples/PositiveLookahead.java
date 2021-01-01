package com.company.regexExamples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
The positive lookahead (?=) asserts regex_1 to be immediately followed by regex_2. The lookahead is excluded from the match. It does not return matches of regex_2. The lookahead only asserts whether a match is possible or not.

 example:
 c(?=o)
 match with: chocolate



Task

You have a test string .
Write a regex that can match all occurrences of o followed immediately by oo in "string".

 */
public class PositiveLookahead {
    public static void main(String[] args) {

        RegexTest tester = new RegexTest();
        tester.checker("o(?=oo)"); //hace match con una o en alguna posicion de la palabra que sea seguida por otras dos "o"

    }
}

class Regex_Test {

    public void checker(String Regex_Pattern){

        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        int Count = 0;
        while(m.find()){
            Count += 1;
        }
        System.out.format("Number of matches : %d",Count);
    }

}
