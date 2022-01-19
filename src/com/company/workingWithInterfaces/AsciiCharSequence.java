package com.company.workingWithInterfaces;

import java.util.*;
/*
Compact strings with AsciiCharSequence
Wow! This problem is kind of tricky. If you're ready to put your thinking cap on, brace yourself and good luck! Otherwise, you can skip it for now and return any time later
Strings in Java implement java.lang.CharSequence interface. Since Java internally uses UTF-16, 2 bytes are required to store each char. At the same time, ASCII encoding allows storing character codes in one byte and includes all Latin letters, digits, and standard special characters. Compared to the standard String class, ASCII-character sequences require half the memory.

Write a class named AsciiCharSequence for storing ASCII-character sequences, that should:

implement the interface java.lang.CharSequence;
have a constructor that takes a byte array;
have methods length, charAt, subSequence, and toString.
You can find the declaration of methods and their behavior in the description of java.lang.CharSequence (JavaDoc or sources).

Carefully check signatures of abstract methods of java.lang.CharSequence interface, especially subSequence method. It accepts 2 integers: start index (inclusive) and end index (!exclusive). The method returns an object of a class that implements java.lang.CharSequence interface. For example, it can be an instance of AsciiCharSequence class.

Note: the testing system will always pass correct input parameters to overridden methods.


 */
class AsciiCharSequence implements CharSequence{

    byte[] bytes; //= "Any String you want".getBytes();

    public AsciiCharSequence(byte[] bytes) {
        this.bytes = bytes;
    }

    // implementation
    @Override
    public int length() {
        return bytes.length;
    }

    @Override
    public char charAt(int index) {
        return (char) bytes[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] subArray = Arrays.copyOfRange(bytes,start, end);
        AsciiCharSequence asciiCharSequence = new AsciiCharSequence(subArray);
        return asciiCharSequence;
    }

    @Override
    public String toString() {
        return new String(bytes);
    }
}
