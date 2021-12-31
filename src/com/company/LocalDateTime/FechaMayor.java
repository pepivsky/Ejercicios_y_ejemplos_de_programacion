package com.company.LocalDateTime;

import java.time.LocalDateTime;
import java.util.Scanner;
/* Programa que fusiona dos objetos localdatetime con los valores mayores
LocalDateTime  Merging date-time instances
 Medium
1319 users solved this problem. Latest completion was
about 22 hours ago
.
Implement a method that takes two instances of LocalDateTime class and merges them into one object by choosing the largest value of each component for the target object. Consider the following components: years, months, days of months, hours, minutes and seconds.

Output the resulting LocalDateTime object.

 Report a typo
Sample Input 1:

2018-10-20T22:30
2017-12-30T22:31:45
Sample Output 1:

2018-12-30T22:31:45
 */

public class FechaMayor {

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final LocalDateTime firstDateTime = LocalDateTime.parse(scanner.nextLine());
        final LocalDateTime secondDateTime = LocalDateTime.parse(scanner.nextLine());


        System.out.println(merge(firstDateTime, secondDateTime));
    }
    public static LocalDateTime merge(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        // write your code here
        final int maxYear = Math.max(dateTime1.getYear(), dateTime2.getYear());
        final int maxMonth = Math.max(dateTime1.getMonthValue(), dateTime2.getMonthValue());
        final int maxDay = Math.max(dateTime1.getDayOfMonth(), dateTime2.getDayOfMonth());
        final int maxHour = Math.max(dateTime1.getHour(), dateTime2.getHour());
        final int maxMinute = Math.max(dateTime1.getMinute(), dateTime2.getMinute());
        final int maxSecond = Math.max(dateTime1.getSecond(), dateTime2.getSecond());
        return LocalDateTime.of(maxYear, maxMonth, maxDay, maxHour, maxMinute, maxSecond);
    }

}
