package com.templates.source;

import java.util.Scanner;

public class Scan
{
    private static final Scanner scan = new Scanner(System.in);

    //Methods below prints text, scans input and returns method's type
    public static int integer(String text)
    {
        Print.print(text);
        return scan.nextInt();
    }
    public static short aShort(String text)
    {
        Print.print(text);
        return scan.nextShort();
    }
    public static double floatingPoint(String text)
    {
        Print.print(text);
        return scan.nextDouble();
    }
    public static String string(String text)
    {
        Print.print(text);
        return scan.nextLine();
    }
    public static char character(String text)
    {
        Print.print(text);
        return scan.nextLine().charAt(0);
    }

    //Overloaded methods below scan input and return method's type
    public static int integer()
    {
        return scan.nextInt();
    }
    public static short aShort()
    {
        return scan.nextShort();
    }
    public static double floatingPoint()
    {
        return scan.nextDouble();
    }
    public static String string()
    {
        return scan.nextLine();
    }
    public static char character()
    {
        return scan.nextLine().charAt(0);
    }
}
