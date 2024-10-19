import java.lang.*;
import java.util.*;

public class Scan
{
    //private static int scannedInt;
    //private static String scannedString;

    //Prints text, scans and returns integer
    public static int integer(String text)
    {
        Print.print(text);
        Scanner s = new Scanner(System.in);
        return Integer.parseInt(s.nextLine());
    }
    //Prints text, scans and returns double:
    public static double floatingPoint(String text)
    {
        Print.print(text);
        Scanner s = new Scanner(System.in);
        return Double.parseDouble(s.nextLine());
    }
    //Prints text, scans and returns String
    public static String string(String text)
    {
        Print.print(text);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public static int integer()
    {
        Scanner s = new Scanner(System.in);
        return Integer.parseInt(s.nextLine());
    }
    public static String string()
    {
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }
    public static char character(String text)
    {
        Print.print(text);
        Scanner s = new Scanner(System.in);
        return s.nextLine().charAt(0);
    }
}
