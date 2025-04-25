import java.util.Formatter;

public class CustomFormat
{
    public static void formatSO(String string, Object... object)
    {
        Formatter formatter = new Formatter();
        Print.print(formatter.format(string, object));
    }
    public static void formatLnSO(String string, Object... object)
    {
        Formatter formatter = new Formatter();
        Print.printLn(formatter.format(string, object));
    }
}