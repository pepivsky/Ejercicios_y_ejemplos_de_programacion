package com.company.regexExamples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
The negative lookahead (?!) asserts regex_1 not to be immediately followed by regex_2. Lookahead is excluded from the match (do not consume matches of regex_2), but only assert whether a match is possible or not.

 You have a test String .
Write a regex which can match all characters which are not immediately followed by that same character.
 */
public class NegativeLookahead {
    public static void main(String[] args) {

        RegexTest tester = new RegexTest();
        tester.checker("(.)(?!\\1)"); //If String = goooo, then regex should match goooo. Because the first g is not follwed by g and the last o is not followed by o.
        //hace match con el l letra que no sea seguida de si misma
    }
}


class RegexTest {

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
