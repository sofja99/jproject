package edu.jcourse.lesson2.datatypes;

public class LiteralsDemo {
    public static void main(String[] args) {
        long var1=12_345L;

        float f=var1*2.54F;

        int hex=0xFF;
        System.out.println(hex);
        //Single qoutes \'
        System.out.println("It\'s my computer");
        //double qoutes\"
        System.out.println("\"Java \" is a programming language");
        System.out.println("My path is: C:\\devtools");

        //New line \n
        System.out.println("First line.\nSecond line.");

        //Back to one position \b
        System.out.println("Text\b\b\b");
        //Hex \\uxxxx
        System.out.println("\u2764");
        //Tab \t
        System.out.println("Nr\tItem\tComment\t");
        System.out.println("1\tOne\tMy comment\t");
    }
}
