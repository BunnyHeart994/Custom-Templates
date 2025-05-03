public class CustomFormat
{
    public static void cFormat(String string, Object... object) {
        System.out.format(string, object);
    }
    public static void cFormatLn(String string, Object... object) {
    	System.out.format(string, object);
    	Print.printLn("");
        /*Formatter formatter = new Formatter();
        Print.printLn(formatter.format(string, object));*/
    }
}
