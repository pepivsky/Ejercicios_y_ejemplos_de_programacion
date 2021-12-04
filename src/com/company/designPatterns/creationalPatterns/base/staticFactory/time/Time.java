package com.company.designPatterns.creationalPatterns.base.staticFactory.time;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Scanner;
/* Ejemplo de static factory sin usar constructor para la clase producto
Static factory methods for Time
The normal way to create an instance of a class is to use a public constructor of the class. But there is another technique. A class can provide a public static factory method that returns an instance of the class. An advantage of static factory methods is that they have names that make the code easier to read.

In this problem, you have the class Time containing three fields: hour, minute and second. Implement the following static factory methods of this class:

noon() returns an instance initialized with 12 hours, 0 minutes, and 0 seconds.
midnight() returns an instance initialized with 0 hours, 0 minutes, and 0 seconds.
of(int hour, int minute, int second) returns an instance initialized with passed hour, minute and second if the passed arguments are correct (hour: 0-23, minute: 0-59, seconds: 0-59), otherwise, null.
ofSeconds(long seconds) returns an instance initialized with seconds passed since midnight; as an example, the invocation Time.ofSeconds(500000) must create an instance with 18 hours, 53 minutes and 20 seconds (days are skipped);
As you see, the methods are more readable than the same constructors. If you want to create an instance of Time representing noon, you can write:

Time noon = Time.noon();
Note:

do not change fields of the class Time;
in a real application, it may be better to throw an exception than return null when arguments are incorrect.
You must not read or output something in this problem. Just implement the static factory methods.


Sample Input:
noon

Sample Output:
12 0 0


Sample Input:
midnight

Sample Output:
0 0 0

 */
class Time {

    int hour;
    int minute;
    int second;

    public static Time noon() {
        // write your code here
        Time time = new Time();
        time.hour = 12;
        time.minute = 0;
        time.second = 0;
        return time;
    }

    public static Time midnight() {
        // write your code here
        Time time = new Time();
        time.hour = 0;
        time.minute = 0;
        time.second = 0;
        return time;
    }

    public static Time ofSeconds(long seconds) {
        // write your code here
        Time time = new Time();
        // obtniendo un objeto localDateTime a partir de los segundos transcurridos desde el anio 1970
        LocalDateTime localDateTime = LocalDateTime.ofEpochSecond(seconds, 0, ZoneOffset.UTC);
        time.hour = localDateTime.getHour();
        time.minute = localDateTime.getMinute();
        time.second = localDateTime.getSecond();
        return time;

    }

    public static Time of(int hour, int minute, int second) {
        // write your code here
        Time time = new Time();
        boolean correctHour = hour < 24 && hour >= 0;
        boolean correctMinute = minute < 60 && minute >= 0;
        boolean correctSecond = second < 60 && second >= 0;

        if (correctHour && correctMinute && correctSecond) {
            time.hour = hour;
            time.minute = minute;
            time.second = second;
            return time;
        } else {
            return null;
        }
    }
}

/* Do not change code below */
class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String type = scanner.next();
        Time time = null;

        switch (type) {
            case "noon":
                time = Time.noon();
                break;
            case "midnight":
                time = Time.midnight();
                break;
            case "hms":
                int h = scanner.nextInt();
                int m = scanner.nextInt();
                int s = scanner.nextInt();
                time = Time.of(h, m, s);
                break;
            case "seconds":
                time = Time.ofSeconds(scanner.nextInt());
                break;
            default:
                time = null;
                break;
        }

        if (time == null) {
            System.out.println(time);
        } else {
            System.out.println(String.format("%s %s %s", time.hour, time.minute, time.second));
        }
    }
}