package org.assignment2;

public class TableOfPowers {
    public static void main(String[] args){
        //Introduction
        System.out.println("This program prints out the powers of the following numbers");
        System.out.println(" "); //Whitespace

        //Declaring and initializing variables
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;

        //Printing values and their powers
        System.out.println("a     b     pow(a, b)");
        System.out.println(a  + "     " +   b  + "     "  +  (int)Math.pow(a,b));
        System.out.println(b  + "     " +   c  + "     "  +  (int)Math.pow(b,c));
        System.out.println(c  + "     " +   d  + "     "  +  (int)Math.pow(c,d));
        System.out.println(d  + "     " +   e  + "     "  +  (int)Math.pow(d,e));
        System.out.println(e  + "     " +   f  + "     "  +  (int)Math.pow(e,f));
    }
}
