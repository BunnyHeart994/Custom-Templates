import java.util.Scanner;

public class Scan
{
    private static final Scanner scan = new Scanner(System.in);

    //Methods below prints text, scans input and returns method's type
    public static int integer(String text)
    {
        Print.print(text);
        return Integer.parseInt(scan.nextLine());
    }
    public static short aShort(String text)
    {
        Print.print(text);
        return Short.parseShort(scan.nextLine());
    }
    public static double floatingPoint(String text)
    {
        Print.print(text);
        return Double.parseDouble(scan.nextLine());
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
        return Integer.parseInt(scan.nextLine());
    }
    public static short aShort()
    {
        return Short.parseShort(scan.nextLine());
    }
    public static double floatingPoint()
    {
    	return Double.parseDouble(scan.nextLine());
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
